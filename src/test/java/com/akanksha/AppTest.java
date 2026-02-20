package com.akanksha;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

    // Feet test variables
    private QuantityMeasurementApp.Feet feet1;
    private QuantityMeasurementApp.Feet feet2;

    // Inches test variables
    private QuantityMeasurementApp.Inches inches1;
    private QuantityMeasurementApp.Inches inches2;

    @Before
    public void setUp() {
        feet1 = new QuantityMeasurementApp.Feet(1.0);
        feet2 = new QuantityMeasurementApp.Feet(1.0);
        inches1 = new QuantityMeasurementApp.Inches(1.0);
        inches2 = new QuantityMeasurementApp.Inches(1.0);
    }

    // ===== FEET TEST CASES =====

    @Test
    public void testFeetEquality_SameValue() {
        assertTrue(feet1.equals(feet2));
    }

    @Test
    public void testFeetEquality_DifferentValue() {
        QuantityMeasurementApp.Feet feet3 = new QuantityMeasurementApp.Feet(2.0);
        assertFalse(feet1.equals(feet3));
    }

    @Test
    public void testFeetEquality_NullComparison() {
        assertFalse(feet1.equals(null));
    }

    @Test
    public void testFeetEquality_NonNumericInput() {
        assertFalse(feet1.equals("1.0"));
    }

    @Test
    public void testFeetEquality_SameReference() {
        assertTrue(feet1.equals(feet1));
    }

    @Test
    public void testFeetEquality_ReflexiveProperty() {
        assertTrue(feet1.equals(feet1));
    }

    @Test
    public void testFeetEquality_SymmetricProperty() {
        QuantityMeasurementApp.Feet feetA = new QuantityMeasurementApp.Feet(5.0);
        QuantityMeasurementApp.Feet feetB = new QuantityMeasurementApp.Feet(5.0);

        assertTrue(feetA.equals(feetB));
        assertTrue(feetB.equals(feetA));
    }

    @Test
    public void testFeetEquality_TransitiveProperty() {
        QuantityMeasurementApp.Feet feetA = new QuantityMeasurementApp.Feet(3.0);
        QuantityMeasurementApp.Feet feetB = new QuantityMeasurementApp.Feet(3.0);
        QuantityMeasurementApp.Feet feetC = new QuantityMeasurementApp.Feet(3.0);

        assertTrue(feetA.equals(feetB));
        assertTrue(feetB.equals(feetC));
        assertTrue(feetA.equals(feetC));
    }

    @Test
    public void testFeetEquality_ConsistentProperty() {
        assertTrue(feet1.equals(feet2));
        assertTrue(feet1.equals(feet2));
        assertTrue(feet1.equals(feet2));
    }

    @Test
    public void testFeetEquality_ZeroValue() {
        QuantityMeasurementApp.Feet feetZero1 = new QuantityMeasurementApp.Feet(0.0);
        QuantityMeasurementApp.Feet feetZero2 = new QuantityMeasurementApp.Feet(0.0);
        assertTrue(feetZero1.equals(feetZero2));
    }

    @Test
    public void testFeetEquality_NegativeValue() {
        QuantityMeasurementApp.Feet feetNeg1 = new QuantityMeasurementApp.Feet(-5.0);
        QuantityMeasurementApp.Feet feetNeg2 = new QuantityMeasurementApp.Feet(-5.0);
        assertTrue(feetNeg1.equals(feetNeg2));
    }

    @Test
    public void testFeetEquality_DecimalPrecision() {
        QuantityMeasurementApp.Feet feetDecimal1 = new QuantityMeasurementApp.Feet(1.5);
        QuantityMeasurementApp.Feet feetDecimal2 = new QuantityMeasurementApp.Feet(1.5);
        assertTrue(feetDecimal1.equals(feetDecimal2));
    }

    // ===== INCHES TEST CASES =====

    @Test
    public void testInchesEquality_SameValue() {
        assertTrue(inches1.equals(inches2));
    }

    @Test
    public void testInchesEquality_DifferentValue() {
        QuantityMeasurementApp.Inches inches3 = new QuantityMeasurementApp.Inches(2.0);
        assertFalse(inches1.equals(inches3));
    }

    @Test
    public void testInchesEquality_NullComparison() {
        assertFalse(inches1.equals(null));
    }

    @Test
    public void testInchesEquality_NonNumericInput() {
        assertFalse(inches1.equals("1.0"));
    }

    @Test
    public void testInchesEquality_SameReference() {
        assertTrue(inches1.equals(inches1));
    }

    @Test
    public void testInchesEquality_ReflexiveProperty() {
        assertTrue(inches1.equals(inches1));
    }

    @Test
    public void testInchesEquality_SymmetricProperty() {
        QuantityMeasurementApp.Inches inchesA = new QuantityMeasurementApp.Inches(5.0);
        QuantityMeasurementApp.Inches inchesB = new QuantityMeasurementApp.Inches(5.0);

        assertTrue(inchesA.equals(inchesB));
        assertTrue(inchesB.equals(inchesA));
    }

    @Test
    public void testInchesEquality_TransitiveProperty() {
        QuantityMeasurementApp.Inches inchesA = new QuantityMeasurementApp.Inches(3.0);
        QuantityMeasurementApp.Inches inchesB = new QuantityMeasurementApp.Inches(3.0);
        QuantityMeasurementApp.Inches inchesC = new QuantityMeasurementApp.Inches(3.0);

        assertTrue(inchesA.equals(inchesB));
        assertTrue(inchesB.equals(inchesC));
        assertTrue(inchesA.equals(inchesC));
    }

    @Test
    public void testInchesEquality_ConsistentProperty() {
        assertTrue(inches1.equals(inches2));
        assertTrue(inches1.equals(inches2));
        assertTrue(inches1.equals(inches2));
    }

    @Test
    public void testInchesEquality_ZeroValue() {
        QuantityMeasurementApp.Inches inchesZero1 = new QuantityMeasurementApp.Inches(0.0);
        QuantityMeasurementApp.Inches inchesZero2 = new QuantityMeasurementApp.Inches(0.0);
        assertTrue(inchesZero1.equals(inchesZero2));
    }

    @Test
    public void testInchesEquality_NegativeValue() {
        QuantityMeasurementApp.Inches inchesNeg1 = new QuantityMeasurementApp.Inches(-5.0);
        QuantityMeasurementApp.Inches inchesNeg2 = new QuantityMeasurementApp.Inches(-5.0);
        assertTrue(inchesNeg1.equals(inchesNeg2));
    }

    @Test
    public void testInchesEquality_DecimalPrecision() {
        QuantityMeasurementApp.Inches inchesDecimal1 = new QuantityMeasurementApp.Inches(1.5);
        QuantityMeasurementApp.Inches inchesDecimal2 = new QuantityMeasurementApp.Inches(1.5);
        assertTrue(inchesDecimal1.equals(inchesDecimal2));
    }

    @Test
    public void testInchesEquality_DifferentClassComparison() {
        assertFalse(inches1.equals(feet1));
    }
}
