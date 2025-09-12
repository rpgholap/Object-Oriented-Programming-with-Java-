// 46. Character Type Checker
// Scenario: Take a character as input and print whether it is an alphabet, digit, or special character.
// Input:
// Enter character: %
// Output:
// Special Character


import java.util.Scanner;
class CharChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
