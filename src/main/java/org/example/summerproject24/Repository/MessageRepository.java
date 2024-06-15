package org.example.summerproject24.Repository;

import org.example.summerproject24.Models.MessageEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface MessageRepository extends MongoRepository<MessageEntity, UUID> {

}