package soft252.Other;

public class Prescription {
    private String DocID;
    private String PatientID;
    private String DoctorNotes;
    private String MedicationName;
    private Integer Quantity;
    private String Dosage;
    private Boolean Completed;
    
    //Used When Calling Creating New Prescription.
    public Prescription(String DocID, String PatientID, String DoctorNotes, String MedicationName, Integer Quantity, String Dosage, Boolean Completed)
    {
        this.DocID = DocID;
        this.PatientID = PatientID;
        this.DoctorNotes = DoctorNotes;
        this.MedicationName = MedicationName;
        this.Quantity = Quantity;
        this.Dosage = Dosage;
        this.Completed = Completed;
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

    public String getDoctorNotes() {
        return DoctorNotes;
    }

    public void setDoctorNotes(String DoctorNotes) {
        this.DoctorNotes = DoctorNotes;
    }

    public String getMedicationName() {
        return MedicationName;
    }

    public void setMedicationName(String MedicationName) {
        this.MedicationName = MedicationName;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer Quantity) {
        this.Quantity = Quantity;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String Dosage) {
        this.Dosage = Dosage;
    }

    public Boolean getCompleted() {
        return Completed;
    }

    public void setCompleted(Boolean Completed) {
        this.Completed = Completed;
    }
    
    
  
}
