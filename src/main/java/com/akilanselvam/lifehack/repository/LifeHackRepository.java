package com.akilanselvam.lifehack.repository;

import com.akilanselvam.lifehack.model.LifeHack;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LifeHackRepository extends MongoRepository<LifeHack,String> {
}
