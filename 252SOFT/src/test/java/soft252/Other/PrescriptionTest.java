/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.Other;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nick1
 */
public class PrescriptionTest {
    public Prescription Test = null;
    
    public PrescriptionTest() {
        Test = new Prescription("D001", "D002", "Notes", "TestMed", 10, "2", true);
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetDocID() {
        Test.setDocID("D002");
        assertEquals("D002", Test.getDocID());
    }

    @Test
    public void testSetDocID() {
        Test.setDocID("D002");
        assertEquals("D002", Test.getDocID());
    }

    @Test
    public void testGetPatientID() {
        Test.setPatientID("P002");
        assertEquals("P002", Test.getPatientID());
    }

    @Test
    public void testSetPatientID() {
        Test.setPatientID("P002");
        assertEquals("P002", Test.getPatientID());
    }

    @Test
    public void testGetDoctorNotes() {
        Test.setDoctorNotes("Blah");
        assertEquals("Blah", Test.getDoctorNotes());
    }

    @Test
    public void testSetDoctorNotes() {
        Test.setDoctorNotes("Blah");
        assertEquals("Blah", Test.getDoctorNotes());
    }

    @Test
    public void testGetMedicationName() {
        Test.setMedicationName("MedTest");
        assertEquals("MedTest", Test.getMedicationName());
    }

    @Test
    public void testSetMedicationName() {
        Test.setMedicationName("MedTest");
        assertEquals("MedTest", Test.getMedicationName());
    }

    @Test
    public void testGetQuantity() {
        Test.setQuantity(9);
        assertEquals("9", Test.getQuantity().toString());
    }

    @Test
    public void testSetQuantity() {
        Test.setQuantity(9);
        assertEquals("9", Test.getQuantity().toString());
    }

    @Test
    public void testGetDosage() {
        Test.setDosage("4");
        assertEquals("4", Test.getDosage());
    }

    @Test
    public void testSetDosage() {
        Test.setDosage("4");
        assertEquals("4", Test.getDosage());
    }

    @Test
    public void testGetCompleted() {
        Test.setCompleted(false);
        assertEquals("false", Test.getCompleted().toString());
    }

    @Test
    public void testSetCompleted() {
        Test.setCompleted(false);
        assertEquals("false", Test.getCompleted().toString());
    }
    
}
