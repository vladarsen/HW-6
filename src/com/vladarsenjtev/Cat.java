package com.vladarsenjtev;

public class Cat extends Animal {
    private static int count;


    public Cat(String name, int age) {
        super(name, age);
        this.maxRun = 200;
        this.maxSwim = 0;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
