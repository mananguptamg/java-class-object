import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate the grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display the student's details and grade
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentGradeInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the student: ");
        String name = sc.nextLine();

        System.out.println("Enter the roll number of the student: ");
        int rollNumber = sc.nextInt();

        System.out.println("Enter the marks of the student: ");
        double marks = sc.nextDouble();

        Student student = new Student(name, rollNumber, marks);
        student.displayDetails();
        sc.close();
    }
}

//Sample Output
//Enter the name of the student:
//Amit
//Enter the roll number of the student:
//        123
//Enter the marks of the student:
//        94
//Name: Amit
//Roll Number: 123
//Marks: 94.0
//Grade: A
