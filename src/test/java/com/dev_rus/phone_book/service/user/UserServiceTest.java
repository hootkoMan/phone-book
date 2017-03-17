package com.dev_rus.phone_book.service.user;

import com.dev_rus.phone_book.domain.dto.NewUserDto;
import com.dev_rus.phone_book.domain.entity.UserEntity;
import com.dev_rus.phone_book.domain.resource.UserResource;
import com.dev_rus.phone_book.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBeans;
import org.springframework.core.convert.ConversionService;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ruslan on 17.03.17.
 */
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class UserServiceTest {
/*    @Mock
    UserRepository userRepository;
    @Mock
    ConversionService conversionService;

    @InjectMocks
    UserService userService = new UserServiceImpl(conversionService, userRepository);

    @Test
    public void testCreateUser() {
        NewUserDto newUserDto = new NewUserDto("log", "pass", "userName");
        UserEntity userEntity = new UserEntity(1L, "log", "pass", "userName", new HashSet<>());
        UserResource userResourceExpected = new UserResource(1L, "log", "userName", new HashSet<>());

        when(conversionService.convert(newUserDto, UserEntity.class))
            .thenReturn(userEntity);
        when(conversionService.convert(userEntity, UserResource.class)).thenReturn(userResourceExpected);

        UserResource userResource = userService.create(newUserDto);

        assertEquals(userResourceExpected.getLogin(), userResource.getLogin());
        assertEquals(userResourceExpected.getId(), userResource.getId());
        assertEquals(userResourceExpected.getFullName(), userResource.getFullName());
    }*/


    private ConversionService conversionService;
    private UserRepository userRepository;
    private UserService userService;

    @Before
    public void startTestMock() {
        conversionService = mock(ConversionService.class);
        userRepository = mock(UserRepository.class);
        userService = new UserServiceImpl(conversionService, userRepository);
    }

    @Test
    public void createUser() {
        NewUserDto newUserDto = new NewUserDto("Logan", "wolf", "Hugh Jackman");
        UserResource userResourceExpected = new UserResource(1L, "Logan", "Hugh Jackman", new HashSet<>());

        when(userService.create(newUserDto)).thenReturn(userResourceExpected);

        UserResource userResourceActual = userService.create(newUserDto);

        assertEquals(userResourceExpected.getId(), userResourceActual.getId());
        assertEquals(userResourceExpected.getFullName(), userResourceActual.getFullName());
        assertEquals(userResourceExpected.getLogin(), userResourceActual.getLogin());
    }

}
