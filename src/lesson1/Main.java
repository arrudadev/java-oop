package src.lesson1;

public class Main {
  public static void main(String[] args) {
    System.out.println("=======================");
    System.out.println("Pen 1");
    Pen pen1 = new Pen();
    pen1.model = "BIC";
    pen1.color = "Blue";
    pen1.tipSize = 0.7f;
    pen1.charge = 100;

    pen1.status();
    pen1.cap();
    pen1.write();

    System.out.println("=======================");

    System.out.println("Pen 2");
    Pen pen2 = new Pen();
    pen2.model = "Pilot";
    pen2.color = "Black";
    pen2.tipSize = 0.5f;
    pen2.charge = 50;

    pen2.status();
    pen2.uncap();
    pen2.write();

    System.out.println("=======================");
  }
}