package com.shishuo.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shishuo.cms.entity.Admin;

public interface AdminDao extends JpaRepository<Admin, Long> {

}