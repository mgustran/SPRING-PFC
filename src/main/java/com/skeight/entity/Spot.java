package com.skeight.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mgustran on 29/05/2017.
 */

@Entity
@Table(name="spots")
public class Spot implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "spot_id")
    private int spotId;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "location")
    private String location;
    @Column(name = "gmaps_location_1")
    private String gmapsLocation1;
    @Column(name = "gmaps_location_2")
    private String gmapsLocation2;
    @Column(name = "img")
    private String img;

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGmapsLocation1() {
        return gmapsLocation1;
    }

    public void setGmapsLocation1(String gmapsLocation1) {
        this.gmapsLocation1 = gmapsLocation1;
    }

    public String getGmapsLocation2() {
        return gmapsLocation2;
    }

    public void setGmapsLocation2(String gmapsLocation2) {
        this.gmapsLocation2 = gmapsLocation2;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}