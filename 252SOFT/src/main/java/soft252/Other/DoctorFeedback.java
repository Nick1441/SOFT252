package soft252.Other;

public class DoctorFeedback {
    private String DoctorID;
    private int Rating;
    private String Notes;
    private Boolean Approved;
    
    //Used When Creatig Feedback Object.
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
