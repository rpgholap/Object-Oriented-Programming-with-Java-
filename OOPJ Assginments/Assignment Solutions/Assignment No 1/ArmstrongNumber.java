/*
	41. Check Armstrong Number (3-Digit)
	Scenario: Take a 3-digit number and check if it is an Armstrong number (sum of cubes of digits =
	number).
	Input:
	Enter number: 153
	Output:
	153 is an Armstrong number
*/

import java.util.Scanner;
class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        String result = (sum == original) ? 
                        (original + " is an Armstrong number") 
                        : (original + " is not an Armstrong number");
        System.out.println(result);
    }
}
