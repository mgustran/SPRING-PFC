package com.skeight.service;

import com.skeight.dao.IArticleDAO;
import com.skeight.dao.ICartArticleDAO;
import com.skeight.entity.CartArticle;
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
    private ICartArticleDAO articleDAO;
    @Override
    public CartArticle getArticleById(int articleId) {
        CartArticle obj = articleDAO.getArticleById(articleId);
        return obj;
    }
    @Override
    public List<CartArticle> getAllArticles(){
        return articleDAO.getAllArticles();
    }
    @Override
    public List<CartArticle> getAllArticlesByCategory(String category){
        return articleDAO.getAllArticlesByCategory(category);
    }
    @Override
    public synchronized boolean addArticle(CartArticle article){
        if (articleDAO.articleExists(article.getModel(), article.getCategory())) {
            return false;
        } else {
            articleDAO.addArticle(article);
            return true;
        }
    }
    @Override
    public void updateArticle(CartArticle article) {
        articleDAO.updateArticle(article);
    }
    @Override
    public void deleteArticle(int articleId) {
        articleDAO.deleteArticle(articleId);
    }
}
