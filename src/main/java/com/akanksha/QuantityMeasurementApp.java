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

  public static void main(String[] args) {
    Feet feet1 = new Feet(1.0);
    Feet feet2 = new Feet(1.0);

    System.out.println("Feet 1: " + feet1.getValue() + " ft");
    System.out.println("Feet 2: " + feet2.getValue() + " ft");
    System.out.println("Are they equal? " + feet1.equals(feet2));

    Feet feet3 = new Feet(2.0);
    System.out.println("\nFeet 1: " + feet1.getValue() + " ft");
    System.out.println("Feet 3: " + feet3.getValue() + " ft");
    System.out.println("Are they equal? " + feet1.equals(feet3));

    System.out.println("\nFeet 1: " + feet1.getValue() + " ft");
    System.out.println("Null value: null");
    System.out.println("Are they equal? " + feet1.equals(null));

    System.out.println("\nFeet 1: " + feet1.getValue() + " ft");
    System.out.println("String value: \"1.0\"");
    System.out.println("Are they equal? " + feet1.equals("1.0"));

    System.out.println("\nFeet 1 with itself:");
    System.out.println("Are they equal? " + feet1.equals(feet1));
  }
}
