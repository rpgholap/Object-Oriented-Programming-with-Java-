/*
	13. Exam Eligibility with Medical Cause
	Scenario: A student’s attendance is low but may have medical cause. Take classes held, attended, and
	medical cause (Y/N) as input and decide if the student can sit in exam.
	Input:
	Classes held: 100
	Classes attended: 60
	Medical cause (Y/N): Y
	Output:
	Student is allowed to sit for the exam.
*/

import java.util.Scanner;

class ExamEligibilityMedicalCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Classes held: ");
        int total = in.nextInt();

        System.out.print("Classes attended: ");
        int attended = in.nextInt();

        System.out.print("Medical cause (Y/N): ");
        char medical = in.next().charAt(0);

        double attendance = (attended * 100.0) / total;

        if (attendance >= 75 || medical == 'Y' || medical == 'y') {
            System.out.println("Student is allowed to sit for the exam.");
        } else {
            System.out.println("Student is not allowed to sit for the exam.");
        }

        in.close();
    }
}
