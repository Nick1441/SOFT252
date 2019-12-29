/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.Admin;
import soft252.System.ICreateUser;

/**
 *
 * @author Nick1
 */
public class Admin implements ICreateUser{
    String UserID;
    String FirstName;
    String LastName;
    String Address;
    
    int Number = 0001;
    
    public Admin(String First, String Last, String Address)
    {
        this.UserID = String.format("A" + "%03d" , Number);
        this.FirstName = First;
        this.LastName = Last;
        this.Address = Address;
        Number = Number + 1;
    }
    
    @Override
    public String getUserID(){
        return UserID;
    }
    @Override
    public String getUserFirst(){
        return FirstName;
    }
    @Override
    public String getUserLast(){
        return LastName;
    }
    @Override
    public String getUserAdress(){
        return Address;
    }
    
    @Override
    public Integer getUserAge(){
        return Age;
    }
    @Override
    public String getUserGender(){
        return Gender;
    }
}
