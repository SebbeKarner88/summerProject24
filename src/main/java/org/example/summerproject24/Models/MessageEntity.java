package org.example.summerproject24.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;
import java.util.UUID;

@Document("messages")
@AllArgsConstructor
@Getter
@Setter
public class MessageEntity {
    @MongoId
    UUID messageId;
    LocalDateTime messageTimeStamp;

}
