package com.bigdata.zhou.enums;

/**
 * @author zhoulanting
 * @title: zhoult
 * @projectName big-object-utils
 * @description: 占位枚举，当数据被shuffle到磁盘用该枚举占位
 * @date 2021/11/12 6:36 下午
 */
public enum PlaceHolderEnum {
    /**
     * 被使用了，数据已shuffle到磁盘
     */
    IN_USED(1)
    ;

    PlaceHolderEnum(int value) {
        this.value = value;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static Boolean isUsed(Object obj){
        if(!(obj instanceof PlaceHolderEnum)){
           return false;
        }
        PlaceHolderEnum enumSa=(PlaceHolderEnum)obj;
        return enumSa.equals(IN_USED);
    }

}
