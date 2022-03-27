package com.vladarsenjtev;

public class Cat extends Animal {
    private static int count;


    public Cat(String name, int age) {
        super(name, age);
        setMaxRun(200);
        setMaxSwim(0);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
