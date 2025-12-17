/*
	21. Day of the Week (Ternary)
	Scenario: Take an int (1–7) and print the corresponding day of the week using ternary operators.
	Input:
	Enter day number: 3
	Output:
	Day is Wednesday
*/

import java.util.Scanner;

class DayOfWeekTernary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int day = in.nextInt();

        String result = (day == 1) ? "Day is Monday" :
                        (day == 2) ? "Day is Tuesday" :
                        (day == 3) ? "Day is Wednesday" :
                        (day == 4) ? "Day is Thursday" :
                        (day == 5) ? "Day is Friday" :
                        (day == 6) ? "Day is Saturday" :
                        (day == 7) ? "Day is Sunday" :
                        "Invalid day number";

        System.out.println(result);

        in.close();
    }
}
