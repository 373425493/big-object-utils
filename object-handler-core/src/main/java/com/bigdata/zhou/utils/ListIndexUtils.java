package com.bigdata.zhou.utils;

/**
 * @author zhoulanting
 * @title: zhoult
 * @projectName big-object-utils
 * @description: 获取list元素的下标
 * @date 2021/11/15 9:05 上午
 */
public class ListIndexUtils {

    /**
     * 根据指定元素，返回该元素下标
     * 可以理解为map，为什么采用list并标记元素位置而不直接使用map？
     * 因为list可以初始化大小，当元素大小大致确定时，初始化合适大小后
     * 多线程情况下，使用该方法直接set进对应的下标位置
     * 如果使用map，如果有线程需要遍历，会导致并发修改问题
     * @param obj
     * @return
     */
    public static Integer getIndexByIterm(Object obj){

        return null;
    }
}
