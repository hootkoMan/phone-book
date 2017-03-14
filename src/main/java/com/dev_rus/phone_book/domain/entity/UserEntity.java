package com.dev_rus.phone_book.domain.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ruslan on 13.03.17.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
@EqualsAndHashCode(exclude = {"password"})
public class UserEntity {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @Pattern(regexp = "[A-za-z]{3,}")
    private String login;
    @NotNull
    @Min(value = 5)
    private String password;
    @NotNull
//    @Min(value = 5)
    @Column(name = "full_name")
    private String fullName;
    @OneToMany
    private Set<ContactEntity> contacts = new HashSet<>();
}
