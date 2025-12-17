/*
Problem 17: Grade Distribution Counter
Use Case: Analyze the distribution of grades in a class.
Requirements:
● Count frequency of each grade
● Display grade distribution
● Handle multiple occurrences
Sample Input:
Grades: ["A", "B", "A", "C", "B", "A"]
Expected Output:
Grade Distribution: A=3, B=2, C=1
*/
import java.util.ArrayList;
import java.util.Scanner;

public class GradeDistributionCounterWithLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> gradesList = new ArrayList<>();
        ArrayList<Integer> countList = new ArrayList<>();
        
        System.out.println("Enter number of grades:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        
        System.out.println("Enter grades (e.g., A, B, C):");
        for (int i = 0; i < n; i++) {
            String grade = sc.nextLine().trim().toUpperCase();
            
            if (gradesList.contains(grade)) {
                int index = gradesList.indexOf(grade);
                countList.set(index, countList.get(index) + 1);
            } else {
                gradesList.add(grade);
                countList.add(1);
            }
        }
        
        System.out.print("Grade Distribution: ");
        for (int i = 0; i < gradesList.size(); i++) {
            System.out.print(gradesList.get(i) + "=" + countList.get(i));
            if (i < gradesList.size() - 1) {
                System.out.print(", ");
            }
        }
        
        sc.close();
    }
}
