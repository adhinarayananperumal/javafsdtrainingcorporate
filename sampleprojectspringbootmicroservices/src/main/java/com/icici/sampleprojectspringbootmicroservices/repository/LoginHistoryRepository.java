package com.icici.sampleprojectspringbootmicroservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icici.sampleprojectspringbootmicroservices.entity.LoginHistory;

@Repository("loginHistoryRepository")
public interface LoginHistoryRepository  extends JpaRepository<LoginHistory, Integer> {

}
