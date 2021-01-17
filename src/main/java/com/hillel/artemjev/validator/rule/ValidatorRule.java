package com.hillel.artemjev.validator.rule;


public interface ValidatorRule<T> {

    boolean validate(T value);

    String errorMessage();
}
