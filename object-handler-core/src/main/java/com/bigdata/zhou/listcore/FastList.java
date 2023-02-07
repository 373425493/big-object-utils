package com.bigdata.zhou.listcore;

import com.bigdata.zhou.utils.ShuffleUtils;

import java.util.ArrayList;

/**
 * @author zhoulanting
 * @title: zhoult
 * @projectName big-object-utils
 * @description: 集合类，继承自
 * @date 2021/11/12 6:17 下午
 */
public class FastList<T> extends ArrayList<T> {
    @Override
    public T get(int index) {
        T obj = super.get(index);
        return obj;
    }

    public T get(T obj){

        return obj;
    }

    private T getRealValueByIndex(Integer index){
        return ShuffleUtils.readObj(index);
    }
}
