/**
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package com.example.guava.basicutils;

import com.google.common.collect.Ordering;

/**
 * @Description Ordering
 * @Author GCruise
 * @Date 2019/7/2 17:30
 * @Version V1.0
 **/
public class OrderingExample {

    public static void main(String[] args){
        /**
         * Ordering实例就是一个特殊的Comparator实例。Ordering把很多基于Comparator的静态方法（如Collections.max）包装为自己的实例方法（非静态方法），并且提供了链式调用方法，来定制和增强现有的比较器。
         */
        /**
         * 创建排序器的三个静态方法
         * natural()	对可排序类型做自然排序，如数字按大小，日期按先后排序
         * usingToString()	按对象的字符串形式做字典排序[lexicographical ordering]
         * from(Comparator)	把给定的Comparator转化为排序器
         */
        Ordering<String> stringOrdering = Ordering.natural();

        /**
         * 链式调用方法：通过链式调用，可以由给定的排序器衍生出其它排序器
         reverse()	获取语义相反的排序器
         nullsFirst()	使用当前排序器，但额外把null值排到最前面。
         nullsLast()	使用当前排序器，但额外把null值排到最后面。
         compound(Comparator)	合成另一个比较器，以处理当前排序器中的相等情况。
         lexicographical()	基于处理类型T的排序器，返回该类型的可迭代对象Iterable<T>的排序器。
         onResultOf(Function)	对集合中元素调用Function，再按返回值用当前排序器排序。
         */
    }

}
