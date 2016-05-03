package com.shishuo.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shishuo.cms.entity.Article;

public interface ArticleDao extends JpaRepository<Article, Long> {

}
