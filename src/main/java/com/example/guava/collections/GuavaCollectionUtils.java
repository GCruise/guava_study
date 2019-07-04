/**
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package com.example.guava.collections;

import com.google.common.base.Function;
import com.google.common.collect.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Description Guava集合工具类
 * @Author GCruise
 * @Date 2019/7/4 20:27
 * @Version V1.0
 **/
public class GuavaCollectionUtils {


    public static void main(String[] args){
        /**
         * 一、静态工厂方法
         * 通过提供的静态方法构造集合对象，初始化时可以指定初始化元素
         */
        List<String> list = Lists.newArrayList();
        Map<Integer, String> map = Maps.newLinkedHashMap();

        List<String> theseElements = Lists.newArrayList("alpha", "beta", "gamma");

        //分割
        List<List<String>> partitionList= Lists.partition(theseElements, 2);
        //反转
        List<String> reverseList = Lists.reverse(theseElements);


        /**
         * Maps相关方法
         * 1、Maps.uniqueIndex(Iterable,Function)通常针对的场景是：有一组对象，它们在某个属性上分别有独一无二的值，而我们希望能够按照这个属性值查找对象
         * ——译者注：这个方法返回一个Map，键为Function返回的属性值，值为Iterable中相应的元素，因此我们可以反复用这个Map进行查找操作。
         */

        Iterable strings = Iterables.concat(Lists.newArrayList("1", "2", "3"));
        ImmutableMap<Integer, String> stringsByIndex = Maps.uniqueIndex(strings, new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return string.length();
            }
        });

        /**
         * 2、Maps.difference(Map, Map)用来比较两个Map以获取所有不同点。该方法返回MapDifference对象，把不同点的维恩图分解为：
         */

        Map<String, Integer> left = ImmutableMap.of("a", 1, "b", 2, "c", 3);
        Map<String, Integer> right = ImmutableMap.of("a", 2, "b", 2, "d", 5);
        MapDifference<String, Integer> difference = Maps.difference(left, right);
        difference.entriesOnlyOnLeft();//只存在于左边项 a-->1   c--->3
        difference.entriesOnlyOnRight();//只存在于右边项 a-->2   d-->5
        difference.entriesInCommon();//两边都存在  b-->2



    }

}
