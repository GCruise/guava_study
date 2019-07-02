/**
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package com.example.guava.basicutils;


import com.example.guava.bean.User;
import com.google.common.base.Objects;

/**
 * @Description Objects类的使用
 * @Author GCruise
 * @Date 2019/7/2 16:04
 * @Version V1.0
 **/
public class ObjectExample {

    public static void main(String[] args) {
        /**
         * 1、equals方法  使用Objects.equal帮助你执行null敏感的equals判断，从而避免抛出NullPointerException
         */
        User userA = new User();
        userA.setId(1L);
        User userB = new User();
        userB.setId(2L);
        Objects.equal(userA, userB);

        /**
         * 2、hashCode方法  Guava的Objects.hashCode(Object...)会对传入的字段序列计算出合理的、顺序敏感的散列值。你可以使用Objects.hashCode(field1, field2, …, fieldn)来代替手动计算散列值。
         */
        Objects.hashCode(userA, userB);

    }
}
