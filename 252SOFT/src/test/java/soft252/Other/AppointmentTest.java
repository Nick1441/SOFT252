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
public class AppointmentTest {
    public Appointment Test = null;
    
    public AppointmentTest() {
        Test = new Appointment("D001", "P002", "01.01.01", true);
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
        Test.setDocID("D001");
        assertEquals("D001", Test.getDocID());
    }

    @Test
    public void testSetDocID() {
        Test.setDocID("D001");
        assertEquals("D001", Test.getDocID());
    }

    @Test
    public void testGetPatientID() {
        Test.setPatientID("P001");
        assertEquals("P001", Test.getPatientID());
    }

    @Test
    public void testSetPatientID() {
        Test.setPatientID("P001");
        assertEquals("P001", Test.getPatientID());
    }

    @Test
    public void testGetDates() {
        Test.setDates("02.02.02");
        assertEquals("02.02.02", Test.getDates());
    }

    @Test
    public void testSetDates() {
        Test.setDates("02.02.02");
        assertEquals("02.02.02", Test.getDates());
    }

    @Test
    public void testGetApproved() {
        Test.setApproved(true);
        assertEquals("true", Test.getApproved().toString());
    }

    @Test
    public void testSetApproved() {
        Test.setApproved(true);
        assertEquals("true", Test.getApproved().toString());
    }
    
}
