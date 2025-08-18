package me.ejjung.method;

import java.util.HashMap;
import java.util.Map;

public class Television {
    static String company = "Samsung";
    static String model = "LCD";

    // If it is simple to init, doesn't need static block.
    static String info = company + "_" + model;

    // But if it's to complicated to init, it needs static block.
    static Map<String, String> map;
    static {
        map = new HashMap<>();
        try {
            map.put("key1", "value1");
            map.put("key2", "value2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
