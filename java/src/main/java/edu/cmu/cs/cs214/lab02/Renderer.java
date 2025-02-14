package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

/**
 * .
 */
public class Renderer {
  
  /**
   * .
   */
  public void drawShape(Shape shape) {
    System.out.println("Drawing the shape...");
    shape.draw();
    System.out.println("Its area is " + shape.getArea());
  }
}
