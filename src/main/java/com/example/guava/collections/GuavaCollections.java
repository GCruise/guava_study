/**
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package com.example.guava.collections;

import com.google.common.collect.*;
import org.junit.jupiter.api.Test;

import java.util.Set;

/**
 * @Description  guava提供的集合类
 * @Author GCruise
 * @Date 2019/7/3 14:27
 * @Version V1.0
 **/
public class GuavaCollections {

    public static void main(String[] args){

        /**
         * 一、Guava提供了一个新集合类型 Multiset，它可以多次添加相等的元素。维基百科从数学角度这样定义Multiset：”集合[set]概念的延伸，
         * 它的元素可以重复出现…与集合[set]相同而与元组[tuple]相反的是，Multiset元素的顺序是无关紧要的：Multiset {a, a, b}和{a, b, a}是相等的”。
         * ——译者注：这里所说的集合[set]是数学上的概念，Multiset继承自JDK中的Collection接口，而不是Set接口，所以包含重复元素并没有违反原有的接口契约。
         *
         *
         *  可以从两个方面看待 Multiset
         * 1、看作没有元素顺序限制的ArrayList<E> ，与List一样，可以使用一下方法
         * add(E)      添加单个给定元素
         * iterator()  返回一个迭代器，包含Multiset的所有元素（包括重复的元素）
         * size()      返回所有元素的总个数（包括重复的元素）
         *
         *
         *  2、当把Multiset看作Map<E, Integer>  键为元素，值为计数
         *  count(Object)  返回给定元素的计数。HashMultiset.count的复杂度为O(1)，TreeMultiset.count的复杂度为O(log n)。
         *   ()     返回Set<Multiset.Entry<E>>，和Map的entrySet类似。
         *  elementSet()   返回所有不重复元素的Set<E>，和Map的keySet()类似。
         *  所有Multiset实现的内存消耗随着不重复元素的个数线性增长
         *
         */
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("a");
        multiset.add("b");
        multiset.add("c");
        multiset.add("a");
        multiset.size();
        int count = multiset.count("a");


        /**
         * 二、SortedMultiset
         * SortedMultiset是Multiset 接口的变种，它支持高效地获取指定范围的子集。subMultiset()可以统计出某个范围内数据的size
         */
        SortedMultiset<Integer> sortedMultiset = TreeMultiset.create();
        sortedMultiset.add(1);
        sortedMultiset.add(2);

        /**
         * 三、Multimap
         *  Multimap可以很容易地把一个键映射到多个值。换句话说，Multimap是把键映射到任意多个值的一般方式。替代Map<K, List<V>>或Map<K, Set<V>>这种方式
         *
         *  Multimap.get(key)以集合形式返回键所对应的值视图，即使没有任何对应的值，也会返回空集合。ListMultimap.get(key)返回List，SetMultimap.get(key)返回Set。
         *  put(K, V)	                    添加键到单个值的映射
         *  putAll(K, Iterable<V>)	        依次添加键到多个值的映射
         *  remove(K, V)	                移除键到值的映射；如果有这样的键值并成功移除，返回true。
         *  removeAll(K)	                清除键对应的所有值，返回的集合包含所有之前映射到K的值，但修改这个集合就不会影响Multimap了。
         *  replaceValues(K, Iterable<V>)	清除键对应的所有值，并重新把key关联到Iterable中的每个元素。返回的集合包含所有之前映射到K的值。
         *
         */
        SetMultimap<String, String> setMultimap = HashMultimap.create();
        setMultimap.put("1", "a");
        setMultimap.put("2", "b");
        setMultimap.put("1", "c");
        Set<String> set = setMultimap.get("`1");

        /**
         * 四、BiMap
         * 实现键值对的双向映射需要维护两个单独的map，并保持它们间的同步
         *
         * BiMap<K, V>是特殊的Map：
         * 可以用 inverse()反转BiMap<K, V>的键值映射
         * 保证值是唯一的，因此 values()返回Set而不是普通的Collection
         */

        /**
         * 五、Table
         * 可以实现多个键位做索引
         */

        Table<String, String, Double> weightedGraph = HashBasedTable.create();

        weightedGraph.put("1", "2", 4d);

        weightedGraph.put("2", "3", 20d);

        weightedGraph.put("1", "2", 5d);



        weightedGraph.row("1"); // returns a Map mapping 2 to 4, 3 to 20

        weightedGraph.column("2"); // returns a Map mapping 1 to 4, v1 to 5


    }

}
