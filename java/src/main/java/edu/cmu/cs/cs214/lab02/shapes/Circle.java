package edu.cmu.cs.cs214.lab02.shapes;


/**
 * Represents a circle shape with a given radius.
 */
public class Circle implements Shape {
    
  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a Circle with radius: " + radius);
  }
}
