/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.Other;

public class Appointment {
    String DocID;
    String PatientID;
    String Dates;
    Boolean Approved;

    public Appointment(String DocID, String PatientID, String Dates, Boolean Approved)
    {
        this.DocID = DocID;
        this.PatientID = PatientID;
        this.Dates = Dates;
        this.Approved = Approved;

    }

    public String getDocID() {
        return DocID;
    }

    public void setDocID(String DocID) {
        this.DocID = DocID;
    }

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public String getDates() {
        return Dates;
    }

    public void setDates(String Dates) {
        this.Dates = Dates;
    }

    public Boolean getApproved() {
        return Approved;
    }

    public void setApproved(Boolean Approved) {
        this.Approved = Approved;
    }
    
    
    
}
