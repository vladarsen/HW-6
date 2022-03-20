package com.vladarsenjtev;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Rudik", 2);
        Dog dog = new Dog("Bobik", 5);

        cat.run(150);
        cat.swim(10);
        dog.run(700);
        dog.swim(9);

        System.out.println();
        System.out.println("Всего котов создано: " + (Cat.getCount()));
        System.out.println("Всего собак создано: " + (Dog.getCount()));
        System.out.println("Всего животных создано: "+ (Animal.getCount()));
    }
}