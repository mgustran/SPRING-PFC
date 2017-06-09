package com.skeight.controller;

import com.skeight.entity.CartArticle;
import com.skeight.service.ICartArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Created by mgustran on 08/06/2017.
 */
@Controller
@RequestMapping("cart")
@CrossOrigin(origins = "http://localhost:63343")
public class CartController {

    @Autowired
    private ICartArticleService articleService;

    @GetMapping("article/{id}")
    public ResponseEntity<CartArticle> getArticleById(@PathVariable("id") Integer id) {
        CartArticle article = articleService.getArticleById(id);
        return new ResponseEntity<CartArticle>(article, HttpStatus.OK);
    }

    @GetMapping("articles")
    public ResponseEntity<List<CartArticle>> getAllArticles() {
        List<CartArticle> list = articleService.getAllArticles();
        return new ResponseEntity<List<CartArticle>>(list, HttpStatus.OK);
    }

    @GetMapping("articles/{category}")
    public ResponseEntity<List<CartArticle>> getAllArticlesByCategory(@PathVariable("category") String category) {
        List<CartArticle> list = articleService.getAllArticlesByCategory(category);
        return new ResponseEntity<List<CartArticle>>(list, HttpStatus.OK);
    }

    @PostMapping("article")
    public ResponseEntity<Void> addArticle(@RequestBody CartArticle article, UriComponentsBuilder builder) {
        boolean flag = articleService.addArticle(article);
        if (flag == false) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Methods", "GET, OPTIONS, POST, HEAD");
        headers.add("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        headers.setLocation(builder.path("/article/{id}").buildAndExpand(article.getArticleId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @PutMapping("article")
    public ResponseEntity<CartArticle> updateArticle(@RequestBody CartArticle article) {
        articleService.updateArticle(article);
        return new ResponseEntity<CartArticle>(article, HttpStatus.OK);
    }

    @DeleteMapping("article/{id}")
    public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
        articleService.deleteArticle(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}