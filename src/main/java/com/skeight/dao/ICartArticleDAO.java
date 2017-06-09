package com.skeight.dao;

import com.skeight.entity.CartArticle;
import com.skeight.entity.Spot;

import java.util.List;

/**
 * Created by mgustran on 08/06/2017.
 */
public interface ICartArticleDAO {
    List<CartArticle> getAllArticles();
    List<CartArticle> getAllArticlesByCategory(String category);
    CartArticle getArticleById(int articleId);
    void addArticle(CartArticle article);
    void updateArticle(CartArticle article);
    void deleteArticle(int articleId);
    boolean articleExists(String model, String category);

}
