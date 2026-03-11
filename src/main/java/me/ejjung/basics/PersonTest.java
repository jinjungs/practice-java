package me.ejjung.basics;

import java.util.UUID;

public class PersonTest {
    public static void main(String[] args) {
        Person personWithId = new Person(UUID.randomUUID());
        // Person personWithNoId = new Person();
    }
}
