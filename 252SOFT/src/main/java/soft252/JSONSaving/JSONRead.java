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
import soft252.Other.AccountRequest;
import soft252.Other.Appointment;
import soft252.Other.DoctorFeedback;
import soft252.Other.Medicine;
import soft252.Other.Prescription;
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
            //Getting Main Object From JSON.
           JSONObject jsonobj = (JSONObject) parser.parse(new FileReader(File));
            
           //Getting Users Array From JSON.
           JSONArray UsersArray = (JSONArray) jsonobj.get("Users");
           
           for (int i = 0; i < UsersArray.size(); i++)
           {        
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
               
               SystemDatabase.Users.add(TestObject);
           } 
           
           //Getting Feedback Array From JSON.
           JSONArray FeedBackArray = (JSONArray) jsonobj.get("DoctorFeedBack");
           
           for (int i = 0; i < FeedBackArray.size(); i++)
           {
               JSONObject Current = (JSONObject) FeedBackArray.get(i);
               String DocID = Current.get("DocID").toString();
               Integer Rating = (int) (long) Current.get("Rating");
               String Notes = Current.get("Notes").toString();
               Boolean Approved = (Boolean) Current.get("Approved");
               
               DoctorFeedback DocFeed = new DoctorFeedback(DocID, Rating, Notes, Approved);
               
               SystemDatabase.DocFeed.add(DocFeed);
           }
           
           //Getting Patient Account Requests From JSON.
           JSONArray AccReqArray = (JSONArray) jsonobj.get("AccountRequests");
           
           for (int i = 0; i < AccReqArray.size(); i++)
           {
               JSONObject Current = (JSONObject) AccReqArray.get(i);
               String First = Current.get("FirstName").toString();
               String Last = Current.get("LastName").toString();
               String Address = Current.get("Address").toString();
               Integer Age = (int) (long) Current.get("Age");
               String Gender = Current.get("Gender").toString();
               String Password = Current.get("Password").toString();
               
               AccountRequest AccReq = new AccountRequest(First, Last, Address, Age, Gender, Password);
               
               SystemDatabase.AccountReq.add(AccReq);
           }
           
           //Getting Appointments From JSON.
           JSONArray Appointments = (JSONArray) jsonobj.get("Appointments");
           
           for (int i = 0; i < Appointments.size(); i++)
           {
               JSONObject Current = (JSONObject) Appointments.get(i);
               String DocID = Current.get("DocID").toString();
               String PatientID = Current.get("PatientID").toString();
               String Dates = Current.get("Dates").toString();
               Boolean Approved = (Boolean) Current.get("Approved");
               
               Appointment App = new Appointment(DocID, PatientID, Dates, Approved);
               
               SystemDatabase.Appointments.add(App);
           }
           
           //Getting MedicineMedicine From JSON.
           JSONArray Medication = (JSONArray) jsonobj.get("Medicine");
           
           for (int i = 0; i < Medication.size(); i++)
           {
               JSONObject Current = (JSONObject) Medication.get(i);
               String Name = Current.get("Name").toString();
               Integer Stock = (int) (long) Current.get("Stock");
               
               Medicine Med = new Medicine(Name, Stock);
               
               SystemDatabase.Medication.add(Med);
           }
           
           //Getting Prescriptions From JSON.
           JSONArray Prescriptions = (JSONArray) jsonobj.get("Prescriptions");
           
           for (int i = 0; i < Prescriptions.size(); i++)
           {
               JSONObject Current = (JSONObject) Prescriptions.get(i);
               String DocID = Current.get("DocID").toString();
               String PatientID = Current.get("PatientID").toString();
               String DoctorNotes = Current.get("DoctorNotes").toString();
               String MedicationName = Current.get("MedicationName").toString();
               Integer Quantity =   (int) (long) Current.get("Quantity");
               String Dosage = Current.get("Dosage").toString();
               Boolean Completed = (Boolean) Current.get("Completed");
               
               Prescription Pre = new Prescription(DocID, PatientID, DoctorNotes, MedicationName, Quantity, Dosage, Completed);
               
               SystemDatabase.Prescriptions.add(Pre);
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
