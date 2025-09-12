/*
	44. Reverse 4-Digit Number and Palindrome Check
	Scenario: Take a 4-digit number, reverse it, and check if it is a palindrome.
	Input:
	Enter 4-digit number: 1221
	Output:
	Reversed number: 1221
	Palindrome: Yes
*/


import java.util.Scanner;
class ReversePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;

        while (temp > 0) {
            int d = temp % 10;
            rev = rev * 10 + d;
            temp = temp / 10;
        }

        System.out.println("Reversed number: " + rev);
        if (rev == num) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
    }
}
