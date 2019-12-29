/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.System;

/**
 *
 * @author Nick1
 */
public interface ICreateUser {
    String UserID = "";
    String FirstName = "";
    String LastName = "";
    String Address = "";
    
    Integer Age = 0;
    String Gender = "";
  
    public String getUserID();
    public String getUserFirst();
    public String getUserLast();
    public String getUserAdress();
    
    public Integer getUserAge();
    public String getUserGender();
    
}
