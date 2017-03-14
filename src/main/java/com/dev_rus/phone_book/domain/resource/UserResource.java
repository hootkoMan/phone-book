package com.dev_rus.phone_book.domain.resource;

import com.dev_rus.phone_book.domain.entity.ContactEntity;
import lombok.*;

import java.util.Set;

/**
 * Created by ruslan on 14.03.17.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserResource {
    private Long id;
    private String login;
    private String fullName;
    private Set<ContactEntity> contacts;
}
