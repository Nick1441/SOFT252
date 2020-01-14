package soft252.Patient;

//Importing Required Classes.
import soft252.System.ICreateUser;
import soft252.System.SystemDatabase;

/**
 *
 * This Is the Template Class, This is a Template BAsed on the ICreateUser Class.
 * 
 */
public class Patient implements ICreateUser {
   
    private String UserID;
    private String FirstName;
    private String LastName;
    private String Address;
    
    private Integer Age;
    private String Gender;
    
    String Password;
    
    //Used when creating Patient with no ID, e.g. new User.
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
    
    //Used when importing data from JSON.
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
    
    //Finds next avaiable Number for Next Creation User.
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
