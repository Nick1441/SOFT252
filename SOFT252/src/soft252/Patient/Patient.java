package soft252.Patient;
import soft252.System.ICreateUser;
import soft252.System.SystemDatabase;

/**
 *
 * @author Nick1
 * MAKE IT SO IT GETS LAST PATIENT IN ARRAY AND ADDS 1 TO IT.
 * MAKE IT SEARCH THROUGH DATABASE.
 * 
 */
public class Patient implements ICreateUser {
   
    String UserID;
    String FirstName;
    String LastName;
    String Address;
    
    Integer Age;
    String Gender;
    
    int Number = 1;
    public Patient(String First, String Last, String Address, Integer Age, String Gender)
    {
//        Integer Number = LengthFinder();
        this.UserID = String.format("P" + "%03d" , Number);
        this.FirstName = First;
        this.LastName = Last;
        this.Address = Address;
        this.Age = Age;
        this.Gender = Gender;
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
}
