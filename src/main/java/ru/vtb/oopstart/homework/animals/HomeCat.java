package ru.vtb.oopstart.homework.animals;

public class HomeCat {
    String name;
    String color;
    int age;

    public HomeCat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String run(int distance) {
        if (distance > 200) {
            return "Домашний кот, не умею так далеко бегать!";
        }
        return "Домашний кот, пробежал " + distance + " м.";
    }

    public String swim(int distance) {
        return "Домашний кот, не умею плавать!";
    }
}
