package src.lesson1;

public class Pen {
  String model;
  String color;
  float tipSize;
  int charge;
  boolean isCapped;

  void status() {
    System.out.println("Model: " + this.model);
    System.out.println("Color: " + this.color);
    System.out.println("Tip Size: " + this.tipSize);
    System.out.println("Charge: " + this.charge);
    System.out.println("Is Capped: " + this.isCapped);
  }

  void cap() {
    this.isCapped = true;
  }

  void uncap() {
    this.isCapped = false;
  }

  void write() {
    if (this.isCapped) {
      System.out.println("Can't write, pen is capped.");
    } else {
      System.out.println("Writing...");
    }
  }
}