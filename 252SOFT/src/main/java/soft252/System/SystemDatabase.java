/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.System;
import java.util.ArrayList;
import soft252.Other.AccountRequest;
import soft252.Other.Appointment;
import soft252.Other.DoctorFeedback;
import soft252.Other.Medicine;
import soft252.Other.Prescription;


/**
 *
 * @author Nick1
 */
public  class SystemDatabase {
    //public static ICreateUser[] Users2 = new ICreateUser[0];
    public static ArrayList<ICreateUser> Users = new ArrayList<ICreateUser>(); 
    public static ArrayList<DoctorFeedback> DocFeed = new ArrayList<DoctorFeedback>();
    public static ArrayList<AccountRequest> AccountReq = new ArrayList<AccountRequest>();
    public static ArrayList<Appointment> Appointments = new ArrayList<Appointment>();
    public static ArrayList<Medicine> Medication = new ArrayList<Medicine>();
    public static ArrayList<Prescription> Prescriptions = new ArrayList<Prescription>();
    
}
