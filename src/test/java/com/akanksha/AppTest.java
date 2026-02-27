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

    // Yards test variables
    private QuantityMeasurementApp.Yards yards1;
    private QuantityMeasurementApp.Yards yards2;

    // Centimeters test variables
    private QuantityMeasurementApp.Centimeters cm1;
    private QuantityMeasurementApp.Centimeters cm2;

    @Before
    public void setUp() {
        feet1 = new QuantityMeasurementApp.Feet(1.0);
        feet2 = new QuantityMeasurementApp.Feet(1.0);
        inches1 = new QuantityMeasurementApp.Inches(1.0);
        inches2 = new QuantityMeasurementApp.Inches(1.0);
        yards1 = new QuantityMeasurementApp.Yards(1.0);
        yards2 = new QuantityMeasurementApp.Yards(1.0);
        cm1 = new QuantityMeasurementApp.Centimeters(1.0);
        cm2 = new QuantityMeasurementApp.Centimeters(1.0);
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

    @Test
    public void testFeetInches_CrossUnit_EquivalentValue() {
        QuantityMeasurementApp.Feet oneFoot = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Inches twelveInches = new QuantityMeasurementApp.Inches(12.0);
        assertTrue(oneFoot.equals(twelveInches));
    }

    @Test
    public void testInchesFeeet_CrossUnit_EquivalentValue() {
        QuantityMeasurementApp.Inches twelveInches = new QuantityMeasurementApp.Inches(12.0);
        QuantityMeasurementApp.Feet oneFoot = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(twelveInches.equals(oneFoot));
    }

    @Test
    public void testFeetInches_CrossUnit_NonEquivalentValue() {
        QuantityMeasurementApp.Feet oneFoot = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Inches sixInches = new QuantityMeasurementApp.Inches(6.0);
        assertFalse(oneFoot.equals(sixInches));
    }

    // ===== YARDS TEST CASES =====

    @Test
    public void testEquality_YardToYard_SameValue() {
        assertTrue(yards1.equals(yards2));
    }

    @Test
    public void testEquality_YardToYard_DifferentValue() {
        QuantityMeasurementApp.Yards yards3 = new QuantityMeasurementApp.Yards(2.0);
        assertFalse(yards1.equals(yards3));
    }

    @Test
    public void testEquality_YardToFeet_EquivalentValue() {
        QuantityMeasurementApp.Yards oneYard = new QuantityMeasurementApp.Yards(1.0);
        QuantityMeasurementApp.Feet threeFeet = new QuantityMeasurementApp.Feet(3.0);
        assertTrue(oneYard.equals(threeFeet));
    }

    @Test
    public void testEquality_FeetToYard_EquivalentValue() {
        QuantityMeasurementApp.Feet threeFeet = new QuantityMeasurementApp.Feet(3.0);
        QuantityMeasurementApp.Yards oneYard = new QuantityMeasurementApp.Yards(1.0);
        assertTrue(threeFeet.equals(oneYard));
    }

    @Test
    public void testEquality_YardToInches_EquivalentValue() {
        QuantityMeasurementApp.Yards oneYard = new QuantityMeasurementApp.Yards(1.0);
        QuantityMeasurementApp.Inches thirtySixInches = new QuantityMeasurementApp.Inches(36.0);
        assertTrue(oneYard.equals(thirtySixInches));
    }

    @Test
    public void testEquality_InchesToYard_EquivalentValue() {
        QuantityMeasurementApp.Inches thirtySixInches = new QuantityMeasurementApp.Inches(36.0);
        QuantityMeasurementApp.Yards oneYard = new QuantityMeasurementApp.Yards(1.0);
        assertTrue(thirtySixInches.equals(oneYard));
    }

    @Test
    public void testEquality_YardToFeet_NonEquivalentValue() {
        QuantityMeasurementApp.Yards oneYard = new QuantityMeasurementApp.Yards(1.0);
        QuantityMeasurementApp.Feet twoFeet = new QuantityMeasurementApp.Feet(2.0);
        assertFalse(oneYard.equals(twoFeet));
    }

    @Test
    public void testEquality_YardWithNullUnit() {
        assertFalse(yards1.equals(null));
    }

    @Test
    public void testEquality_YardSameReference() {
        assertTrue(yards1.equals(yards1));
    }

    @Test
    public void testEquality_YardNullComparison() {
        assertFalse(yards1.equals(null));
    }

    @Test
    public void testEquality_YardReflexiveProperty() {
        assertTrue(yards1.equals(yards1));
    }

    @Test
    public void testEquality_YardSymmetricProperty() {
        QuantityMeasurementApp.Yards yardA = new QuantityMeasurementApp.Yards(5.0);
        QuantityMeasurementApp.Yards yardB = new QuantityMeasurementApp.Yards(5.0);

        assertTrue(yardA.equals(yardB));
        assertTrue(yardB.equals(yardA));
    }

    @Test
    public void testEquality_YardTransitiveProperty() {
        QuantityMeasurementApp.Yards yardA = new QuantityMeasurementApp.Yards(1.0);
        QuantityMeasurementApp.Feet feetB = new QuantityMeasurementApp.Feet(3.0);
        QuantityMeasurementApp.Inches inchesC = new QuantityMeasurementApp.Inches(36.0);

        assertTrue(yardA.equals(feetB));
        assertTrue(feetB.equals(inchesC));
        assertTrue(yardA.equals(inchesC));
    }

    // ===== CENTIMETERS TEST CASES =====

    @Test
    public void testEquality_CentimeterToCentimeter_SameValue() {
        assertTrue(cm1.equals(cm2));
    }

    @Test
    public void testEquality_CentimeterToCentimeter_DifferentValue() {
        QuantityMeasurementApp.Centimeters cm3 = new QuantityMeasurementApp.Centimeters(2.0);
        assertFalse(cm1.equals(cm3));
    }

    @Test
    public void testEquality_CentimeterToInches_EquivalentValue() {
        QuantityMeasurementApp.Centimeters oneCm = new QuantityMeasurementApp.Centimeters(1.0);
        QuantityMeasurementApp.Inches inchesFromCm = new QuantityMeasurementApp.Inches(0.393701);
        assertTrue(oneCm.equals(inchesFromCm));
    }

    @Test
    public void testEquality_InchesToCentimeter_EquivalentValue() {
        QuantityMeasurementApp.Inches inchesFromCm = new QuantityMeasurementApp.Inches(0.393701);
        QuantityMeasurementApp.Centimeters oneCm = new QuantityMeasurementApp.Centimeters(1.0);
        assertTrue(inchesFromCm.equals(oneCm));
    }

    @Test
    public void testEquality_CentimeterToFeet_NonEquivalentValue() {
        QuantityMeasurementApp.Centimeters oneCm = new QuantityMeasurementApp.Centimeters(1.0);
        QuantityMeasurementApp.Feet oneFoot = new QuantityMeasurementApp.Feet(1.0);
        assertFalse(oneCm.equals(oneFoot));
    }

    @Test
    public void testEquality_CentimetersWithNullUnit() {
        assertFalse(cm1.equals(null));
    }

    @Test
    public void testEquality_CentimetersSameReference() {
        assertTrue(cm1.equals(cm1));
    }

    @Test
    public void testEquality_CentimetersNullComparison() {
        assertFalse(cm1.equals(null));
    }

    @Test
    public void testEquality_CentimetersReflexiveProperty() {
        assertTrue(cm1.equals(cm1));
    }

    @Test
    public void testEquality_CentimetersSymmetricProperty() {
        QuantityMeasurementApp.Centimeters cmA = new QuantityMeasurementApp.Centimeters(5.0);
        QuantityMeasurementApp.Centimeters cmB = new QuantityMeasurementApp.Centimeters(5.0);

        assertTrue(cmA.equals(cmB));
        assertTrue(cmB.equals(cmA));
    }

    @Test
    public void testEquality_CentimetersTransitiveProperty() {
        QuantityMeasurementApp.Centimeters cm5 = new QuantityMeasurementApp.Centimeters(5.0);
        QuantityMeasurementApp.Centimeters cm5b = new QuantityMeasurementApp.Centimeters(5.0);
        QuantityMeasurementApp.Centimeters cm5c = new QuantityMeasurementApp.Centimeters(5.0);

        assertTrue(cm5.equals(cm5b));
        assertTrue(cm5b.equals(cm5c));
        assertTrue(cm5.equals(cm5c));
    }

    // ===== COMPLEX MULTI-UNIT TEST CASES =====

    @Test
    public void testEquality_AllUnits_ComplexScenario() {
        QuantityMeasurementApp.Yards twoYards = new QuantityMeasurementApp.Yards(2.0);
        QuantityMeasurementApp.Feet sixFeet = new QuantityMeasurementApp.Feet(6.0);
        QuantityMeasurementApp.Inches seventyTwoInches = new QuantityMeasurementApp.Inches(72.0);

        assertTrue(twoYards.equals(sixFeet));
        assertTrue(sixFeet.equals(seventyTwoInches));
        assertTrue(twoYards.equals(seventyTwoInches));
    }

    @Test
    public void testHashCode_SameValue() {
        QuantityMeasurementApp.Yards yard1 = new QuantityMeasurementApp.Yards(1.0);
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(3.0);
        assertEquals(yard1.hashCode(), feet.hashCode());
    }

    private void assertEquals(int hash1, int hash2) {
        assertTrue(hash1 == hash2);
    }
}
