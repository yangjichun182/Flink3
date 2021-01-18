package org.example.javabasic.syntax;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author : chunji.yang
 * @date : 2021-01-18 20:48
 * @remark : Java中的map集合遍历的四种方法
 */
public class SyntaxDemo0001 {
    public static void main(String[] args) {
        //scanMap01();
        //scanMap02();
        //scanMap03();
        scanMap04();
    }

    /**
     * <pre>
     * 功能：在for循环中使用entries实现Map的遍历
     *      最常见也是大多数情况下用的最多的，一般在键值对都需要使用
     * </pre>
     *
     * @date : 2021-01-18 20:48
     */
    public static void scanMap01() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("熊大", "棕色");
        map.put("熊二", "黄色");
        map.put("001", "Lucy");

        Set<Map.Entry<String, String>> entries = map.entrySet();//获取entries
        for (Map.Entry<String, String> entry : entries) {
            String mapKey = entry.getKey(); //获取到key值
            String mapValue = entry.getValue();  //获取value
            System.out.println(mapKey + ":" + mapValue);
        }
    }

    /**
     * <pre>
     * 功能：在for循环中遍历key或者values，一般适用于只需要map中的key或者value时使用，在性能上比使用entrySet较好；
     * </pre>
     *
     * @date : 2021-01-18 20:58
     */
    public static void scanMap02() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("熊大", "棕色");
        map.put("熊二", "黄色");
        //key
        for (String key : map.keySet()) {
            System.out.println("key=" + key);
        }
        System.out.println("======================");
        //value
        for (String value : map.values()) {
            System.out.println("value:" + value);
        }
    }


    /**
     * <pre>
     *     功能：通过Iterator遍历Map集合
     * </pre>
     *
     * @date : 2021-01-18 21:15
     */
    public static void scanMap03() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("熊大", "棕色");
        map.put("熊二", "黄色");

        Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }

    /**
     * <pre>
     *     功能：通过键找值遍历，这种方式的效率比较低，因为本身从键取值是耗时的操作；
     * </pre>
     *
     * @date : 2021-01-18 21:16
     */
    public static void scanMap04() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("熊大", "棕色");
        map.put("熊二", "黄色");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }


    }
}
