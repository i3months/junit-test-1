package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class ConditionalTest {

    @Mock
    ApplicationContext context;

    @Test
    @Disabled("disable this test")
    void basicTest() {

    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowOnly() {

    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    void testForTwoOS() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_14)
    void testForJava14() {

    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_8, max=JRE.JAVA_17)
    void testForJavaRange() {

    }

    @Test
    @EnabledIfEnvironmentVariable(named="ENV123", matches="DEV")
    void testForEnv() {

    }

    @Test
    @EnabledIfSystemProperty(named="SYS123", matches="CI_CD")
    void testForSystem() {

    }

}
