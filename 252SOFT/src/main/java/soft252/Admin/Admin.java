/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.Admin;
import soft252.System.ICreateUser;
import soft252.System.SystemDatabase;

/**
 *
 * @author Nick1
 */
public class Admin implements ICreateUser{
    String UserID;
    String FirstName;
    String LastName;
    String Address;
    String Password;
    
    public Admin(String First, String Last, String Address, Integer Age, String Gender, String Password)
    {
        int Num = AFinder();
        this.UserID = String.format("A" + "%03d" , Num);
        this.FirstName = First;
        this.LastName = Last;
        this.Address = Address;
        this.Password = Password;
    }
    
        public Admin(String First, String Last, String Address, Integer Age, String Gender,String Password, String ID)
    {
        this.UserID = ID;
        this.FirstName = First;
        this.LastName = Last;
        this.Address = Address;
        this.Password = Password;
    }
        
    public Integer AFinder()
    {
        Integer Number = 1;
        for (int i = 0; i < SystemDatabase.Users.size(); i++)
        {
            if (SystemDatabase.Users.get(i).getUserID().substring(0, 1).equals("A"))
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
