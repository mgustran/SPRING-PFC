package com.skeight.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skeight.entity.Article;
@Transactional
@Repository
public class ArticleDAO implements IArticleDAO {
	@PersistenceContext	
	private EntityManager entityManager;	
	@Override
	public Article getArticleById(int articleId) {
		return entityManager.find(Article.class, articleId);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Article> getAllArticles() {
		String hql = "FROM Article as atcl ORDER BY atcl.articleId";
		return (List<Article>) entityManager.createQuery(hql).getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Article> getAllArticlesByCategory(String category) {
		String hql = "FROM Article as atcl WHERE atcl.category = '" + category + "'  ORDER BY atcl.articleId";
		return (List<Article>) entityManager.createQuery(hql).getResultList();
	}
	@Override
	public void addArticle(Article article) {
		entityManager.persist(article);
	}
	@Override
	public void updateArticle(Article article) {
		Article artcl = getArticleById(article.getArticleId());
		artcl.setModel(article.getModel());
		artcl.setMarca(article.getMarca());
		artcl.setCategory(article.getCategory());
		artcl.setPrice(article.getPrice());
		artcl.setDescription(article.getDescription());
		artcl.setTalla(article.getTalla());
		artcl.setImg(article.getImg());
		entityManager.flush();
	}
	@Override
	public void deleteArticle(int articleId) {
		entityManager.remove(getArticleById(articleId));
	}
	@Override
	public boolean articleExists(String model, String category) {
		String hql = "FROM Article as atcl WHERE atcl.model = ? and atcl.category = ?";
		int count = entityManager.createQuery(hql).setParameter(1, model)
		              .setParameter(2, category).getResultList().size();
		return count > 0 ? true : false;
	}
}
