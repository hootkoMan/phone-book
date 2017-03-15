package com.dev_rus.phone_book.configuration;

import com.dev_rus.phone_book.convertor.NewUserDtoToUserEntity;
import com.dev_rus.phone_book.convertor.UserEntityToUserResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.converter.Converter;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ruslan on 14.03.17.
 */
@Configuration
public class ConverterConfiguration {
    @Bean
    @Primary
    public ConversionServiceFactoryBean conversionServiceFactoryBean() {
        final ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
        final Set<Converter> converters = new HashSet<>();
        converters.add(new NewUserDtoToUserEntity());
        converters.add(new UserEntityToUserResource());
        bean.setConverters(converters);
        return bean;
    }
}
