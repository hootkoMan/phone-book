package com.dev_rus.phone_book.convertor;

import com.dev_rus.phone_book.domain.dto.UserDto;
import com.dev_rus.phone_book.domain.entity.UserEntity;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by ruslan on 14.03.17.
 */
public class UserDtoToUserEntity implements Converter<UserDto, UserEntity> {
    @Override
    public UserEntity convert(UserDto source) {
        UserEntity entity = new UserEntity();
        entity.setLogin(source.getLogin());
        entity.setFullName(source.getFullName());
        entity.setPassword(source.getPassword());
        return entity;
    }
}
