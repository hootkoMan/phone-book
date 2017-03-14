package com.dev_rus.phone_book.domain.entity;

import lombok.*;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by ruslan on 13.03.17.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contact")
@EqualsAndHashCode
public class ContactEntity {
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
    @Column(name = "mobile_phone")
    private String mobilePhone;
    @Column(name = "home_phone")
    private String homePhone;
    private String address;
    @Email
    private String email;
}
