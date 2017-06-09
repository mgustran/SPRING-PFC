package com.skeight.dao;
import java.util.List;
import com.skeight.entity.Article;

/**
 * Created by mgustran on 08/06/2017.
 */
public interface IArticleDAO {
    List<Article> getAllArticles();
    List<Article> getAllArticlesByCategory(String category);
    Article getArticleById(int articleId);
    void addArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(int articleId);
    boolean articleExists(String model, String category);
}
 