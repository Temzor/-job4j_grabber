package ru.vtb.oopstart.homework.animals;

public class Dog {
    String name;
    String color;
    int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String run(int distance) {
        if (distance > 500) {
            return "Собака, не умею так далеко бегать!";
        }
        return "Собака, пробежала " + distance + " м.";
    }

    public String swim(int distance) {
        if (distance > 150) {
            return "Собака, не умею так далеко плавать!";
        }
        return "Собака, проплыла " + distance + " м.";
    }
}
