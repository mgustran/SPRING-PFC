package com.skeight.service;

import com.skeight.dao.ISpotDAO;
import com.skeight.entity.Spot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpotService implements ISpotService {
    @Autowired
    private ISpotDAO spotDAO;
    @Override
    public Spot getSpotById(int spotId) {
        Spot obj = spotDAO.getSpotById(spotId);
        return obj;
    }
    @Override
    public List<Spot> getAllSpots(){
        return spotDAO.getAllSpots();
    }
    @Override
    public synchronized boolean addSpot(Spot spot){
        if (spotDAO.spotExists(spot.getName(), spot.getLocation())) {
            return false;
        } else {
            spotDAO.addSpot(spot);
            return true;
        }
    }
    @Override
    public void updateSpot(Spot spot) {
        spotDAO.updateSpot(spot);
    }
    @Override
    public void deleteSpot(int spotId) {
        spotDAO.deleteSpot(spotId);
    }
}