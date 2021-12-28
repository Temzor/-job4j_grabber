package ru.vtb.oopstart.homework.animals;

public class Tiger extends Animals {
    public Tiger(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String run(int distance) {
        if (distance > 2500) {
            return "Тигр, не умею так далеко бегать!";
        }
        return "Тигр, пробежал " + distance + " м.";
    }

    public String swim(int distance) {
        if (distance > 500) {
            return "Тигр, не умею так далеко плавать!";
        }
        return "Тигр, проплыл " + distance + " м.";
    }
}
