/**
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package com.example.guava.collections;


import com.google.common.collect.ImmutableSet;
import org.junit.jupiter.api.Test;

import java.util.Set;

/**
 * @Description 不可变集合
 * @Author GCruise
 * @Date 2019/7/3 11:47
 * @Version V1.0
 **/
public class ImmutableCollection {

    @Test
    public void immutable(){
        /**
         * ImmutableSet 不可变集合
         * 优点：
         * 当对象被不可信的库调用时，不可变形式是安全的；
         * 不可变对象被多个线程调用时，不存在竞态条件问题
         * 不可变集合不需要考虑变化，因此可以节省时间和空间。所有不可变的集合都比它们的可变形式有更好的内存利用率（分析和测试细节）；
         * 不可变对象因为有固定不变，可以作为常量来安全使用
         */

        /**
         * 如何使用不可变集合：ImmutableSet的copyOf()方法，of()方法,builder()方法都可创建一个不可变集合
         */
        Set<String> immutableSet = ImmutableSet.of("a", "b", "c");
        Set<String> immutableSet1 = ImmutableSet.copyOf(immutableSet);
        /**
         * 除了ImmutableSet以外，每个可变集合都对应有不可变集合，如List 对应 ImmutableList
         */
    }

}
