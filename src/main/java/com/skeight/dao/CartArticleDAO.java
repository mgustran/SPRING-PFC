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
    public CartArticle getCartArticleById(int id) {
        return entityManager.find(CartArticle.class, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<CartArticle> getAllCartArticles() {
        String hql = "FROM CartArticle as cart ORDER BY cart.id";
        return (List<CartArticle>) entityManager.createQuery(hql).getResultList();
    }
    @Override
    public void addCartArticle(CartArticle cartArticle) {
        entityManager.persist(cartArticle);
    }

    @Override
    public void updateCartArticle(CartArticle cartArticle) {
        CartArticle cartA = getCartArticleById(cartArticle.getId());
        cartA.setArticleId(cartArticle.getArticleId());
        entityManager.flush();
    }

    @Override
    public void deleteCartArticle(int id) {
        entityManager.remove(getCartArticleById(id));
    }

}
