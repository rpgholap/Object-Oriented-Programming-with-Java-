/*
Problem 14: Report Title
Scenario: A report generation system needs to modify document titles by adding department names and
updating formatting.
Task: Use StringBuilder method chaining to efficiently modify report titles.
Sample Input:
Original title: Annual Report
Department Name: CDAC
Expected Output:
Annual CDAC Report
*/

import java.util.Scanner;

class ReportTitle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Original title:");
        String originalTitle = in.nextLine();

        System.out.println("Department Name:");
        String departmentName = in.nextLine();

        StringBuilder sb = new StringBuilder(originalTitle)
                                .insert(originalTitle.indexOf(" "), " " + departmentName);

        System.out.println("Expected Output:");
        System.out.println(sb.toString());

        in.close();
    }
}

/*
output:
Original title:
annual report
Department Name:
CDAC
Expected Output:
annual CDAC report
*/
