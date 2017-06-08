package com.skeight.service;

import com.skeight.entity.CartArticle;
import com.skeight.entity.Spot;

import java.util.List;

/**
 * Created by mgustran on 08/06/2017.
 */
public interface ICartArticleService {
    List<CartArticle> getAllCartArticles();
    CartArticle getCartArticleById(int id);
    boolean addCartArticle(CartArticle cartArticle);
    void updateCartArticle(CartArticle cartArticle);
    void deleteCartArticle(int id);
}
