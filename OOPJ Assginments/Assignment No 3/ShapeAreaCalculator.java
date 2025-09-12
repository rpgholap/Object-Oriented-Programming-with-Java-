/*
27. Shape Area Calculator
Scenario: A drawing application needs to calculate area for different shapes: Circle, Rectangle, and
Square.
Problem Statement:
● Interface Shape → method calculateArea()
● Classes Circle, Rectangle, Square implement Shape → provide specific area calculation
● In main(), create objects of each shape, input dimensions, display calculated area
Sample Input:
Circle → radius=5
Rectangle → length=10, breadth=5
Square → side=4
Sample Output:
Circle Area = 78.5
Rectangle Area = 50
Square Area = 16
*/
import java.util.Scanner;

// Interface Shape
interface Shape {
    double calculateArea();
}

// Circle class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

// Rectangle class
class Rectangle implements Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

// Square class
class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

// Main class
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Circle
        System.out.print("Enter radius of Circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);

        // Input for Rectangle
        System.out.print("Enter length of Rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of Rectangle: ");
        double breadth = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);

        // Input for Square
        System.out.print("Enter side of Square: ");
        double side = sc.nextDouble();
        Square square = new Square(side);

        sc.close();

        // Display calculated areas
        System.out.println("Circle Area = " + circle.calculateArea());
        System.out.println("Rectangle Area = " + rectangle.calculateArea());
        System.out.println("Square Area = " + square.calculateArea());
    }
}
