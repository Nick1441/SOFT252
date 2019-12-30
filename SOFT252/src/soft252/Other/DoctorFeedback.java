/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.Other;

/**
 *
 * @author Nick1
 */
public class DoctorFeedback {
    String DoctorID;
    int Rating;
    String Notes;
    String Approved;
    
    public DoctorFeedback(String DocID, int Rate, String Notes, String Approved)
    {
        this.DoctorID = DocID;
        this.Rating = Rate;
        this.Notes = Notes;
        this.Approved = Approved;
    } 
    
    public String getDocID()
    {
        return DoctorID;
    }
    
    public int getRating()
    {
        return Rating;
    }
    
    public String getNotes()
    {
        return Notes;
    }
    
    public String getApproved()
    {
        return Approved;
    }
}
