package com.skeight.dao;

import com.skeight.entity.Message;
import com.skeight.entity.Spot;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by mgustran on 12/06/2017.
 */

@Transactional
@Repository
public class MessageDAO implements IMessageDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Message getMessageById(int messageId) {
        return entityManager.find(Message.class, messageId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Message> getAllMessages() {
        String hql = "FROM Message as spt ORDER BY spt.messageId";
        return (List<Message>) entityManager.createQuery(hql).getResultList();
    }
    @Override
    public void addMessage(Message message) {
        entityManager.persist(message);
    }

    @Override
    public void deleteMessage(int messageId) {
        entityManager.remove(getMessageById(messageId));
    }

}
