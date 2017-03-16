package com.dev_rus.phone_book.service.validator;

import lombok.Getter;

import javax.validation.ConstraintViolation;

/**
 * Created by ruslan on 16.03.17.
 */
@Getter
public class Violation {
    private final String propertyPath;
    private final Object invalidValue;
    private final String message;

    public Violation(final ConstraintViolation violation) {
        this.propertyPath = violation.getPropertyPath().toString();
        this.invalidValue = violation.getInvalidValue();
        this.message = violation.getMessage();
    }
}
