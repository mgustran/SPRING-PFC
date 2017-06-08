package com.skeight.service;

import java.util.List;

import com.skeight.entity.Article;

public interface IArticleService {
     List<Article> getAllArticles();
     List<Article> getAllArticlesByCategory(String category);
     Article getArticleById(int articleId);
     boolean addArticle(Article article);
     void updateArticle(Article article);
     void deleteArticle(int articleId);
}
