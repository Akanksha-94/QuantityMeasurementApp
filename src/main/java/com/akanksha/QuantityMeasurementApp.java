package com.akanksha;

public class QuantityMeasurementApp {

  public enum LengthUnit {
    FEET(1.0),
    INCH(1.0 / 12.0),
    YARDS(3.0),
    CENTIMETERS(0.393701 / 12.0);

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

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (!(obj instanceof QuantityLength)) {
        return false;
      }
      QuantityLength other = (QuantityLength) obj;
      return Double.compare(this.toFeet(), other.toFeet()) == 0;
    }

    @Override
    public int hashCode() {
      return Double.hashCode(this.toFeet());
    }
  }

  // Backwards-compatible wrappers
  public static class Feet extends QuantityLength {
    public Feet(double value) {
      super(value, LengthUnit.FEET);
    }
  }

  public static class Inches extends QuantityLength {
    public Inches(double value) {
      super(value, LengthUnit.INCH);
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
    System.out.println("=== FEET EQUALITY CHECKS ===");
    Feet feet1 = new Feet(1.0);
    Feet feet2 = new Feet(1.0);

    System.out.println("Input: " + feet1.getValue() + " ft and " + feet2.getValue() + " ft");
    System.out.println("Output: " + (feet1.equals(feet2) ? "Equal (true)" : "Not Equal (false)"));

    Feet feet3 = new Feet(2.0);
    System.out.println("\nInput: " + feet1.getValue() + " ft and " + feet3.getValue() + " ft");
    System.out.println("Output: " + (feet1.equals(feet3) ? "Equal (true)" : "Not Equal (false)"));

    System.out.println("\nInput: " + feet1.getValue() + " ft and null");
    System.out.println("Output: " + (feet1.equals(null) ? "Equal (true)" : "Not Equal (false)"));

    System.out.println("\nInput: " + feet1.getValue() + " ft and \"1.0\" (String)");
    System.out.println("Output: " + (feet1.equals("1.0") ? "Equal (true)" : "Not Equal (false)"));

    System.out.println("\n=== INCHES EQUALITY CHECKS ===");
    Inches inches1 = new Inches(1.0);
    Inches inches2 = new Inches(1.0);

    System.out.println("Input: " + inches1.getValue() + " inch and " + inches2.getValue() + " inch");
    System.out.println("Output: " + (inches1.equals(inches2) ? "Equal (true)" : "Not Equal (false)"));

    Inches inches3 = new Inches(2.0);
    System.out.println("\nInput: " + inches1.getValue() + " inch and " + inches3.getValue() + " inch");
    System.out.println("Output: " + (inches1.equals(inches3) ? "Equal (true)" : "Not Equal (false)"));

    System.out.println("\nInput: " + inches1.getValue() + " inch and null");
    System.out.println("Output: " + (inches1.equals(null) ? "Equal (true)" : "Not Equal (false)"));

    System.out.println("\nInput: " + inches1.getValue() + " inch and \"1.0\" (String)");
    System.out.println("Output: " + (inches1.equals("1.0") ? "Equal (true)" : "Not Equal (false)"));

    System.out.println("\n=== CROSS-UNIT EQUALITY CHECKS ===");
    Feet oneFoot = new Feet(1.0);
    Inches twelveInches = new Inches(12.0);
    System.out.println("Input: " + oneFoot.getValue() + " ft and " + twelveInches.getValue() + " inch");
    System.out.println("Output: " + (oneFoot.equals(twelveInches) ? "Equal (true)" : "Not Equal (false)"));

    System.out.println("\n=== YARDS EQUALITY CHECKS ===");
    Yards yards1 = new Yards(1.0);
    Yards yards2 = new Yards(1.0);

    System.out.println("Input: Quantity(1.0, YARDS) and Quantity(1.0, YARDS)");
    System.out.println("Output: " + (yards1.equals(yards2) ? "Equal (true)" : "Not Equal (false)"));

    Yards yards3 = new Yards(2.0);
    System.out.println("\nInput: Quantity(1.0, YARDS) and Quantity(2.0, YARDS)");
    System.out.println("Output: " + (yards1.equals(yards3) ? "Equal (true)" : "Not Equal (false)"));

    Yards oneYard = new Yards(1.0);
    Feet threeFeot = new Feet(3.0);
    System.out.println("\nInput: Quantity(1.0, YARDS) and Quantity(3.0, FEET)");
    System.out.println("Output: " + (oneYard.equals(threeFeot) ? "Equal (true)" : "Not Equal (false)"));

    Yards yardForInches = new Yards(1.0);
    Inches thirtyySixInches = new Inches(36.0);
    System.out.println("\nInput: Quantity(1.0, YARDS) and Quantity(36.0, INCHES)");
    System.out.println("Output: " + (yardForInches.equals(thirtyySixInches) ? "Equal (true)" : "Not Equal (false)"));

    System.out.println("\n=== CENTIMETERS EQUALITY CHECKS ===");
    Centimeters cm1 = new Centimeters(2.0);
    Centimeters cm2 = new Centimeters(2.0);

    System.out.println("Input: Quantity(2.0, CENTIMETERS) and Quantity(2.0, CENTIMETERS)");
    System.out.println("Output: " + (cm1.equals(cm2) ? "Equal (true)" : "Not Equal (false)"));

    Centimeters oneCm = new Centimeters(1.0);
    Inches cmToInches = new Inches(0.393701);
    System.out.println("\nInput: Quantity(1.0, CENTIMETERS) and Quantity(0.393701, INCHES)");
    System.out.println("Output: " + (oneCm.equals(cmToInches) ? "Equal (true)" : "Not Equal (false)"));
  }
}
