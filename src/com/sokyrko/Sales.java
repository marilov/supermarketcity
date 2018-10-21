package com.sokyrko;

public class Sales implements Profession {
    @Override
    public String describeProfession() {
        return "I am a sales person";
    }

    @Override
    public void displayAllDuties() {
        System.out.println("I like to sell products!");
    }
}
