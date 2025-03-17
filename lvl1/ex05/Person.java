package lvl1.ex05;

import java.io.*;

class Person implements Serializable {

    private String name;
    private int age;
    private String lastName;

    public Person(String name, int age, String lastName) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }
}
