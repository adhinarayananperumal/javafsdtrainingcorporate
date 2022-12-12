package com.icici.sampleprojectspringbootmicroservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icici.sampleprojectspringbootmicroservices.entity.User;


@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {


}
