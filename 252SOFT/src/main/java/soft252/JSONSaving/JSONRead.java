/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.JSONSaving;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
import soft252.Admin.Admin;
import soft252.Doctor.Doctor;
import soft252.Patient.Patient;
import soft252.Secretary.Secretary;
import soft252.System.ICreateUser;
import soft252.System.SystemDatabase;


public class JSONRead {
    public static void Import(String File)
    {
        JSONParser parser = new JSONParser();
        
        try
        {
           JSONObject jsonobj = (JSONObject) parser.parse(new FileReader(File));
            
           JSONArray UsersArray = (JSONArray) jsonobj.get("Users");
           
           for (int i = 0; i < UsersArray.size(); i++)
           {
               //MAKE ARRAY 1 BIGGER.
                       
               JSONObject Current = (JSONObject) UsersArray.get(i);
               String ID = Current.get("UserID").toString();
               String First = Current.get("FirstName").toString();
               String Last = Current.get("LastName").toString();
               String Address = Current.get("Address").toString();
               Integer Age = (int) (long) Current.get("Age");
               String Gender = Current.get("Gender").toString();
               String Password = Current.get("Password").toString();
               
               ICreateUser TestObject = null;
               
               if (ID.substring(0, 1).equals("D"))
               {
                   TestObject = new Doctor(First,Last,Address, Age, Gender, Password, ID);
               }
               else if (ID.substring(0, 1).equals("A"))
               {
                   TestObject = new Admin(First,Last,Address, Age, Gender, Password, ID);
               }
               else if (ID.substring(0, 1).equals("P"))
               {
                   TestObject = new Patient(First,Last,Address, Age, Gender, Password, ID);
               }
               else if (ID.substring(0, 1).equals("S"))
               {
                   TestObject = new Secretary(First,Last,Address, Age, Gender, Password, ID);
               }
               
               //WILL NEED TO RESIZE ARRAY BEFORE ADDING A NEW ONE IN.
               SystemDatabase.Users.add(i, TestObject);
               System.out.println(SystemDatabase.Users.get(i).getUserFirst() + SystemDatabase.Users.get(i).getUserID());
           } 
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            
    }
    
}
