package com.hillel.artemjev.validator;

import com.hillel.artemjev.validator.exception.ValidationException;


public interface ObjectValidator<T> {
    void validate(T o) throws ValidationException;
}
