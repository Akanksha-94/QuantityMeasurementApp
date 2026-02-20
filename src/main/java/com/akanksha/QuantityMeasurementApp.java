package com.akanksha;

public class QuantityMeasurementApp {

  public static class Feet {
    private final double value;

    public Feet(double value) {
      this.value = value;
    }

    public double getValue() {
      return value;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || this.getClass() != obj.getClass()) {
        return false;
      }
      Feet feet = (Feet) obj;
      return Double.compare(this.value, feet.value) == 0;
    }

    @Override
    public int hashCode() {
      return Double.hashCode(value);
    }
  }

  public static class Inches {
    private final double value;

    public Inches(double value) {
      this.value = value;
    }

    public double getValue() {
      return value;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || this.getClass() != obj.getClass()) {
        return false;
      }
      Inches inches = (Inches) obj;
      return Double.compare(this.value, inches.value) == 0;
    }

    @Override
    public int hashCode() {
      return Double.hashCode(value);
    }
  }

  public static void main(String[] args) {
    // Feet equality checks
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

    // Inches equality checks
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
  }
}
