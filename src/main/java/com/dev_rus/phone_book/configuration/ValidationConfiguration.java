package com.dev_rus.phone_book.configuration;

import com.dev_rus.phone_book.service.validator.ValidationService;
import com.dev_rus.phone_book.service.validator.ValidationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * Created by ruslan on 16.03.17.
 */
@Configuration
public class ValidationConfiguration {

    @Bean
    public LocalValidatorFactoryBean localValidatorFactoryBean() {
        return new LocalValidatorFactoryBean();
    }

    @Bean
    public ValidationService validationService() {
        return new ValidationServiceImpl(localValidatorFactoryBean().getValidator());
    }
}
