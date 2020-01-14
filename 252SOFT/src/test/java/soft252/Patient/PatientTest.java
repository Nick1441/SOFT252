/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.Patient;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PatientTest {
    public Patient Test = null;
    
    public PatientTest() {
        Test = new Patient("Nick", "Clothier", "Plymouth", 21, "Male", "123", "P001");
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
    public void testGetUserID() {
         Test.setUserID("P001");
         assertEquals("P001", Test.getUserID());
    }

    @Test
    public void testGetUserFirst() {
        Test.setUserFirst("Nick");
        assertEquals("Nick", Test.getUserFirst());
    }

    @Test
    public void testGetUserLast() {
        Test.setUserLast("Clothier");
        assertEquals("Clothier", Test.getUserLast());
    }

    @Test
    public void testGetUserAdress() {
        Test.setUserAdress("Plymouth");
        assertEquals("Plymouth", Test.getUserAdress());
    }

    @Test
    public void testGetUserAge() {
        Test.setUserAge(21);
        assertEquals("21", Test.getUserAge().toString());
    }

    @Test
    public void testGetUserGender() {
        Test.setUserGender("Male");
        assertEquals("Male", Test.getUserGender()); 
    }

    @Test
    public void testSetUserID() {
        Test.setUserID("P002");
        assertEquals("P002", Test.getUserID()); 
    }

    @Test
    public void testSetUserFirst() {
        Test.setUserFirst("Nathan");
        assertEquals("Nathan", Test.getUserFirst()); 
    }

    @Test
    public void testSetUserLast() {
        Test.setUserLast("Mark");
        assertEquals("Mark", Test.getUserLast()); 
    }

    @Test
    public void testSetUserAdress() {
        Test.setUserAdress("Weymouth");
        assertEquals("Weymouth", Test.getUserAdress());  
    }

    @Test
    public void testSetUserAge() {
        Test.setUserAge(19);
        assertEquals("19", Test.getUserAge().toString());  
    }

    @Test
    public void testSetUserGender() {
        Test.setUserGender("Female");
        assertEquals("Female", Test.getUserGender());  
    }

    @Test
    public void testSetPassword() {
        Test.setPassword("4321");
        assertEquals("4321", Test.GetPassword());  
    }

    @Test
    public void testGetPassword() {
        Test.setPassword("4321");
        assertEquals("4321", Test.GetPassword());  
    }
    
}
