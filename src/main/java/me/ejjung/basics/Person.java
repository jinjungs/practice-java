package me.ejjung.basics;


import lombok.Data;

import java.util.UUID;

@Data
public class Person {
    private final UUID id;
    private String name;
    private int age;
}
