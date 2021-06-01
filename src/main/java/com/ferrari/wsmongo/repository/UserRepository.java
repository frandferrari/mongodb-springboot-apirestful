package com.ferrari.wsmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ferrari.wsmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	

}
