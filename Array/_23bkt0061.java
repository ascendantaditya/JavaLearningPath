import java.util.Scanner;

public class _23bkt0061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numStudents = 3;
        int numTests = 3;

        int student1Total = 0;
        int student2Total = 0;
        int student3Total = 0;

        for (int student = 1; student <= numStudents; student++) {
            int studentTotal = 0;
            System.out.println("Enter grades for Student " + student + ":");
            for (int test = 1; test <= numTests; test++) {
                System.out.print("Enter grade for Test " + test + ": ");
                int grade = sc.nextInt();
                studentTotal += grade;
            }

            if (student == 1) {
                student1Total = studentTotal;
            } else if (student == 2) {
                student2Total = studentTotal;
            } else if (student == 3) {
                student3Total = studentTotal;
            }

            double averageGrade = studentTotal / (double) numTests;
            System.out.println("Average grade for Student " + student + ": " + averageGrade);
        }

        int classTotal = student1Total + student2Total + student3Total;
        double overallAverage = classTotal / (double) (numStudents * numTests);
        System.out.println("Overall average grade for the class: " + overallAverage);

        sc.close();
    }
}