package com.skeight.client;

import java.net.URI;

import com.skeight.entity.Spot;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;

import com.skeight.entity.Article;

@CrossOrigin(origins = "http://localhost:8082")

public class RestClientUtil {
    @Test
    public void getArticleByIdDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:8080/data/article/{id}";
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
        ResponseEntity<Article> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Article.class, 22);
        Article article = responseEntity.getBody();
        System.out.println("Id:"+article.getArticleId()+", Title:"+article.getModel()
                 +", Category:"+article.getCategory());      
    }
    @Test
	public void getAllArticlesDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:8080/data/articles";
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
        ResponseEntity<Article[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Article[].class);
        Article[] articles = responseEntity.getBody();
        for(Article article : articles) {
              System.out.println("Id:"+article.getArticleId()+", Title:"+article.getModel()
                      +", Category: "+article.getCategory());
        }
    }
    @Test
    public void addSpotDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:8080/spots/spot";
	    Spot spot = new Spot();
	    spot.setName("SkateABC");
	    spot.setAddress("Calle Almost 123");
        spot.setLocation("Palma de Mallorca");
        spot.setGmapsLocation1(2.99654987);
	    spot.setGmapsLocation2(3.9876548);
	    spot.setImg("../img/articles/tablas/almost/3.jpg");
        HttpEntity<Spot> requestEntity = new HttpEntity<Spot>(spot, headers);
        URI uri = restTemplate.postForLocation(url, requestEntity);
        System.out.println(uri.getPath());    	
    }
    @Test
    public void updateSpotDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:8080/spots/spot";
	    Spot spot = new Spot();
	    spot.setSpotId(4);
	    spot.setName("Chiringuito Playero");
	    spot.setLocation("A Saber");
        HttpEntity<Spot> requestEntity = new HttpEntity<Spot>(spot, headers);
        restTemplate.put(url, requestEntity);
    }
    @Test
    public void deleteArticleDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:8080/user/article/{id}";
        HttpEntity<Article> requestEntity = new HttpEntity<Article>(headers);
        restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, Void.class, 4);        
    }
    public static void main(String args[]) {
    	RestClientUtil util = new RestClientUtil();
        util.getArticleByIdDemo();
    	util.getAllArticlesDemo();
    	util.addSpotDemo();
    	//util.updateArticleDemo();
    	//util.deleteArticleDemo();
    }    
}
