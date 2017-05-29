package com.skeight.dao;

import com.skeight.entity.Spot;

import java.util.List;

public interface ISpotDAO {
    List<Spot> getAllSpots();
    Spot getSpotById(int spotId);
    void addSpot(Spot spot);
    void updateSpot(Spot spot);
    void deleteSpot(int spotId);
    boolean spotExists(String name, String location);
}
