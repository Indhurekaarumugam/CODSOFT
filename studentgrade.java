import java.util.Scanner;

public class studentgrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter total number of subjects to calculate their marks
        System.out.println("Enter total number of subjects: ");
        int numSubjects = input.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter marks for subject " + i + "(out of 100): ");
            int marks = input.nextInt();

            // INPUT VALIDATION
            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                System.out.println("Enter marks for subject " + i + "out of 100): ");
                marks = input.nextInt();
            }
            totalMarks += marks;
        }
        System.out.println("Student Result: ");
        System.out.println("Total marks obtained in all subjects: " + totalMarks);

        
        int AveragePercentage = totalMarks / numSubjects;

        System.out.println("Average Percentage: " + AveragePercentage);

        

        if (AveragePercentage >= 90) {
            System.out.println("Your grade: o");
        }

        else if (AveragePercentage >= 80) {
            System.out.println("Your grade: A");
        }

        else if (AveragePercentage >= 70) {
            System.out.println("Your grade: A+");
        }

        else if (AveragePercentage >= 60) {
            System.out.println("Your grade: B");
        }

        else if (AveragePercentage >= 50) {
            System.out.println("Your grade: B+");
        }

        else if (AveragePercentage >= 40) {
            System.out.println("Your grade: c");
        }

        else if (AveragePercentage >= 30) {
            System.out.println("Your grade: c+");
        }

        else {
            System.out.println("Your grade is: fail");
        }

        input.close();
    }
}