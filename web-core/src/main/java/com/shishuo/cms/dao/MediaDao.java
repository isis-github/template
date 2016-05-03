package com.shishuo.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shishuo.cms.entity.Media;

public interface MediaDao extends JpaRepository<Media, Long> {

}
