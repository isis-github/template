package com.shishuo.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shishuo.cms.entity.Config;

public interface ConfigDao extends JpaRepository<Config, Long> {

}
