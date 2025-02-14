package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

/**
 * Main.
 */
public class Main {
  /**
   * The main method.
   */
  public static void main(String[] args) {
    // Shape төрлийг ашиглах
    Shape rectangle = new Rectangle(2, 3);
    Shape circle = new Circle(5);
    Shape square = new Square(4);

    Renderer renderer = new Renderer();

    renderer.drawShape(rectangle);
    renderer.drawShape(circle);
    renderer.drawShape(square);
  }
}