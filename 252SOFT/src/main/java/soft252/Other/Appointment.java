package soft252.Other;

public class Appointment {
    private String DocID;
    private String PatientID;
    private String Dates;
    private Boolean Approved;

    //Creating Appointment, Constructor Getting Passed Infomation.
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
