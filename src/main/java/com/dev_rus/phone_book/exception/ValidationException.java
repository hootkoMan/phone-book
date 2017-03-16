package com.dev_rus.phone_book.exception;

import com.dev_rus.phone_book.service.validator.Violation;
import lombok.Getter;

import java.util.List;

/**
 * Created by ruslan on 16.03.17.
 */
@Getter
public class ValidationException extends RuntimeException{
    private List<Violation> violations;

    public ValidationException(String message, List<Violation> violations) {
        super(message);
        this.violations = violations;
    }
}
