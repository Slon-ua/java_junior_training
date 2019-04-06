
package com.treining.People;

public class Man extends Person implements Movable, Speakable {
    public static int sem = 24;

    public Man(String name, int age) {
        super(name, age);
    }

    public Man() {
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello() {
        System.out.println("hello I am a " + this.name + " my age is " + this.age);
    }

    public String toString() {
        return "Man{name='" + this.name + '\'' + ", age=" + this.age + '}';
    }

    public static void doPSV() {
        System.out.println("Print smf from static funsioN " + sem);
    }

    public void move() {
    }

    public void speak() {
    }
}
