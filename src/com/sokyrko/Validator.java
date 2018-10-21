package com.sokyrko;

public interface Validator <T> {

    boolean validate(T input);
}
