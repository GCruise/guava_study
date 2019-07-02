/**
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package com.example.guava.basicutils;

import com.google.common.base.Preconditions;

/**
 * @Description Preconditions类的使用
 * @Author GCruise
 * @Date 2019/7/2 15:47
 * @Version V1.0
 **/
public class PreconditionExample {

    public static void main(String[] args){
        Preconditions.checkArgument(true);

        /**
         * 方法声明（不包括额外参数）	                                             描述	                                                     检查失败时抛出的异常
         * checkArgument(boolean)	                            检查boolean是否为true，用来检查传递给方法的参数。	                            IllegalArgumentException
         * checkNotNull(T)	                                    检查value是否为null，该方法直接返回value，因此可以内嵌使用checkNotNull。	    NullPointerException
         * checkState(boolean)	                                用来检查对象的某些状态。	                                                    IllegalStateException
         * checkElementIndex(int index, int size)	            检查index作为索引值对某个列表、字符串或数组是否有效。index>=0 && index<size *	IndexOutOfBoundsException
         * checkPositionIndex(int index, int size)	            检查index作为位置值对某个列表、字符串或数组是否有效。index>=0 && index<=size *	IndexOutOfBoundsException
         * checkPositionIndexes(int start, int end, int size)	检查[start, end]表示的位置范围对某个列表、字符串或数组是否有效*	                IndexOutOfBoundsException
         */
    }

}
