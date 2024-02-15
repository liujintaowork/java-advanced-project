package com.liujintao.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTraversingMessage {
    /**
     * Map 集合的遍历方法
     */

    public static void main(String [] LiuJinTao) {
        // 1、 通过键遍历 Map 集合
        Map<String, String> m = new HashMap<>();
        m.put("张三", "23");
        m.put("李四", "24");
        m.put("王五", "25");
        m.put("赵六", "26");
        Set<String> key = m.keySet();

        // 使用增强 for 遍历集合
        for (String s : key) {
            String valueResult = m.get(s);
            System.out.println(s + " = " + valueResult);
        }

        System.out.println("---------------------------------------------");

        // 使用 Lambda 表达式遍历集合
        m.forEach((Key, Value) -> {
            System.out.println(Key + " = " + Value);
        });

        System.out.println("---------------------------------------------");

        // 使用 迭代器 遍历集合
        Set<Map.Entry<String, String>> entrySet = m.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String Key = entry.getKey();
            String Value = entry.getValue();
            System.out.println(Key + " = " + Value);
        }
    }

}
