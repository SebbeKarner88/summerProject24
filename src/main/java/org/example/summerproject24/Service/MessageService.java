package org.example.summerproject24.Service;

import org.example.summerproject24.Models.MessageEntity;
import org.example.summerproject24.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    public void addMessage() {
        MessageEntity message = new MessageEntity(UUID.randomUUID(), LocalDateTime.now());
        messageRepository.save(message);
    }

}
