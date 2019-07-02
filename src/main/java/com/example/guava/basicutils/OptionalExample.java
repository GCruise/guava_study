package com.example.guava.basicutils;


import com.example.guava.bean.User;
import com.google.common.base.Optional;

/**
 * @Description Optional类的使用
 * @Author GCruise
 * @Date 2019/7/2 15:23
 * @Version V1.0
 **/
public class OptionalExample {

    public static void main(String[] args){
        User user = new User();
        /**
         * 第一种、Optional.of(T) 创建指定引用的Optional实例，为空抛出NullPointerException异常
         */
        Optional<User> optional1 = Optional.of(user);

        /**
         * 第二种、Optional.absent() 创建引用缺失的Optional实例
         */
        Optional<User> optional2 = Optional.absent();

        /**
         * 第三种、Optional.fromNullable(T) 若T不为空，则引用Optional实例，为空，则Optional缺失实例
         */
        Optional<User> optional3 = Optional.fromNullable(user);

        /**
         * 基本方法：
         * boolean isPresent()	如果Optional包含非null的引用（引用存在），返回true
         * T get()	返回Optional所包含的引用，若引用缺失，则抛出java.lang.IllegalStateException
         * T or(T)	返回Optional所包含的引用，若引用缺失，返回指定的值
         * T orNull()	返回Optional所包含的引用，若引用缺失，返回null
         * Set<T> asSet()	返回Optional所包含引用的单例不可变集，如果引用存在，返回一个只有单一元素的集合，如果引用缺失，返回一个空集合。
         */
    }

}
