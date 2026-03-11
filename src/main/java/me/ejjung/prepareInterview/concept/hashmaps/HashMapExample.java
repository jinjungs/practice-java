package me.ejjung.prepareInterview.concept.hashmaps;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<HashAndKey, String> map = new HashMap<>(99);

        System.out.println("Storing key for k1");
        map.put(new HashAndKey(1, "Andrew"), "alpha");

        System.out.println("Storing key for k2");
        map.put(new HashAndKey(1, "Betty"), "bravo");

        System.out.println("Storing key for k3");
        map.put(new HashAndKey(1, "Claire"), "charlie");

        System.out.println("Storing key for k4");
        HashAndKey darcy = new HashAndKey(1, "Darcy");
        map.put(darcy, "devo");

        System.out.println("Now doing a get. \n\n");
        System.out.println(map.get(darcy));

    }
}
