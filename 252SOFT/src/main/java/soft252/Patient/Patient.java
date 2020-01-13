package soft252.Patient;
import soft252.System.ICreateUser;
import soft252.System.SystemDatabase;

/**
 *
 * @author Nick1
 * THIS IS TEMPLATE CLASS. THESE ARE TEMPLATES.
 *
 * 
 */
public class Patient implements ICreateUser {
   
    String UserID;
    String FirstName;
    String LastName;
    String Address;
    
    Integer Age;
    String Gender;
    
    String Password;
    
    public Patient(String First, String Last, String Address, Integer Age, String Gender, String Password)
    {
        int Num = PFinder();
        this.UserID = String.format("P" + "%03d" , Num);
        this.FirstName = First;
        this.LastName = Last;
        this.Address = Address;
        this.Age = Age;
        this.Gender = Gender;
        this.Password = Password;
    }
    
    public Patient(String First, String Last, String Address, Integer Age, String Gender,String Password, String ID)
    {
        this.UserID = ID;
        this.FirstName = First;
        this.LastName = Last;
        this.Address = Address;
        this.Age = Age;
        this.Gender = Gender;
        this.Password = Password;
    }
    
    public Integer PFinder()
    {
        Integer Number = 1;
        for (int i = 0; i < SystemDatabase.Users.size(); i++)
        {
            if (SystemDatabase.Users.get(i).getUserID().substring(0, 1).equals("P"))
            {
                Number++;
                System.out.println(Number);
            }
        }
        return Number;
    }
    
//    public Integer LengthFinder()
//    {
//        Integer Number = 1;
//        String id = "";
//        
//        for (Integer i = 0; i < SystemDatabase.Users.length; i++)
//        {
//            id = SystemDatabase.Users[i].getUserID();
//            if (id == "p")
//            {
//                Number++;
//            }
//        }
//        
//        return Number;
//    }
    
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
        this.Age = Age;
    }
    @Override
    public void setUserGender(String Gender){
        this.Gender = Gender;
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
