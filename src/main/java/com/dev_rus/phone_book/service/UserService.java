package com.dev_rus.phone_book.service;

import com.dev_rus.phone_book.domain.dto.NewUserDto;
import com.dev_rus.phone_book.domain.resource.UserResource;
import org.springframework.stereotype.Service;

/**
 * Created by ruslan on 14.03.17.
 */
@Service
public interface UserService {
    UserResource create(NewUserDto newUserDto);
}
