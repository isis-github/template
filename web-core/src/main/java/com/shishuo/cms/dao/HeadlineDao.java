package com.shishuo.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shishuo.cms.entity.Headline;

public interface HeadlineDao extends JpaRepository<Headline, Long> {

}
