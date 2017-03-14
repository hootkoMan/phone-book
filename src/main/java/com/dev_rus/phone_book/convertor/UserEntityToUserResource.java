package com.dev_rus.phone_book.convertor;

import com.dev_rus.phone_book.domain.entity.UserEntity;
import com.dev_rus.phone_book.domain.resource.UserResource;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by ruslan on 14.03.17.
 */
public class UserEntityToUserResource implements Converter<UserEntity, UserResource> {
    @Override
    public UserResource convert(UserEntity entity) {
        UserResource resource = new UserResource();
        resource.setLogin(entity.getLogin());
        resource.setFullName(entity.getFullName());
        resource.setId(entity.getId());
        resource.setContacts(entity.getContacts());
        return resource;
    }
}
