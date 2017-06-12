package com.skeight.dao;

import com.skeight.entity.Message;

import java.util.List;

/**
 * Created by mgustran on 12/06/2017.
 */
public interface IMessageDAO {
    List<Message> getAllMessages();
    Message getMessageById(int spotId);
    void addMessage(Message message);
    void deleteMessage(int messaje);
}
