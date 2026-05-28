package org.loboevolution.ProjectTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mozilla.javascript.Kit.xDigitToInt;

public class equivalenceBoundary_Tests {

    @Test
    public void T1_testEquivalence_Boundary() {
        int result= xDigitToInt(47, 0);
        assertEquals(-1, result);
    }
    @Test
    public void T2_testEquivalence_Boundary() {
        int result= xDigitToInt(53, 1);
        assertEquals(21, result);
    }
    @Test
    public void T3_testEquivalence_Boundary() {
        int result= xDigitToInt(58, -1);
        assertEquals(-1, result);
    }
    @Test
    public void T4_testEquivalence_Boundary() {
        int result= xDigitToInt(68, 0);
        assertEquals(13, result);
    }
    @Test
    public void T5_testEquivalence_Boundary() {
        int result= xDigitToInt(71, 1);
        assertEquals(-1, result);
    }
    @Test
    public void T6_testEquivalence_Boundary() {
        int result= xDigitToInt(100, -1);
        assertEquals(-3, result);
    }
    @Test
    public void T7_testEquivalence_Boundary() {
        int result= xDigitToInt(103, 0);
        assertEquals(-1, result);
    }

    @Test
    public void T29_testEquivalence_Boundary() {
        int result= xDigitToInt(52, 0);
        assertEquals(4, result);
    }
    @Test
    public void T30_testEquivalence_Boundary() {
        int result= xDigitToInt(48, 0);
        assertEquals(0, result);
    }
    @Test
    public void T31_testEquivalence_Boundary() {
        int result= xDigitToInt(49, 0);
        assertEquals(1, result);
    }
    @Test
    public void T32_testEquivalence_Boundary() {
        int result= xDigitToInt(56, 0);
        assertEquals(8, result);
    }
    @Test
    public void T33_testEquivalence_Boundary() {
        int result= xDigitToInt(57, 0);
        assertEquals(9, result);
    }
    @Test
    public void T34_testEquivalence_Boundary() {
        int result= xDigitToInt(52, -2147483647);
        assertEquals(20, result);
    }
    @Test
    public void T35_testEquivalence_Boundary() {
        int result= xDigitToInt(52, -2147483646);
        assertEquals(36, result);
    }
    @Test
    public void T36_testEquivalence_Boundary() {
        int result= xDigitToInt(52, 2147483645);
        assertEquals(-44, result);
    }
    @Test
    public void T37_testEquivalence_Boundary() {
        int result= xDigitToInt(52, 2147483646);
        assertEquals(-28, result);
    }

}
