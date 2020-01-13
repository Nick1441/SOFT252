/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.System;

/**
 *
 * THIS IS TEMPLATE PATTERN.
 */
public interface ICreateUser {
    String UserID = "";
    String FirstName = "";
    String LastName = "";
    String Address = "";
    
    Integer Age = 0;
    String Gender = "";
    String Password = "";
  
    public String getUserID();
    public String getUserFirst();
    public String getUserLast();
    public String getUserAdress();
    
    public Integer getUserAge();
    public String getUserGender();
    
    public String GetPassword();
    
    public void setUserID(String ID);
    public void setUserFirst(String First);
    public void setUserLast(String Last);
    public void setUserAdress(String Address);
    public void setUserAge(int Age);
    public void setUserGender(String Gender);
    public void setPassword(String Password);
    
}
