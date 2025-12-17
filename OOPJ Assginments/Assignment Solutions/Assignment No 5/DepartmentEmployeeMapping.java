/*
Problem 28: Department Employee Mapping
Use Case: Organize employees by department for HR management.
Requirements:
● Map departments to employee lists
● Group employees by department
● Display departmental structure
Sample Input:
Department mapping: "IT" → ["Amit", "Rohan"], "HR" → ["Priya"]
Expected Output:
Department Structure: IT: Amit, Rohan; HR: Priya
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DepartmentEmployeeMapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<String>> departmentMap = new HashMap<>();

        System.out.println("Enter number of departments:");
        int deptCount = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < deptCount; i++) {
            System.out.print("Enter department name: ");
            String dept = sc.nextLine().trim();

            System.out.print("Enter number of employees in " + dept + ": ");
            int empCount = sc.nextInt();
            sc.nextLine(); // consume newline

            ArrayList<String> employees = new ArrayList<>();
            System.out.println("Enter employee names:");
            for (int j = 0; j < empCount; j++) {
                String name = sc.nextLine().trim();
                employees.add(name);
            }

            departmentMap.put(dept, employees);
        }

        // Display departmental structure
        System.out.print("Department Structure: ");
        int deptIndex = 0;
        for (Map.Entry<String, ArrayList<String>> entry : departmentMap.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            ArrayList<String> emps = entry.getValue();
            for (int i = 0; i < emps.size(); i++) {
                System.out.print(emps.get(i));
                if (i < emps.size() - 1) {
                    System.out.print(", ");
                }
            }
            deptIndex++;
            if (deptIndex < departmentMap.size()) {
                System.out.print("; ");
            }
        }

        sc.close();
    }
}
