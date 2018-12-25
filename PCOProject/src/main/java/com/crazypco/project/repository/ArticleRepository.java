package com.crazypco.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crazypco.project.entity.Article;


public interface ArticleRepository extends JpaRepository<Article, Integer> { }
