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
public class MedicineTest {
    public Medicine Test = null;
    
    public MedicineTest() {
        Test = new Medicine("TestMed", 21);
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
    public void testGetName() {
        Test.setName("TestMed");
        assertEquals("TestMed", Test.getName());
    }

    @Test
    public void testSetName() {
        Test.setName("TestMed");
        assertEquals("TestMed", Test.getName());
    }

    @Test
    public void testGetStock() {
        Test.setStock(10);
        assertEquals("10", Test.getStock().toString());
    }

    @Test
    public void testSetStock() {
        Test.setStock(10);
        assertEquals("10", Test.getStock().toString());
    }
    
}
