package com.skeight.service;

import com.skeight.dao.IMessageDAO;
import com.skeight.entity.Message;
import com.skeight.entity.Spot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mgustran on 12/06/2017.
 */

@Service
public class MessageService implements IMessageService {
    @Autowired
    private IMessageDAO messageDAO;
    @Override
    public Message getMessageById(int spotId) {
        Message obj = messageDAO.getMessageById(spotId);
        return obj;
    }
    @Override
    public List<Message> getAllMessages(){
        return messageDAO.getAllMessages();
    }
    public synchronized boolean addMessage(Message message){
            messageDAO.addMessage(message);
            return true;
    }

    @Override
    public void deleteMessage(int spotId) {
        messageDAO.deleteMessage(spotId);
    }
}