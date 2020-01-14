package soft252.Other;
/**
 *  This Class Uses State Pattern. User Is Created into s state, Until Changed By A Secretary.
 *  Once changed, State is moved to User Form RequestedUser.
 */
public class AccountRequest {
    private String FirstName;
    private String LastName;
    private String Address;
    private Integer Age;
    private String Gender;
    private String Password;

    //Creating New Temp User. Info The User is wanting ot have on the account.
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
