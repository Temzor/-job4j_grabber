package ru.vtb.oopstart.homework.animals;

public class Animals {
    public static void main(String[] args) {
        Dog  beethoven = new Dog("Бетховен", "коричневый", 4);
        Dog  kisa = new Dog("Мурзик", "серый", 2);
        Dog  sherkhan = new Dog("Шерхан", "Оранджевый", 12);

        System.out.println(beethoven.run(200));
        System.out.println(beethoven.run(1000));
        System.out.println(beethoven.swim(200));
        System.out.println(beethoven.swim(2000));

        System.out.println(kisa.run(100));
        System.out.println(kisa.run(1000));
        System.out.println(kisa.swim(200));

        System.out.println(sherkhan.run(200));
        System.out.println(sherkhan.run(10000));
        System.out.println(sherkhan.swim(200));
        System.out.println(sherkhan.swim(2000));
    }
}
