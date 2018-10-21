package com.sokyrko;

public class SupermarketPersonValidator implements Validator<Person> {
    @Override
    public boolean validate(Person person) {
        return person != null && (person.getAge() < 18 || person.getContact() == null);
    }
}
