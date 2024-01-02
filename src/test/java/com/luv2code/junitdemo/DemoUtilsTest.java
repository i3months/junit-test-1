package com.luv2code.junitdemo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {

    @Test
    void testEqualsAndNotEquals() {
        DemoUtils demoUtils = new DemoUtils();

        assertEquals(6, demoUtils.add(2,4), "2+4 equals 6");
        assertNotEquals(7, demoUtils.add(2,4), "2+4 not equals 7");
    }

    @Test
    void testNullAndNotNull() {
        DemoUtils demoUtils = new DemoUtils();

        String str1 = null;
        String str2 = "asdf";

        assertNull(demoUtils.checkNull(str1), "should be null");
        assertNotNull(demoUtils.checkNull(str2), "should be not null");
    }
}






