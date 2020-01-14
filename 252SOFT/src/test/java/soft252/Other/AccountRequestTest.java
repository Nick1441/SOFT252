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
public class AccountRequestTest {
    public AccountRequest Test = null;
    
    public AccountRequestTest() {
        Test = new AccountRequest("Nick", "Clothier", "Plymouth", 21, "Male", "1234");
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
    public void testGetFirstName() {
        Test.setFirstName("Nick");
        assertEquals("Nick", Test.getFirstName());
    }

    @Test
    public void testSetFirstName() {
        Test.setFirstName("Nick");
        assertEquals("Nick", Test.getFirstName());
    }

    @Test
    public void testGetLastName() {
        Test.setLastName("Clothier");
        assertEquals("Clothier", Test.getLastName());
    }

    @Test
    public void testSetLastName() {
        Test.setLastName("Clothier");
        assertEquals("Clothier", Test.getLastName());
    }

    @Test
    public void testGetAddress() {
        Test.setAddress("Plymouth");
        assertEquals("Plymouth", Test.getAddress());
    }

    @Test
    public void testSetAddress() {
        Test.setAddress("Plymouth");
        assertEquals("Plymouth", Test.getAddress());
    }

    @Test
    public void testGetAge() {
        Test.setAge(10);
        assertEquals("10", Test.getAge().toString());
    }

    @Test
    public void testSetAge() {
        Test.setAge(10);
        assertEquals("10", Test.getAge().toString());
    }

    @Test
    public void testGetGender() {
        Test.setGender("Female");
        assertEquals("Female", Test.getGender());
    }

    @Test
    public void testSetGender() {
        Test.setGender("Female");
        assertEquals("Female", Test.getGender());
    }

    @Test
    public void testGetPassword() {
        Test.setPassword("12345");
        assertEquals("12345", Test.getPassword());
    }

    @Test
    public void testSetPassword() {
        Test.setPassword("12345");
        assertEquals("12345", Test.getPassword());
    }
    
}
