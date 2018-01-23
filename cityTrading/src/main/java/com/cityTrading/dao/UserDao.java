package com.cityTrading.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cityTrading.domain.User;

public interface UserDao extends JpaRepository<User, Long>{

}
