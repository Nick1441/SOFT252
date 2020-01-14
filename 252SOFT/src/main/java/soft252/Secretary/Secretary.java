/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.Secretary;

import soft252.System.ICreateUser;
import soft252.System.SystemDatabase;

/**
 *
 * @author Nick1
 */
public class Secretary implements ICreateUser{
    private String UserID;
    private String FirstName;
    private String LastName;
    private String Address;
    private String Password;
    
    //Used when creating new Secretartys. Generates UserID.
    public Secretary(String First, String Last, String Address, Integer Age, String Gender, String Password)
    {
        int Num = SFinder();
        this.UserID = String.format("S" + "%03d" , Num);
        this.FirstName = First;
        this.LastName = Last;
        this.Address = Address;
        this.Password = Password;
    }
    
    //Used when ID is known, e.g. importing from File.
    public Secretary(String First, String Last, String Address, Integer Age, String Gender,String Password, String ID)
    {
        this.UserID = ID;
        this.FirstName = First;
        this.LastName = Last;
        this.Address = Address;
        this.Password = Password;
    }
    
    //Finds next Number for UserID.
    public Integer SFinder()
    {
        Integer Number = 1;
        for (int i = 0; i < SystemDatabase.Users.size(); i++)
        {
            if (SystemDatabase.Users.get(i).getUserID().substring(0, 1).equals("S"))
            {
                Number++;
                System.out.println(Number);
            }
        }
        return Number;
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
        @Override
    public void setUserID(String ID){
        this.UserID = ID;
    }
    
    @Override
    public void setUserFirst(String First){
        this.FirstName = First;
    }
    
    @Override
    public void setUserLast(String Last){
        this.LastName = Last;
    }
    
    @Override
    public void setUserAdress(String Address){
        this.Address = Address;
    }
     
    
    @Override
    public void setUserAge(int Age){
        //this.Age = Age;
    }
    @Override
    public void setUserGender(String Gender){
        //this.Gender = Gender;
    }
    
    @Override
    public void setPassword(String Password){
        this.Password = Password;
    }
    
    @Override
    public String GetPassword(){
        return Password;
    }
}
