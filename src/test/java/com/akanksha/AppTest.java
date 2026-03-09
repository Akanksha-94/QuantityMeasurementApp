package com.akanksha;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testConversion_FeetToInches() {
        double result = QuantityMeasurementApp.QuantityLength.convert(
                1.0,
                QuantityMeasurementApp.LengthUnit.FEET,
                QuantityMeasurementApp.LengthUnit.INCHES
        );

        assertEquals(12.0, result, 0.0001);
    }

    @Test
    public void testConversion_InchesToFeet() {
        double result = QuantityMeasurementApp.QuantityLength.convert(
                24.0,
                QuantityMeasurementApp.LengthUnit.INCHES,
                QuantityMeasurementApp.LengthUnit.FEET
        );

        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testConversion_YardsToInches() {
        double result = QuantityMeasurementApp.QuantityLength.convert(
                1.0,
                QuantityMeasurementApp.LengthUnit.YARDS,
                QuantityMeasurementApp.LengthUnit.INCHES
        );

        assertEquals(36.0, result, 0.0001);
    }

    @Test
    public void testConversion_InchesToYards() {
        double result = QuantityMeasurementApp.QuantityLength.convert(
                72.0,
                QuantityMeasurementApp.LengthUnit.INCHES,
                QuantityMeasurementApp.LengthUnit.YARDS
        );

        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testConversion_CentimetersToInches() {
        double result = QuantityMeasurementApp.QuantityLength.convert(
                2.54,
                QuantityMeasurementApp.LengthUnit.CENTIMETERS,
                QuantityMeasurementApp.LengthUnit.INCHES
        );

        assertEquals(1.0, result, 0.01);
    }

    @Test
    public void testConversion_FeetToYards() {
        double result = QuantityMeasurementApp.QuantityLength.convert(
                6.0,
                QuantityMeasurementApp.LengthUnit.FEET,
                QuantityMeasurementApp.LengthUnit.YARDS
        );

        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testConversion_ZeroValue() {
        double result = QuantityMeasurementApp.QuantityLength.convert(
                0.0,
                QuantityMeasurementApp.LengthUnit.FEET,
                QuantityMeasurementApp.LengthUnit.INCHES
        );

        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testConversion_NegativeValue() {
        double result = QuantityMeasurementApp.QuantityLength.convert(
                -1.0,
                QuantityMeasurementApp.LengthUnit.FEET,
                QuantityMeasurementApp.LengthUnit.INCHES
        );

        assertEquals(-12.0, result, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConversion_InvalidUnit() {
        QuantityMeasurementApp.QuantityLength.convert(
                1.0,
                null,
                QuantityMeasurementApp.LengthUnit.INCHES
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConversion_NaN() {
        QuantityMeasurementApp.QuantityLength.convert(
                Double.NaN,
                QuantityMeasurementApp.LengthUnit.FEET,
                QuantityMeasurementApp.LengthUnit.INCHES
        );
    }

}