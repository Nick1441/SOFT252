/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.Admin;

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
public class AdminTest {
    public Admin Test = null;
    
    public AdminTest() {
        Test = new Admin("Nick", "Clothier", "Plymouth", 21, "Male", "123", "P001");
        
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
