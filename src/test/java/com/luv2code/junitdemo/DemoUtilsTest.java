package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("before each");
    }

    @BeforeAll
    static void setupBeforeAllClass() {
        System.out.println("before all");
    }

    @AfterAll
    static void setupAfterAllClass() {
        System.out.println("after all");
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("after each");
    }

    @Test
    @Order(-3)
    @DisplayName("equals or not equals")
    void testEqualsAndNotEquals() {
        DemoUtils demoUtils = new DemoUtils();

        assertEquals(6, demoUtils.add(2,4), "2+4 equals 6");
        assertNotEquals(7, demoUtils.add(2,4), "2+4 not equals 7");
    }

    @Test
    @Order(0)
    @DisplayName("null or not null")
    void testNullAndNotNull() {
        DemoUtils demoUtils = new DemoUtils();

        String str1 = null;
        String str2 = "asdf";

        assertNull(demoUtils.checkNull(str1), "should be null");
        assertNotNull(demoUtils.checkNull(str2), "should be not null");
    }
}






