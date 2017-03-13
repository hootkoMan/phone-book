package com.dev_rus.phone_book.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * Created by ruslan on 13.03.17.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private Long id;
    @NotNull
    @Pattern(regexp = "[A-za-z]{3,}")
    private String login;
    @NotNull
    @Min(value = 5)
    private String password;
    @NotNull
    @Min(value = 5)
    private String fullName;
    @OneToMany
    private List<Contact> contacts;
}
