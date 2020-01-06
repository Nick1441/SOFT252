/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.JSONSaving;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import soft252.Admin.Admin;
import soft252.System.ICreateUser;
import soft252.System.SystemDatabase;

import soft252.Doctor.Doctor;
import soft252.Patient.Patient;
import soft252.Secretary.Secretary;
import soft252.System.Startup;
/**
 *
 * @author Nick1
 */
public class SavingJSON {
    
    public static void Save(String FileName)
    {   
        //TESTING CREATING FILES
//        ICreateUser TestObject = new Patient("Nick","Test1","Plymouth Uni", 21, "Male", "1");
//        SystemDatabase.Users.add(TestObject);
//        ICreateUser TestObject2 = new Doctor("Nathan","Test2","Weymouth College", 0, "", "2");
//        SystemDatabase.Users.add(TestObject2);
//        ICreateUser TestObject3 = new Admin("Gary","Test3","Weymouth", 0, "", "3");
//        SystemDatabase.Users.add(TestObject3);
//        ICreateUser TestObject4 = new Secretary("Michaela","Test4","Weym]outh", 0, "", "4");
//        SystemDatabase.Users.add(TestObject4);
            
        //Creating Main Object Which Will Hold All Data.
        JSONObject obj = new JSONObject();
        
        //SAVING USERS
        JSONArray UsersJSON = new JSONArray();
        for (int i = 0; i < SystemDatabase.Users.size(); i++)
        {
            JSONObject EachUser = new JSONObject();
            EachUser.put("UserID", SystemDatabase.Users.get(i).getUserID());
            EachUser.put("FirstName", SystemDatabase.Users.get(i).getUserFirst());
            EachUser.put("LastName", SystemDatabase.Users.get(i).getUserLast());
            EachUser.put("Address", SystemDatabase.Users.get(i).getUserAdress());
            EachUser.put("Age", SystemDatabase.Users.get(i).getUserAge());
            EachUser.put("Gender", SystemDatabase.Users.get(i).getUserGender());
            EachUser.put("Password", SystemDatabase.Users.get(i).GetPassword());
            
            UsersJSON.add(EachUser);
        }
        
        obj.put("Users", UsersJSON);
        
        //SAVING DOCTORS FEEDBACK
        JSONArray FeedbackJSON = new JSONArray();
        for (int i = 0; i < SystemDatabase.DocFeed.size(); i++)
        {
            JSONObject EachFeedback = new JSONObject();
            EachFeedback.put("DocID", SystemDatabase.DocFeed.get(i).getDocID());
            EachFeedback.put("Rating", SystemDatabase.DocFeed.get(i).getRating());
            EachFeedback.put("Notes", SystemDatabase.DocFeed.get(i).getNotes());
            EachFeedback.put("Approved", SystemDatabase.DocFeed.get(i).getApproved());
            
            FeedbackJSON.add(EachFeedback);
        }
        
        obj.put("DoctorFeedBack", FeedbackJSON);
        
        //SAVING
        try (FileWriter file = new FileWriter(FileName))
        {
            file.write(obj.toJSONString());;
            file.flush();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
           
        System.out.println(obj);
    }
}
