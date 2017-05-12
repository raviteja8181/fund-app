package com.fund.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fund.app.domain.QUser;
import com.fund.app.domain.User;
import com.fund.app.repository.UserRepository;
import com.querydsl.core.types.dsl.BooleanExpression;

@RestController
@RequestMapping("/users")
public class UserController {
  
  
  private UserRepository userRepo;
    
  public UserController(UserRepository userRepo){
    this.userRepo=userRepo;
  }
  
  

  @GetMapping("/getAll")
  public List<User> getAll(){
   List<User> users = this.userRepo.findAll();
   return users;
}
  @PutMapping(value ="/insert/user")
  public void insert(@RequestBody User user){
    this.userRepo.insert(user);
  }
  
  @PostMapping
  public void update(@RequestBody User user){
    this.userRepo.save(user);
  }
  
  @DeleteMapping("/{id}")
  public void delete(@PathVariable("id") String id){
    this.userRepo.delete(id); 
  }
  
  @GetMapping("/{id}")
  public User getById(@PathVariable("id") String id){
    User user =this.userRepo.findById(id);
    return user;
  }
  @GetMapping("/find/{state}")
  public List<User> getByState(@PathVariable("state")String state){
    List<User> users = this.userRepo.findbyc(state);
    return users;
  }
  @GetMapping("/findBy/{country}")
  public List<User> getByLn(@PathVariable("country") String country){
    QUser qUser = new QUser("user");
    BooleanExpression filterByCountry = qUser.address.country.eq(country);
    List<User> users = (List<User>) this.userRepo.findAll(filterByCountry);
    return users;
  }
}