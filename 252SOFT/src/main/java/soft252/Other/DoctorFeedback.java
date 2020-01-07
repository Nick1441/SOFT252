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
    Boolean Approved;
    
    public DoctorFeedback(String DocID, int Rate, String Notes, Boolean Approved)
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
    
    public Boolean getApproved()
    {
        return Approved;
    }

    public void setDoctorID(String DoctorID) {
        this.DoctorID = DoctorID;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public void setApproved(Boolean Approved) {
        this.Approved = Approved;
    }
    
    
}
