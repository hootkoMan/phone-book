package com.dev_rus.phone_book.service.validator;

import com.dev_rus.phone_book.exception.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by ruslan on 16.03.17.
 */
@Service
public class ValidationServiceImpl implements ValidationService {
    private final Validator validator;

    @Autowired
    public ValidationServiceImpl(final Validator validator) {
        this.validator = validator;
    }

    @Override
    public <T> void validate(final T object) {
        toViolations(validator.validate(object))
            .ifPresent(violations -> {
                throw new ValidationException(getMessage(object, violations), violations);
            });
    }

    private String getMessage(Object object, List<Violation> violations) {
        return "Error of validation in '" + object.getClass().getCanonicalName() + "'. \n" +
            violationsMessage(violations);
    }

    private String violationsMessage(List<Violation> violations) {
        StringBuilder builder = new StringBuilder();
        violations.forEach(v -> builder
            .append(v.getPropertyPath())
            .append(": ")
            .append(v.getMessage())
            .append("\n")
        );
        return builder.toString();
    }

    private <T> Optional<List<Violation>> toViolations(final Set<ConstraintViolation<T>> violations) {
        return violations.isEmpty()
            ? Optional.empty()
            : Optional.of(violations.stream()
            .map(Violation::new)
            .collect(Collectors.toList()));
    }
}
