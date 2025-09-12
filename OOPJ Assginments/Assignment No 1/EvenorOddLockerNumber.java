/*
	4. Even or Odd Locker Number
	Scenario: Your school assigns lockers with numbers. Take locker number as input and print whether it is
	even or odd.
	Input:
	Enter locker number: 17
	Output:
	Odd locker number
*/
import java.util.Scanner;

class EvenorOddLockerNumber{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter locker number: ");
        int locker = in.nextInt();

        if (locker % 2 == 0) {
            System.out.println("Even locker number");
        } else {
            System.out.println("Odd locker number");
        }

        in.close();
    }
}