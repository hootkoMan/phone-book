package com.dev_rus.phone_book.domain.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by ruslan on 14.03.17.
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserDto {
    @NotNull
    @Pattern(regexp = "[A-za-z]{3,}")
    private String login;
    @NotNull
    @Min(value = 5)
    private String password;
    @NotNull
    @Min(value = 5)
    @Column(name = "full_name")
    private String fullName;
}
