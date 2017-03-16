package com.dev_rus.phone_book.domain.dto;

import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by ruslan on 14.03.17.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class NewUserDto {
    @NotNull
    @Pattern(regexp = "[A-Za-z]{3,}")
    private String login;
    @NotNull
    @Size(min = 5)
    private String password;
    @NotNull
    @Column(name = "full_name")
    @Size(min = 5)
    private String fullName;
}
