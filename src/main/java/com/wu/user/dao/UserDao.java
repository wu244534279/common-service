package com.wu.user.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wu.user.bean.User;

@Repository
public interface UserDao extends MongoRepository<User, Long>{

}
