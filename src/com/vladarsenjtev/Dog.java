package com.vladarsenjtev;

public class Dog extends Animal {
    private static int count;

    public Dog(String name, int age) {
        super(name, age);
        this.maxRun = 500;
        this.maxSwim = 10;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
