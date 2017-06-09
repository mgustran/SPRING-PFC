package com.skeight.dao;

import com.skeight.entity.CartArticle;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by mgustran on 08/06/2017.
 */
@Transactional
@Repository
public class CartArticleDAO implements ICartArticleDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public CartArticle getArticleById(int articleId) {
        return entityManager.find(CartArticle.class, articleId);
    }
    @SuppressWarnings("unchecked")
    @Override
    public List<CartArticle> getAllArticles() {
        String hql = "FROM CartArticle as atcl ORDER BY atcl.articleId";
        return (List<CartArticle>) entityManager.createQuery(hql).getResultList();
    }
    @SuppressWarnings("unchecked")
    @Override
    public List<CartArticle> getAllArticlesByCategory(String category) {
        String hql = "FROM CartArticle as atcl WHERE atcl.category = '" + category + "'  ORDER BY atcl.articleId";
        return (List<CartArticle>) entityManager.createQuery(hql).getResultList();
    }
    @Override
    public void addArticle(CartArticle article) {
        entityManager.persist(article);
    }
    @Override
    public void updateArticle(CartArticle article) {
        CartArticle artcl = getArticleById(article.getArticleId());
        artcl.setModel(article.getModel());
        artcl.setMarca(article.getMarca());
        artcl.setCategory(article.getCategory());
        artcl.setPrice(article.getPrice());
        artcl.setDescription(article.getDescription());
        artcl.setTalla(article.getTalla());
        artcl.setImg(article.getImg());
        artcl.setQuantity(article.getQuantity());
        entityManager.flush();
    }
    @Override
    public void deleteArticle(int articleId) {
        entityManager.remove(getArticleById(articleId));
    }
    @Override
    public boolean articleExists(String model, String category) {
        String hql = "FROM CartArticle as atcl WHERE atcl.model = ? and atcl.category = ?";
        int count = entityManager.createQuery(hql).setParameter(1, model)
                .setParameter(2, category).getResultList().size();
        return count > 0 ? true : false;
    }
}
