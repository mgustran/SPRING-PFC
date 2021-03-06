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
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="article_id")
    private int articleId;
    @Column(name="model")
    private String model;
    @Column(name="marca")
    private String marca;
    @Column(name="category")
    private String category;
    @Column(name="price")
    private double price;
    @Column(name="description")
    private String description;
    @Column(name="discount")
    private String discount;
    @Column(name="talla")
    private String talla;
    @Column(name="img")
    private String img;
    @Column(name="quantity")
    private int quantity;
    public int getArticleId() {
        return articleId;
    }
    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDiscount() {
        return discount;
    }
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
