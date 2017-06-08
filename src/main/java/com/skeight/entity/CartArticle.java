package com.skeight.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mgustran on 08/06/2017.
 */

@Entity
@Table(name="cart")
public class CartArticle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "article_id")
    private String articleId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }
}
