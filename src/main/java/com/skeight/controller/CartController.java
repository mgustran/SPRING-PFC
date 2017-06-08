package com.skeight.controller;

import com.skeight.entity.CartArticle;
import com.skeight.entity.Spot;
import com.skeight.service.ICartArticleService;
import com.skeight.service.ISpotService;
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
@RequestMapping("user")
@CrossOrigin(origins = "http://localhost:63343")
public class CartController {

    @Autowired
    private ICartArticleService cartArticleService;
    @GetMapping("cartArticle/{id}")
    public ResponseEntity<CartArticle> getCartArticleById(@PathVariable("id") Integer id) {
        CartArticle cartArticle = cartArticleService.getCartArticleById(id);
        return new ResponseEntity<CartArticle>(cartArticle, HttpStatus.OK);
    }

    @GetMapping("cart")
    public ResponseEntity<List<CartArticle>> getAllCArtArticles() {
        List<CartArticle> list = cartArticleService.getAllCartArticles();
        return new ResponseEntity<List<CartArticle>>(list, HttpStatus.OK);
    }
    @PostMapping("cartArticle")
    public ResponseEntity<Void> addCartArticle(@RequestBody CartArticle cartArticle, UriComponentsBuilder builder) {
        boolean flag = cartArticleService.addCartArticle(cartArticle);
        if (flag == false) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/cart/{id}").buildAndExpand(cartArticle.getArticleId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
    @PutMapping("cartArticle")
    public ResponseEntity<CartArticle> updateCartArticle(@RequestBody CartArticle cartArticle) {
        cartArticleService.updateCartArticle(cartArticle);
        return new ResponseEntity<CartArticle>(cartArticle, HttpStatus.OK);
    }
    @DeleteMapping("cartArticle/{id}")
    public ResponseEntity<Void> deleteCartArticle(@PathVariable("id") Integer id) {
        cartArticleService.deleteCartArticle(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
