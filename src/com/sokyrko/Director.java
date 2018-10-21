package com.sokyrko;

public class Director implements Profession {
    @Override
    public String describeProfession() {
        return "I am a director";
    }

    @Override
    public void displayAllDuties() {
        System.out.println("I run the company!");
    }
}
