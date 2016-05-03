package com.shishuo.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shishuo.cms.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

}
