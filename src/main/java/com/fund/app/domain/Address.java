package com.fund.app.domain;

public class Address {
  private String country;
  private String state;
  
  public Address(){
    
  }
  public Address(String state ,String country){
    this.state=state;
    this.country = country;
  }
  public String getCountry() {
    return country;
  }
  public String getState() {
    return state;
  }
  

}
