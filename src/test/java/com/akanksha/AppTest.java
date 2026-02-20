package com.akanksha;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

    private QuantityMeasurementApp.Feet feet1;
    private QuantityMeasurementApp.Feet feet2;

    @Before
    public void setUp() {
        feet1 = new QuantityMeasurementApp.Feet(1.0);
        feet2 = new QuantityMeasurementApp.Feet(1.0);
    }

    @Test
    public void testEquality_SameValue() {
        assertTrue(feet1.equals(feet2));
    }

    @Test
    public void testEquality_DifferentValue() {
        QuantityMeasurementApp.Feet feet3 = new QuantityMeasurementApp.Feet(2.0);
        assertFalse(feet1.equals(feet3));
    }

    @Test
    public void testEquality_NullComparison() {
        assertFalse(feet1.equals(null));
    }

    @Test
    public void testEquality_NonNumericInput() {
        assertFalse(feet1.equals("1.0"));
    }

    @Test
    public void testEquality_SameReference() {
        assertTrue(feet1.equals(feet1));
    }

    @Test
    public void testEquality_ReflexiveProperty() {
        assertTrue(feet1.equals(feet1));
    }

    @Test
    public void testEquality_SymmetricProperty() {
        QuantityMeasurementApp.Feet feetA = new QuantityMeasurementApp.Feet(5.0);
        QuantityMeasurementApp.Feet feetB = new QuantityMeasurementApp.Feet(5.0);

        assertTrue(feetA.equals(feetB));
        assertTrue(feetB.equals(feetA));
    }

    @Test
    public void testEquality_TransitiveProperty() {
        QuantityMeasurementApp.Feet feetA = new QuantityMeasurementApp.Feet(3.0);
        QuantityMeasurementApp.Feet feetB = new QuantityMeasurementApp.Feet(3.0);
        QuantityMeasurementApp.Feet feetC = new QuantityMeasurementApp.Feet(3.0);

        assertTrue(feetA.equals(feetB));
        assertTrue(feetB.equals(feetC));
        assertTrue(feetA.equals(feetC));
    }

    @Test
    public void testEquality_ConsistentProperty() {
        assertTrue(feet1.equals(feet2));
        assertTrue(feet1.equals(feet2));
        assertTrue(feet1.equals(feet2));
    }
}
