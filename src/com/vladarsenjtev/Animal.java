package com.vladarsenjtev;

public class Animal {
    private String name;
    private int age;
    private int maxRun;
    private int maxSwim;
    private static int count;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public void run(int let) {
        if (maxRun >= let) {
            System.out.println(name + " пробежал " + let);
        } else System.out.println("Извините, больше проблежать " + name + " не сможет. Максимум " + getMaxRun() + " .");
    }

    public void swim(int let) {
        if (maxSwim == 0) {
            System.out.println("Я не умею плавать :(");
        } else if (maxSwim >= let) {
            System.out.println(name + " проплыл " + let);
        } else {
            System.out.println("Извините, больше проплыть " + name + " не сможет. Максимум " + getMaxRun() + " .");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
