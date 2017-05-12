package com.fund.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.fund.app.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User,String> ,QueryDslPredicateExecutor<User>  {

  User findById(String id);
 // List<User> findByState(String state);
  List<User> findByFirstName(String firstName);
  List<User> findByAddressState(String state);
  List<User> findByLastName(String state);
@Query(value ="{address.state:?0}")
 List<User> findbyc(String state);
 

}
