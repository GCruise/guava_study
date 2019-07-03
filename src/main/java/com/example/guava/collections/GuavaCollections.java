/**
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package com.example.guava.collections;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import org.junit.jupiter.api.Test;

/**
 * @Description  guava提供的集合类
 * @Author GCruise
 * @Date 2019/7/3 14:27
 * @Version V1.0
 **/
public class GuavaCollections {

    @Test
    public void multiset(){

        /**
         * Guava提供了一个新集合类型 Multiset，它可以多次添加相等的元素。维基百科从数学角度这样定义Multiset：”集合[set]概念的延伸，
         * 它的元素可以重复出现…与集合[set]相同而与元组[tuple]相反的是，Multiset元素的顺序是无关紧要的：Multiset {a, a, b}和{a, b, a}是相等的”。
         * ——译者注：这里所说的集合[set]是数学上的概念，Multiset继承自JDK中的Collection接口，而不是Set接口，所以包含重复元素并没有违反原有的接口契约。
         */

        Multiset<String> multiset = HashMultiset.create();
        multiset.add("a");
        multiset.add("b");
        multiset.add("c");
        multiset.add("a");

        /**
         * 可以从两个方面看待 Multiset
         * 第一方面：看作没有元素顺序限制的ArrayList<E>
         *
         */

    }

}
