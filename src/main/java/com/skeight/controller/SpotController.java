package com.skeight.controller;

import com.skeight.entity.Spot;
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
public class SpotController {

    @Autowired
    private ISpotService spotService;
    @GetMapping("spot/{id}")
    public ResponseEntity<Spot> getSpotById(@PathVariable("id") Integer id) {
        Spot spot = spotService.getSpotById(id);
        return new ResponseEntity<Spot>(spot, HttpStatus.OK);
    }
    @GetMapping("spots")
    public ResponseEntity<List<Spot>> getAllSpots() {
        List<Spot> list = spotService.getAllSpots();
        return new ResponseEntity<List<Spot>>(list, HttpStatus.OK);
    }
    @PostMapping("spot")
    public ResponseEntity<Void> addSpot(@RequestBody Spot spot, UriComponentsBuilder builder) {
        boolean flag = spotService.addSpot(spot);
        if (flag == false) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/spot/{id}").buildAndExpand(spot.getSpotId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
    @PutMapping("spot")
    public ResponseEntity<Spot> updateSpot(@RequestBody Spot spot) {
        spotService.updateSpot(spot);
        return new ResponseEntity<Spot>(spot, HttpStatus.OK);
    }
    @DeleteMapping("spot/{id}")
    public ResponseEntity<Void> deleteSpot(@PathVariable("id") Integer id) {
        spotService.deleteSpot(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}