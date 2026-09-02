package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testHighPurchaseDiscount() {
        App app = new App();
        assertEquals(1000.0, app.calculateDiscount(5000), 0.01);
    }

    @Test
    public void testMediumPurchaseDiscount() {
        App app = new App();
        assertEquals(200.0, app.calculateDiscount(2000), 0.01);
    }

    @Test
    public void testLowPurchaseNoDiscount() {
        App app = new App();
        assertEquals(0.0, app.calculateDiscount(1000), 0.01);
    }

    @Test
    public void testHighAmount() {
        App app = new App();
        assertEquals(2000.0, app.calculateDiscount(10000), 0.01);
    }

    @Test
    public void testBoundaryAmount() {
        App app = new App();
        assertEquals(200.0, app.calculateDiscount(2000), 0.01);
    }
}
