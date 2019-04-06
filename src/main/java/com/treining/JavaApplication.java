package com.treining;

import com.treining.People.Man;
import com.treining.People.Person;
import com.treining.People.Woman;

public class JavaApplication {
    public JavaApplication() {
    }

    public static void main(String[] args) {
        System.out.println("test1");
        System.out.println("test2");

        Man Ivan = new Man();
        Man Igor = new Man("Igor", 21);
        Woman Irina = new Woman("Irina", 19);

        Person person = new Person() {
            public void sayHello() {
                System.out.println("test_3");
            }
        };

        person.sayHello();

        Ivan.sayHello();
        Ivan.setName("Dima");
        Ivan.setAge(31);
        Ivan.sayHello();
        Irina.sayHello();
        Igor.sayHello();

        System.out.println(Ivan);
        System.out.println(Igor);

        Man.doPSV();

        System.out.println("root");
        System.out.println("1234");
    }
}
