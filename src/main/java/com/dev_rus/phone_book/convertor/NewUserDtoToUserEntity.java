package com.dev_rus.phone_book.convertor;

import com.dev_rus.phone_book.domain.dto.NewUserDto;
import com.dev_rus.phone_book.domain.entity.UserEntity;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by ruslan on 14.03.17.
 */
public class NewUserDtoToUserEntity implements Converter<NewUserDto, UserEntity> {
    @Override
    public UserEntity convert(NewUserDto source) {
        UserEntity entity = new UserEntity();
        entity.setLogin(source.getLogin());
        entity.setFullName(source.getFullName());
        entity.setPassword(source.getPassword());
        return entity;
    }
}
