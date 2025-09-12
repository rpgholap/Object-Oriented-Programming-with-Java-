/*
15. Shape Area Calculation
Scenario: A program needs to calculate the area of different shapes using the same method name but
different parameters.
Problem Statement:
Create a class ShapeArea with overloaded methods calculateArea().
Methods:
● calculateArea(int side) → calculates area of square
● calculateArea(int length, int breadth) → calculates area of rectangle
● calculateArea(double radius) → calculates area of circle
Sample Input:
Square → side=5
Rectangle → length=4, breadth=6
Circle → radius=3
Sample Output:
Square Area = 25
Rectangle Area = 24
Circle Area = 28.26
*/

class ShapeArea {
    // Method to calculate area of square
    public int calculateArea(int side) {
        return side * side;
    }

    // Method to calculate area of rectangle
    public int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    // Method to calculate area of circle
    public double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }
}

public class ShapeAreaCalculation {
    public static void main(String[] args) {
        ShapeArea shapeArea = new ShapeArea();

        int squareArea = shapeArea.calculateArea(5); // side = 5
        int rectangleArea = shapeArea.calculateArea(4, 6); // length = 4, breadth = 6
        double circleArea = shapeArea.calculateArea(3.0); // radius = 3

        System.out.println("Square Area = " + squareArea);
        System.out.println("Rectangle Area = " + rectangleArea);
        System.out.printf("Circle Area = %.2f\n", circleArea);
    }
}
