package com.nguyenhanhatminh;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testIsPrimeCN() {
        assertFalse(App.isPrimeCN(1));
        assertTrue(App.isPrimeCN(7));
        assertFalse(App.isPrimeCN(9));
    }

    @Test
    public void testIsPrimeVSN() {
        assertFalse(App.isPrimeVSN(0));
        assertTrue(App.isPrimeVSN(11));
        assertFalse(App.isPrimeVSN(15));
    }

    @Test
    public void testIsPrimeVN() {
        assertFalse(App.isPrimeVN(-5));
        assertTrue(App.isPrimeVN(13));
        assertFalse(App.isPrimeVN(100));
    }
}
