package com.bigdata.zhou.utils;

import cn.hutool.core.io.FileUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhoulanting
 * @title: zhoult
 * @projectName big-object-utils
 * @description: TODO
 * @date 2021/11/12 6:42 下午
 */
public class ShuffleUtils {
    private static final Map<String,String> FILE_MAPPING_MAP =new HashMap<>(10240);
    private static final String SPLIT="__";

    public static void writeObj(){

    }

    public static <T> T  readObj(String prefix,Integer index){
        String fileUrl = FILE_MAPPING_MAP.get(prefix + SPLIT + index);
        byte[] bytes = FileUtil.readBytes(fileUrl);
        return null;
    }
}
