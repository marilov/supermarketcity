package com.sokyrko;

public class Accountant implements Profession {
    @Override
    public String describeProfession() {
        return "I am an accontant";
    }

    @Override
    public void displayAllDuties() {
        System.out.println("I like to count money");

    }
}
