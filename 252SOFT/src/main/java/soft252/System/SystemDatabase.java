package soft252.System;

//Importing Classes which are made into ArrayLists.
import java.util.ArrayList;
import soft252.Other.AccountRequest;
import soft252.Other.Appointment;
import soft252.Other.DoctorFeedback;
import soft252.Other.Medicine;
import soft252.Other.Notify;
import soft252.Other.Prescription;


public  class SystemDatabase {
    //Created Array Lists for Everything that will be Stored inside of these.
    public static ArrayList<ICreateUser> Users = new ArrayList<ICreateUser>(); 
    public static ArrayList<DoctorFeedback> DocFeed = new ArrayList<DoctorFeedback>();
    public static ArrayList<AccountRequest> AccountReq = new ArrayList<AccountRequest>();
    public static ArrayList<Appointment> Appointments = new ArrayList<Appointment>();
    public static ArrayList<Medicine> Medication = new ArrayList<Medicine>();
    public static ArrayList<Prescription> Prescriptions = new ArrayList<Prescription>();
    public static ArrayList<Appointment> AppRequest = new ArrayList<Appointment>();
    public static ArrayList<Notify> Notifications = new ArrayList<Notify>();
}
