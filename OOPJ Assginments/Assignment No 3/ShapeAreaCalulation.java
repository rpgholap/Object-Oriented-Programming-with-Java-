/*
6. Shape Area Calculation
Scenario: You are designing a program to calculate areas of different shapes.
Problem Statement:
Create a superclass Shape with a method area(). Derive two subclasses Rectangle and Circle. Implement
area() in each subclass.
Classes/Fields:
● Shape → area() (method stub)
● Rectangle → length, breadth
● Circle → radius
Methods:
● Rectangle.area() → length × breadth
● Circle.area() → π × radius²
Sample Input:
Rectangle → length=5, breadth=10
Circle → radius=7
Sample Output:
Rectangle Area = 50
Circle Area = 153.86
*/

class Shape {
    public double area() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}

public class ShapeAreaCalulation{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        System.out.println("Rectangle Area = " + rectangle.area());
        System.out.println("Circle Area = " + circle.area());
    }
}
