package com.vladarsenjtev;

public class Dog extends Animal {
    private static int count;

    public Dog(String name, int age) {
        super(name, age);
        setMaxRun(500);
        setMaxSwim(10);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
