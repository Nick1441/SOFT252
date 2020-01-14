package soft252.JSONSaving;

//Importing File Writer.
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;

//Importing JSON Objects For Writing To JSON from Database.
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

//Importing Classes That are being saved.
import soft252.Admin.Admin;
import soft252.System.ICreateUser;
import soft252.System.SystemDatabase;
import soft252.Doctor.Doctor;
import soft252.Other.Medicine;
import soft252.Patient.Patient;
import soft252.Secretary.Secretary;
import soft252.System.Startup;

public class SavingJSON {
    
    public static void Save(String FileName)
    {      
        //CallFunction To Set Up Default Database.
        //CreatingSetup();
                
        //Creating Main Object Which Will Hold All Data.
        JSONObject obj = new JSONObject();
        
        //SAVING USERS TO JSON.
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
        
        //SAVING DOCTORS FEEDBACK TO JSON.
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
        
        //SAVING ACCOUNT REQUESTS TO JSON.
        JSONArray AccReqJSON = new JSONArray();
        for (int i = 0; i < SystemDatabase.AccountReq.size(); i++)
        {
            JSONObject EachReq = new JSONObject();
            EachReq.put("FirstName", SystemDatabase.AccountReq.get(i).getFirstName());
            EachReq.put("LastName", SystemDatabase.AccountReq.get(i).getLastName());
            EachReq.put("Address", SystemDatabase.AccountReq.get(i).getAddress());
            EachReq.put("Age", SystemDatabase.AccountReq.get(i).getAge());
            EachReq.put("Gender", SystemDatabase.AccountReq.get(i).getGender());
            EachReq.put("Password", SystemDatabase.AccountReq.get(i).getPassword());
            
            AccReqJSON.add(EachReq);
        }
        
        obj.put("AccountRequests", AccReqJSON);
        
        //SAVING APPOINTMENTS TO JSON.
        JSONArray AppJSON = new JSONArray();
        for (int i = 0; i < SystemDatabase.Appointments.size(); i++)
        {
            JSONObject EachApp = new JSONObject();
            EachApp.put("DocID", SystemDatabase.Appointments.get(i).getDocID());
            EachApp.put("PatientID", SystemDatabase.Appointments.get(i).getPatientID());
            EachApp.put("Dates", SystemDatabase.Appointments.get(i).getDates());
            EachApp.put("Approved", SystemDatabase.Appointments.get(i).getApproved());
            
            AppJSON.add(EachApp);
        }
        
        obj.put("Appointments", AppJSON);
        
        //SAVING MEDICATION TO JSON.
        
        JSONArray MedJSON = new JSONArray();
        for (int i = 0; i < SystemDatabase.Medication.size(); i++)
        {
            JSONObject EachMed = new JSONObject();
            EachMed.put("Name", SystemDatabase.Medication.get(i).getName());
            EachMed.put("Stock", SystemDatabase.Medication.get(i).getStock());
            
            MedJSON.add(EachMed);
        }
        obj.put("Medicine", MedJSON);
        
        //SAVING PRESCRIPTIONS TO JSON.
        JSONArray PreJSON = new JSONArray();
        for (int i = 0; i < SystemDatabase.Prescriptions.size(); i++)
        {
            JSONObject EachPre = new JSONObject();
            EachPre.put("DocID", SystemDatabase.Prescriptions.get(i).getDocID());
            EachPre.put("PatientID", SystemDatabase.Prescriptions.get(i).getPatientID());
            EachPre.put("DoctorNotes", SystemDatabase.Prescriptions.get(i).getDoctorNotes());
            EachPre.put("MedicationName", SystemDatabase.Prescriptions.get(i).getMedicationName());
            EachPre.put("Quantity", SystemDatabase.Prescriptions.get(i).getQuantity());
            EachPre.put("Dosage", SystemDatabase.Prescriptions.get(i).getDosage());
            EachPre.put("Completed", SystemDatabase.Prescriptions.get(i).getCompleted());
            
            PreJSON.add(EachPre);
        }
        obj.put("Prescriptions", PreJSON);
        
        
        //SAVIING APPOINTMENT REQUEST ARRAY
        JSONArray AppReqJSON = new JSONArray();
        for (int i = 0; i < SystemDatabase.AppRequest.size(); i++)
        {
            JSONObject EachReq = new JSONObject();
            EachReq.put("DocID", SystemDatabase.AppRequest.get(i).getDocID());
            EachReq.put("PatientID", SystemDatabase.AppRequest.get(i).getPatientID());
            EachReq.put("Dates", SystemDatabase.AppRequest.get(i).getDates());
            EachReq.put("Approved", SystemDatabase.AppRequest.get(i).getApproved());
            
            AppReqJSON.add(EachReq);
        }
        obj.put("Appointment Requests", AppReqJSON);
        
        //SAVING NOTIFICATIONS ARRAY
        JSONArray NotJSON = new JSONArray();
        for (int i = 0; i < SystemDatabase.Notifications.size(); i++)
        {
            JSONObject EachNot = new JSONObject();
            EachNot.put("NotifyID", SystemDatabase.Notifications.get(i).getNotifyID());
            EachNot.put("Info", SystemDatabase.Notifications.get(i).getInfo());
            
            NotJSON.add(EachNot);
        }
        obj.put("Notifications", NotJSON);
        
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
    
    public static void CreatingSetup()
    {
        //Creating Everything Required For Demoing.
        //Can Be Saved On Start To Created Fresh Full Database.
        
        //Creating Patients.
        ICreateUser Patient1 = new Patient("Shirley", "Fasan", "York", 34, "Female", "P1");
        SystemDatabase.Users.add(Patient1);
        ICreateUser Patient2 = new Patient("Michelle", "McAllister", "NewYork", 29, "Female", "P2");
        SystemDatabase.Users.add(Patient2);
        ICreateUser Patient3 = new Patient("Clarice", "Walker", "Bristol", 19, "Female", "P3");
        SystemDatabase.Users.add(Patient3);
        
        //Creating Doctors
        ICreateUser Doctor1 = new Doctor("Ben", "Klapper", "Portland", 37, "Male", "D1");
        SystemDatabase.Users.add(Doctor1);
        ICreateUser Doctor2 = new Doctor("Joanie", "Crawford", "Dorchester", 21, "Female", "D2");
        SystemDatabase.Users.add(Doctor2);        
        ICreateUser Doctor3 = new Doctor("Manuel ", "Skinner", "Southampton", 24, "Male", "D3");
        SystemDatabase.Users.add(Doctor3);
        
        //Creating Admin
        ICreateUser Admin = new Admin("Nick", "Clothier", "Plymouth", 21, "Male", "A1");
        SystemDatabase.Users.add(Admin);
        
        //Creating Secetary
        ICreateUser Secretary = new Secretary("Gary", "Clothier", "Weymouth", 54, "Male", "S1");
        SystemDatabase.Users.add(Secretary);
        
        //Creating Medication
        Medicine Medication1 = new Medicine("Abilify", 10);
        SystemDatabase.Medication.add(Medication1);
        Medicine Medication2 = new Medicine("Acetaminophen", 10);
        SystemDatabase.Medication.add(Medication2);
        Medicine Medication3 = new Medicine("Acyclovir", 10);
        SystemDatabase.Medication.add(Medication3);
        Medicine Medication4 = new Medicine("Adderall", 10);
        SystemDatabase.Medication.add(Medication4);
        Medicine Medication5 = new Medicine("Advil", 10);
        SystemDatabase.Medication.add(Medication5);
        Medicine Medication6 = new Medicine("Albuterol", 9);
        SystemDatabase.Medication.add(Medication6);
        Medicine Medication7 = new Medicine("Aldactone", 9);
        SystemDatabase.Medication.add(Medication7);
        Medicine Medication8 = new Medicine("Alendronate", 9);
        SystemDatabase.Medication.add(Medication8);
        Medicine Medication9 = new Medicine("Aleve", 9);
        SystemDatabase.Medication.add(Medication9);
        Medicine Medication10 = new Medicine("Alfuzosin", 9);
        SystemDatabase.Medication.add(Medication10);

    }
}
