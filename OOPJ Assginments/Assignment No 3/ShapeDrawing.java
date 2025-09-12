/*
13. Shape Drawing
Scenario: A graphics program needs to draw different shapes.
Problem Statement:
Create an abstract class Shape with abstract method draw(). Subclass Circle and Rectangle implement
draw().
Classes/Fields:
● Shape → draw() (abstract)
● Circle → radius
● Rectangle → length, breadth
Sample Input:
Circle → radius=7
Rectangle → length=5, breadth=10
Sample Output:
Drawing Circle of radius 7
Drawing Rectangle of length 5 and breadth 10
*/

// Abstract base class
abstract class Shape {
    public abstract void draw(); // abstract method
}

// Subclass for Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle of radius " + radius);
    }
}

// Subclass for Rectangle
class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle of length " + length + " and breadth " + breadth);
    }
}

// Main class to run the program
public class ShapeDrawing {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(5, 10);

        circle.draw();
        rectangle.draw();
    }
}
