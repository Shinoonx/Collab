package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    int numero_Par;

    int numero_inpar;
    @BeforeEach
    void setUp() {
        numero_Par = 4;
        numero_inpar= 9;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testMain() {
    }

    @Test
    void testSum() {
        assertTrue(Main.sum(numero_Par));
        assertFalse(Main.sum(numero_inpar));
    }
}