/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.Other;

/**
 *
 * 
 */
public class AccountRequest {
    String FirstName;
    String LastName;
    String Address;
    Integer Age;
    String Gender;
    String Password;

    public AccountRequest(String FirstName, String LastName, String Address, Integer Age, String Gender, String Password) 
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.Age = Age;
        this.Gender = Gender;
        this.Password = Password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
   
   
}
