package com.skeight.dao;

import com.skeight.entity.Spot;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by mgustran on 29/05/2017.
 */
@Transactional
@Repository
public class SpotDAO implements ISpotDAO {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Spot getSpotById(int spotId) {
        return entityManager.find(Spot.class, spotId);
    }
    @SuppressWarnings("unchecked")
    @Override
    public List<Spot> getAllSpots() {
        String hql = "FROM Spot as spt ORDER BY spt.spotId";
        return (List<Spot>) entityManager.createQuery(hql).getResultList();
    }
    @Override
    public void addSpot(Spot spot) {
        entityManager.persist(spot);
    }
    @Override
    public void updateSpot(Spot spot) {
        Spot spt = getSpotById(spot.getSpotId());
        spt.setName(spot.getName());
        spt.setAddress(spot.getAddress());
        spt.setLocation(spot.getLocation());
        spt.setGmapsLocation1(spot.getGmapsLocation1());
        spt.setGmapsLocation2(spot.getGmapsLocation2());
        spt.setImg(spot.getImg());
        entityManager.flush();
    }
    @Override
    public void deleteSpot(int spotId) {
        entityManager.remove(getSpotById(spotId));
    }
    @Override
    public boolean spotExists(String name, String location) {
        String hql = "FROM Spot as spt WHERE spt.name = ? and spt.location = ?";
        int count = entityManager.createQuery(hql).setParameter(1, name)
                .setParameter(2, location).getResultList().size();
        return count > 0 ? true : false;
    }
}
