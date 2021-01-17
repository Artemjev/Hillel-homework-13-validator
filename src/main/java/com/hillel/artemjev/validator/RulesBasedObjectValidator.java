package com.hillel.artemjev.validator;

import com.hillel.artemjev.validator.exception.ValidationException;
import com.hillel.artemjev.validator.rule.ValidatorRule;

import java.util.List;


public class RulesBasedObjectValidator<T> implements ObjectValidator<T> {

    private List<ValidatorRule<T>> rules;

    public RulesBasedObjectValidator(List<ValidatorRule<T>> rules) {
        this.rules = rules;
    }

    @Override
    public void validate(T o) throws ValidationException {
        for (ValidatorRule rule : rules) {
            if (!rule.validate(o)) {
                throw new ValidationException(rule.errorMessage());
            }
        }
    }

}
