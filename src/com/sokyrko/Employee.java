package com.sokyrko;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Employee extends Person implements Profession{

    private String position;
    private int experience;
    private BigDecimal salary;

    public Employee(String name, int age) {
        super(name, age);
    }

    public Employee(String name, int age, Contact contact) {
        super(name, age, contact);
    }

    public Employee(Person person) {
        super(person);
    }

    @Override
    public String describeProfession() {
        return null;
    }

    @Override
    public void displayAllDuties() {

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
