package com.fund.app.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="user")
public class User {
  @Id
  private String id;
  private String firstName ;
  private String lastName;
private Address address;

public User(){
  
}
public User(String id, String firstName ,String lastName, Address address){
  this.id =id;
  this.firstName=firstName;
  this.lastName=lastName;
  this.address = address;
}
  public String getId() {
    return id;
  }
  public String getFirstName() {
    return firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public Address getAddress() {
    return address;
  }

}
