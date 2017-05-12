package com.fund.app.db;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fund.app.domain.Address;
import com.fund.app.domain.User;
import com.fund.app.repository.UserRepository;

@Component
public class DbSeeder {//implements CommandLineRunner{
/*  @Autowired
 private UserRepository userRepo;

  @Override
  public void run(String... arg0) throws Exception {
  User cust = new User("raviteja81","ravi",
      "teja",
      new Address("Mi","US"));
  
  User cust2 = new User("sunil81","sunil",
      "kumar",
      new Address("NJ","US"));
  
  
 List<User> users = Arrays.asList(cust,cust2);
 userRepo.save(users);
    
  }*/

}
 