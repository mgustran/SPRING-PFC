package com.skeight.service;

import com.skeight.dao.ICartArticleDAO;
import com.skeight.entity.CartArticle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mgustran on 08/06/2017.
 */
@Service
public class CartArticleService implements ICartArticleService {
    
    @Autowired
    private ICartArticleDAO cartDAO;

    @Override
    public CartArticle getCartArticleById(int id) {
        CartArticle obj = cartDAO.getCartArticleById(id);
        return obj;
    }

    @Override
    public List<CartArticle> getAllCartArticles() {
        return cartDAO.getAllCartArticles();
    }

    @Override
    public synchronized boolean addCartArticle(CartArticle cartArticle) {
        cartDAO.addCartArticle(cartArticle);
        return true;
    }

    @Override
    public void updateCartArticle(CartArticle cartArticle) {
        cartDAO.updateCartArticle(cartArticle);
    }

    @Override
    public void deleteCartArticle(int id) {
        cartDAO.deleteCartArticle(id);
    }
}