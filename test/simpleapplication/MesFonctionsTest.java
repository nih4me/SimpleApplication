/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package simpleapplication;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abdoulkader.kabore
 */
public class MesFonctionsTest {
    
    /**
     * Test of minimum method, of class MesFonctions.
     */
    @Test
    public void testMinimum() {
        System.out.println("minimum");
        int a = 10;
        int b = 20;
        MesFonctions instance = new MesFonctions();
        int expResult = 10;
        int result = instance.minimum(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of estPalindrome method, of class MesFonctions.
     */
    @Test
    public void testEstPalindrome() {
        System.out.println("estPalindrome");
        String ch = "LAVAL";
        MesFonctions instance = new MesFonctions();
        boolean expResult = true;
        boolean result = instance.estPalindrome(ch);
        assertEquals(expResult, result);
    }

    /**
     * Test of maximum method, of class MesFonctions.
     */
    @Test
    public void testMaximum() {
        System.out.println("maximum");
        int a = 40;
        int b = 3;
        MesFonctions instance = new MesFonctions();
        int expResult = 40;
        int result = instance.maximum(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of factorielle method, of class MesFonctions.
     */
    @Test
    public void testFactorielle() {
        System.out.println("factorielle");
        int n = 5;
        MesFonctions instance = new MesFonctions();
        int expResult = 120;
        int result = instance.factorielle(n);
        assertEquals(expResult, result);
    }
    
}
