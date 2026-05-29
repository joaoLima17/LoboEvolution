package org.loboevolution.ProjectTests;

import org.junit.jupiter.api.Test;
import org.loboevolution.html.style.FontValues;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataFlowTests {

    @Test
    public void AllDefsTest1() {
        Integer num = FontValues.getFontSuperScript("sub", new MockRenderState(), false, false);
        assertEquals(-1, num);
    }

    @Test
    public void AllDefsTest2() {
        Integer num = FontValues.getFontSuperScript("super", null, true, false);
        assertEquals(1, num);
    }

    @Test
    public void AllUsesTest1() {
        Integer num = FontValues.getFontSuperScript("", null, false, false);
        assertEquals(null, num);
    }

    @Test
    public void AllUsesTest2() {
        Integer num = FontValues.getFontSuperScript("super", null, true, false);
        assertEquals(1, num);
    }

    @Test
    public void AllUsesTest3() {
        Integer num = FontValues.getFontSuperScript("sub", null, false, true);
        assertEquals(-1, num);
    }

    @Test
    public void AllUsesTest4() {
        Integer num = FontValues.getFontSuperScript("", new MockRenderState(), false, false);
        assertEquals(1, num);
    }

}
