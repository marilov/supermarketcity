package com.sokyrko;

public class Person {

    private String name;
    private int age;
    private Contact contact;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Contact contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public Person(Person person) {

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

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", contact=" + contact +
                '}';
    }
}
