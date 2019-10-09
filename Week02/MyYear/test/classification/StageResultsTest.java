/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classification;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ngclothier
 */
public class StageResultsTest {
    
    public StageResultsTest() {
    }
    
    private StageResults empty; // will have no credits and no marks
    private StageResults full; // will have 120 credits and marks
    private StageResults halfFull; // will have 60 credits and some marks
    
    
    @Before
    public void setUp() {
        // empty - object that starts with default values
        empty = new StageResults();

        // full - object with 120 credits-worth of marks but no
        // initial stage2Average
        full = new StageResults();
        full.addModuleMark(120, 50.0);

        // halfFull - object with 60 credits worth of marks and
        // no initial stage2Average
        halfFull = new StageResults(); 
        halfFull.addModuleMark(60, 50.0);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStage2Average method, of class StageResults.
     */
    @Test
    public void testGetStage2Average() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalCredits method, of class StageResults.
     */
    @Test
    public void testGetTotalCredits() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalMarks method, of class StageResults.
     */
    @Test
    public void testGetTotalMarks() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStage2Average method, of class StageResults.
     */
    @Test
    public void testSetStage2Average() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isComplete method, of class StageResults.
     */
    @Test
    public void testIsComplete() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Testing isComplete");

        // Check that the empty object is 'not complete'
        assertFalse("empty object", empty.isComplete());
        assertTrue("full", full.isComplete()); 
        assertFalse("HalfFull", halfFull.isComplete()); 
    }

    /**
     * Test of resetValues method, of class StageResults.
     */
    @Test
    public void testResetValues() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Testing resetValues");

         // Set the state of the 'full' object to zeroes
         full.resetValues();

         // Set expected results
         int expIntResult = 0;
         double expDoubleResult = 0.0;

         // Now check each attribute to test that the reset has worked
         assertEquals("credits", expIntResult, full.getTotalCredits());
         assertEquals("total", expDoubleResult, full.getTotalMarks(), 0.0);

         // Put the 'full' object back to its original state
         full.addModuleMark(120, 50.0); 
    }

    /**
     * Test of addModuleMark method, of class StageResults.
     */
    @Test
    public void testAddModuleMark() {
        empty.resetValues();
        empty.addModuleMark(10, 100);
        int ExpectedResult = 10;
        int ExpectedCred = 100;
        
        assertEquals("Add Marks- 10", ExpectedResult, empty.getTotalCredits());
        assertEquals("Add Credits - 10", ExpectedCred, empty.getTotalMarks(), 0.0);
        
        empty.resetValues();
        
        empty.addModuleMark(20, 100);
        ExpectedResult = 20;
        ExpectedCred = 200;
        
        assertEquals("Add Marks - 20", ExpectedResult, empty.getTotalCredits());
        assertEquals("Add Credits - 20", ExpectedCred, empty.getTotalMarks(), 0.0);
    
        empty.addModuleMark(40, 80);
        
        int ExpectedResult2 = 60;
        Double ExpectedCred2 = 520.0;
        
        assertEquals("Add Marks - 40", ExpectedResult2, empty.getTotalCredits());
        assertEquals("Add Credits - 40", ExpectedCred2, empty.getTotalMarks(), 0.0);
        
        empty.resetValues();
    }

    /**
     * Test of calculateAverageSoFar method, of class StageResults.
     */
    @Test
    public void testCalculateAverageSoFar() {
        // Test with no credits and no marks
        assertEquals("empty", 0.0, empty.calculateAverageSoFar(), 0.0);
        
        // Test with 120 credits all at 50%
        assertEquals("full @ 50%", 50.0, full.calculateAverageSoFar(), 0.0);
        
        // Test with 120 credits all at 100%
        full.resetValues();
        full.addModuleMark(120, 100.0); 
        
        assertEquals("full @ 100%", 100.0, full.calculateAverageSoFar(), 0.0); 
        
        full.resetValues();
        full.addModuleMark(120, 43.92);
        
        assertEquals("full @ 43.92", 43.92, full.calculateAverageSoFar(), 0.0);
        
        full.resetValues();
        full.addModuleMark(120, 50);
        
        halfFull.resetValues();
        halfFull.addModuleMark(60, 50);
        
        assertEquals("Half Full - 60 - 50", 50, halfFull.calculateAverageSoFar(), 0.0);
        halfFull.resetValues();
        
        halfFull.addModuleMark(60, 100);
        assertEquals("Half Full - 60 - 100", 100, halfFull.calculateAverageSoFar(), 0.0);
        halfFull.resetValues();
        
        halfFull.addModuleMark(60, 64.77);
        assertEquals("Half Full - 60 - 64.77", 64.77, halfFull.calculateAverageSoFar(), 0.0);
        
        halfFull.resetValues();
        halfFull.addModuleMark(60, 50);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of predictClass method, of class StageResults.
     */
    @Test
    public void testPredictClass() {
        fail("The test case is a prototype.");
    }
    
}
