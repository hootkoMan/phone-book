package com.dev_rus.phone_book.service.validator;

import org.springframework.stereotype.Service;

/**
 * Created by ruslan on 16.03.17.
 */
@Service
public interface ValidationService {
    <T> void validate(final T object);
}
