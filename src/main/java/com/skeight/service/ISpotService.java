package com.skeight.service;

import com.skeight.entity.Spot;
import java.util.List;

public interface ISpotService {
    List<Spot> getAllSpots();
    Spot getSpotById(int spotId);
    boolean addSpot(Spot spot);
    void updateSpot(Spot spot);
    void deleteSpot(int spotId);
}