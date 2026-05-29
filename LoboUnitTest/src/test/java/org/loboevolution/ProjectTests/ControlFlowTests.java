package org.loboevolution.ProjectTests;

import org.loboevolution.html.style.GradientStyle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mozilla.javascript.Kit.xDigitToInt;

public class ControlFlowTests {

    @Test
    public void StatementCoverageTest() {
        char[] input = "(#)".toCharArray();
        int result= GradientStyle.countColorsInGradient(input);
        assertEquals(1, result);
    }

    @Test
    public void DecisionCoverageTest() {
        char[] input = "(#f)".toCharArray();
        int result= GradientStyle.countColorsInGradient(input);
        assertEquals(1, result);
    }

    @Test
    public void ConditionCoverageTest() {
        char[] input = "(#,f)".toCharArray();
        int result= GradientStyle.countColorsInGradient(input);
        assertEquals(2, result);
    }

    @Test
    public void ConditionDecisionCoverageTest() {
        char[] input = "(#f,f)".toCharArray();
        int result= GradientStyle.countColorsInGradient(input);
        assertEquals(2, result);
    }

    @Test
    public void ModifiedConditionDecisionCoverageTest1() {
        char[] input = "(#f,f)".toCharArray();
        int result= GradientStyle.countColorsInGradient(input);
        assertEquals(2, result);
    }

    @Test
    public void ModifiedConditionDecisionCoverageTest2() {
        char[] input = "(#f,)".toCharArray();
        int result= GradientStyle.countColorsInGradient(input);
        assertEquals(1, result);
    }

    @Test
    public void IndependentPathTest1() {
        char[] input = "".toCharArray();
        int result= GradientStyle.countColorsInGradient(input);
        assertEquals(0, result);
    }

    @Test
    public void IndependentPathTest2() {
        char[] input = "-".toCharArray();
        int result= GradientStyle.countColorsInGradient(input);
        assertEquals(0, result);
    }

    @Test
    public void IndependentPathTest3() {
        char[] input = ")".toCharArray();
        int result= GradientStyle.countColorsInGradient(input);
        assertEquals(0, result);
    }

    @Test
    public void IndependentPathTest4() {
        char[] input = "A".toCharArray();
        int result= GradientStyle.countColorsInGradient(input);
        assertEquals(1, result);
    }

    @Test
    public void IndependentPathTest5() {
        char[] input = "AA".toCharArray();
        int result= GradientStyle.countColorsInGradient(input);
        assertEquals(1, result);
    }
}
