/**
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package com.example.guava.basicutils;

import com.example.guava.bean.User;
import com.google.common.base.Throwables;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @Description Throwables
 * @Author GCruise
 * @Date 2019/7/2 19:12
 * @Version V1.0
 **/
public class ThrowablesExample {

    public static void main(String[] args) throws Exception{
        /**
         * 有时候，你会想把捕获到的异常再次抛出。这种情况通常发生在Error或RuntimeException被捕获的时候，你没想捕获它们，但是声明捕获Throwable和Exception的时候，
         * 也包括了了Error或RuntimeException。Guava提供了若干方法，来判断异常类型并且重新传播异常
         *
         *
         */
        try {
            doSomeThing();
        }catch (Throwable t){
            Throwables.throwIfInstanceOf(t, IOException.class);
            Throwables.throwIfInstanceOf(t, SQLException.class);
        }

        /**
         *
         RuntimeException   propagate(Throwable)	如果Throwable是Error或RuntimeException，直接抛出；否则把Throwable包装成RuntimeException抛出。返回类型是RuntimeException，所以你可以像上面说的那样写成throw Throwables.propagate(t)，Java编译器会意识到这行代码保证抛出异常。
         void throwIfInstanceOf( Throwable, Class<X extends   Exception>) throws X	Throwable类型为X才抛出
         void throwIfUnchecked( Throwable)	Throwable类型为Error或RuntimeException才抛出
         */
    }

    public static void doSomeThing(){

    }

}
