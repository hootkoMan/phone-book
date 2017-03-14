package com.dev_rus.phone_book.repository;

import com.dev_rus.phone_book.domain.entity.UserEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ruslan on 14.03.17.
 */
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long>{
}
