package com.dev_rus.phone_book.service;

import com.dev_rus.phone_book.domain.dto.UserDto;
import com.dev_rus.phone_book.domain.entity.UserEntity;
import com.dev_rus.phone_book.domain.resource.UserResource;
import com.dev_rus.phone_book.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ruslan on 14.03.17.
 */
@Service
public class UserServiceImpl implements UserService {
    private final ConversionService conversionService;
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(final ConversionService conversionService,
                           final UserRepository userRepository) {
        this.conversionService = conversionService;
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public UserResource create(UserDto userDto) {
        final UserEntity entity = conversionService.convert(userDto, UserEntity.class);
        userRepository.save(entity);
        return conversionService.convert(entity, UserResource.class);
    }
}
