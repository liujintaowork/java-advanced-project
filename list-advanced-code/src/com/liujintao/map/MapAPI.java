package com.liujintao.map;

import java.util.HashMap;
import java.util.Map;

public class MapAPI {
    public static void main (String[] LiuJinTao) {
        // 创建双列集合
        Map<String, String> m = new HashMap<>();

        // 1、Map 接口中的 put 方法
                // put 方法的细节：
                        // - 在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合中，方法返回值为 null
                        // - 再添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回
        m.put("张三", "二十三");
        m.put("李四", "二十四");
        m.put("王五", "二十五");
        m.put("张三", "23");
        System.out.println(m); // 李四=二十四, 张三=23, 王五=二十五} Map集合去重 → 后来者覆盖前者

        // 2、Map 接口中的 remove 方法
        String removeResult= m.remove("张三");
        System.out.println(removeResult);   // 23 返回值为被删除指定的键的值

        // 3、Map 接口中的 clear 方法
        // m.clear();
        // System.out.println(m);              // {} 返回一个空的集合



        // 4、Map 接口中的 containsKey 方法
        boolean isContainsKey = m.containsKey("李四");
        System.out.println(isContainsKey);      // true  集合中包含了李四


        // 5、 Map 接口中的 containsValue 方法
        boolean  isContainsValue= m.containsValue("二十三");
        System.out.println(isContainsValue);    // false   集合中不包含二十三这个值的键值对对象

        // 6、Map 接口中的 isEmpty 方法
        boolean isEmptyResult = m.isEmpty();
        System.out.println(isEmptyResult);      // false   集合是否为空


        // 7、Map 集合中的 size 方法
        int sizeResult = m.size();
        System.out.println(sizeResult);         // 2   返回集合的长度大小

    }
}
