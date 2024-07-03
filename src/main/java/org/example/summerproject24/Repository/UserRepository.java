package org.example.summerproject24.Repository;

import org.example.summerproject24.Models.User.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface UserRepository extends MongoRepository<UserEntity, UUID> {

}