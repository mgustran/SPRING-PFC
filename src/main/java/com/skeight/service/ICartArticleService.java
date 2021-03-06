package com.skeight.service;

import com.skeight.entity.Article;
import com.skeight.entity.CartArticle;
import com.skeight.entity.Spot;

import java.util.List;

/**
 * Created by mgustran on 08/06/2017.
 */
public interface ICartArticleService {
    List<CartArticle> getAllArticles();
    List<CartArticle> getAllArticlesByCategory(String category);
    CartArticle getArticleById(int articleId);
    boolean addArticle(CartArticle article);
    void updateArticle(CartArticle article);
    void deleteArticle(int articleId);
}
