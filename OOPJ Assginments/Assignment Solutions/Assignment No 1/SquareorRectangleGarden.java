/*
	5. Square or Rectangle Garden
	Scenario: You are designing a small garden. Take its length and breadth as input and check whether it is a
	square garden or rectangular.
	Input:
	Enter length: 12
	Enter breadth: 12
	Output:
	Square garden
*/
import java.util.Scanner;

class SquareorRectangleGarden{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = in.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = in.nextInt();

        if (length == breadth) {
            System.out.println("Square garden");
        } else {
            System.out.println("Rectangular garden");
        }

        in.close();
    }
}