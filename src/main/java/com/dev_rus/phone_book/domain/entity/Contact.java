package com.dev_rus.phone_book.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by ruslan on 13.03.17.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @Id
    private Long id;
    @NotNull
    @Min(value = 4)
    private String name;
    @NotNull
    @Min(value = 4)
    private String surname;
    @NotNull
    @Min(value = 4)
    private String patronymic;
    @NotNull
    private String mobilePhone;
    private String homePhone;
    private String address;
    @Email
    private String email;
}
