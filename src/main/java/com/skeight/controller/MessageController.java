package com.skeight.controller;

import com.skeight.entity.Message;
import com.skeight.entity.Order;
import com.skeight.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Created by mgustran on 12/06/2017.
 */


@Controller
@RequestMapping("messages")
public class MessageController {

    @Autowired
    private IMessageService messageService;
    @GetMapping("message/{id}")
    public ResponseEntity<Message> getMessageById(@PathVariable("id") Integer id) {
        Message message = messageService.getMessageById(id);
        return new ResponseEntity<Message>(message, HttpStatus.OK);
    }
    @GetMapping("messages")
    public ResponseEntity<List<Message>> getAllMessages() {
        List<Message> list = messageService.getAllMessages();
        return new ResponseEntity<List<Message>>(list, HttpStatus.OK);
    }
    @PostMapping("message")
    public ResponseEntity<Void> addMessage(@RequestBody Message message, UriComponentsBuilder builder) {
        boolean flag = messageService.addMessage(message);
        if (flag == false) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/message/{id}").buildAndExpand(message.getMessageId()).toUri());
        headers.add("Access-Control-Allow-Methods", "GET, OPTIONS, POST, HEAD");
        headers.add("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @DeleteMapping("message/{id}")
    public ResponseEntity<Void> deleteMessage(@PathVariable("id") Integer id) {
        messageService.deleteMessage(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}