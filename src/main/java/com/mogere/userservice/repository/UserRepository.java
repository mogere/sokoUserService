package com.mogere.userservice.repository;

import com.mogere.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User save(User newUser);

    User findUserById(Long userId);

}
