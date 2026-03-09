package com.akanksha;

public class QuantityMeasurementApp {

    public enum LengthUnit {
        FEET(1.0),
        INCHES(1.0 / 12.0),
        YARDS(3.0),
        CENTIMETERS(0.0328084);

        private final double toFeetFactor;

        LengthUnit(double toFeetFactor) {
            this.toFeetFactor = toFeetFactor;
        }

        public double toFeet(double value) {
            return value * toFeetFactor;
        }

        public double getToFeetFactor() {
            return toFeetFactor;
        }
    }

    public static class QuantityLength {

        private final double value;
        private final LengthUnit unit;

        public QuantityLength(double value, LengthUnit unit) {

            if (!Double.isFinite(value))
                throw new IllegalArgumentException("Invalid value");

            if (unit == null)
                throw new IllegalArgumentException("Unit cannot be null");

            this.value = value;
            this.unit = unit;
        }

        public double getValue() {
            return value;
        }

        public LengthUnit getUnit() {
            return unit;
        }

        public double toFeet() {
            return unit.toFeet(value);
        }

        // UC5 INSTANCE METHOD
        public QuantityLength convertTo(LengthUnit targetUnit) {

            if (targetUnit == null)
                throw new IllegalArgumentException("Target unit cannot be null");

            double baseFeet = this.toFeet();
            double convertedValue = baseFeet / targetUnit.getToFeetFactor();

            return new QuantityLength(convertedValue, targetUnit);
        }

        // UC5 STATIC API
        public static double convert(double value, LengthUnit source, LengthUnit target) {

            if (!Double.isFinite(value))
                throw new IllegalArgumentException("Invalid numeric value");

            if (source == null || target == null)
                throw new IllegalArgumentException("Units cannot be null");

            double baseFeet = source.toFeet(value);

            return baseFeet / target.getToFeetFactor();
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (!(obj instanceof QuantityLength))
                return false;

            QuantityLength other = (QuantityLength) obj;

            double epsilon = 1e-6;

            return Math.abs(this.toFeet() - other.toFeet()) < epsilon;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(this.toFeet());
        }

        @Override
        public String toString() {
            return value + " " + unit;
        }
    }

    // Wrapper Classes
    public static class Feet extends QuantityLength {
        public Feet(double value) {
            super(value, LengthUnit.FEET);
        }
    }

    public static class Inches extends QuantityLength {
        public Inches(double value) {
            super(value, LengthUnit.INCHES);
        }
    }

    public static class Yards extends QuantityLength {
        public Yards(double value) {
            super(value, LengthUnit.YARDS);
        }
    }

    public static class Centimeters extends QuantityLength {
        public Centimeters(double value) {
            super(value, LengthUnit.CENTIMETERS);
        }
    }

    public static void main(String[] args) {

        System.out.println("UC5 Unit Conversion");

        System.out.println(QuantityLength.convert(1.0, LengthUnit.FEET, LengthUnit.INCHES));
        System.out.println(QuantityLength.convert(3.0, LengthUnit.YARDS, LengthUnit.FEET));
        System.out.println(QuantityLength.convert(36.0, LengthUnit.INCHES, LengthUnit.YARDS));
        System.out.println(QuantityLength.convert(1.0, LengthUnit.CENTIMETERS, LengthUnit.INCHES));
    }
}