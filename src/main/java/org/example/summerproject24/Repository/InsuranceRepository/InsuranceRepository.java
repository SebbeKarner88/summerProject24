package org.example.summerproject24.Repository.InsuranceRepository;

import org.example.summerproject24.Models.Insurance.InsuranceEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface InsuranceRepository extends MongoRepository<InsuranceEntity, UUID> {

}