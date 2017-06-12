package com.skeight.service;

import com.skeight.entity.Message;
import com.skeight.entity.Spot;

import java.util.List;

/**
 * Created by mgustran on 12/06/2017.
 */
public interface IMessageService {
    List<Message> getAllMessages();
    Message getMessageById(int message);
    boolean addMessage(Message message);
    void deleteMessage(int messageId);
}
