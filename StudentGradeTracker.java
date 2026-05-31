import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input student data
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            students.add(new Student(name, marks));
        }

        // Variables for calculations
        int total = 0;
        int highest = students.get(0).marks;
        int lowest = students.get(0).marks;

        String highestStudent = students.get(0).name;
        String lowestStudent = students.get(0).name;

        // Calculate total, highest and lowest
        for (Student s : students) {

            total += s.marks;

            if (s.marks > highest) {
                highest = s.marks;
                highestStudent = s.name;
            }

            if (s.marks < lowest) {
                lowest = s.marks;
                lowestStudent = s.name;
            }
        }

        double average = (double) total / n;

        // Display Summary Report
        System.out.println("\n========== STUDENT SUMMARY REPORT ==========");

        for (Student s : students) {
            System.out.println("Name: " + s.name + " | Marks: " + s.marks);
        }

        System.out.println("\nAverage Marks: " + average);
        System.out.println("Highest Marks: " + highest + " by " + highestStudent);
        System.out.println("Lowest Marks: " + lowest + " by " + lowestStudent);

        sc.close();
    }
}
