package com.rtaylor02;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @BeforeAll
    public static void setUpClass() {
        System.out.println("before all");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("before each");
    }

    @Test
    public void canaryTest_true() {
        assertTrue(true);
    }

    @Test
    public void canaryTest_false() {
        assertFalse(false);
    }
}
