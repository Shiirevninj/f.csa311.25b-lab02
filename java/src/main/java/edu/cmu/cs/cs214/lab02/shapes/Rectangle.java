package edu.cmu.cs.cs214.lab02.shapes;


/**
 * Represents a Rectangle shape with a given height and width.
 */
public class Rectangle implements Shape {
  private final double height;
  private final double width;
    
  public Rectangle(double height, double width) {
    this.height = height;
    this.width = width;
  }

  @Override
  public double getArea() {
    return height * width;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a rectangle with width " + width + " and height " + height);
  }
}
