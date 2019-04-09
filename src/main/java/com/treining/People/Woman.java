
package com.treining.People;

public class Woman extends Person {
    public Woman(String name, int age) {
        super(name, age);
    }

    public Woman() {
    }

    public void sayHello() {
        System.out.println("hello I am a " + this.name);
    }
}
