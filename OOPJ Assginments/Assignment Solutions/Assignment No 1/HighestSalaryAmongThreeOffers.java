/* 
	2. Highest Salary Among Three Offers
	Scenario: You have three job offers. Take the offered salaries as input and print which company is
	offering the highest salary.
	Input:
	Enter salary for Company 1: 45000
	Enter salary for Company 2: 52000
	Enter salary for Company 3: 50000
	Output:
	Company 2 offers the highest salary
*/
import java.util.Scanner;

class HighestSalaryAmongThreeOffers{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter salary for Company 1: ");
        int com1 = in.nextInt();

        System.out.print("Enter salary for Company 2: ");
        int com2 = in.nextInt();

        System.out.print("Enter salary for Company 3: ");
        int com3 = in.nextInt();

        if (com1 > com2 && com1 > com3) {
            System.out.println("Company 1 offers the highest salary.");
        } else if (com2 > com1 && com2 > com3) {
            System.out.println("Company 2 offers the highest salary.");
        } else if (com3 > com1 && com3 > com2) {
            System.out.println("Company 3 offers the highest salary.");
        } else {
            System.out.println("Two or more companies offer the same highest salary.");
        }

        in.close();
    }
}