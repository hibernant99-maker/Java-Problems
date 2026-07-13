import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        
        // Grading logic based on the slide scenario
        if (marks >= 0 && marks <= 39) {
            System.out.println("Grade: F");
        } else if (marks >= 40 && marks <= 59) {
            System.out.println("Grade: C+");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade: B");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade: A-");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade: A");
        } else if (marks >= 90) {
            System.out.println("Grade: A+");
        } else {
            System.out.println("Invalid marks entered.");
        }
        
        sc.close();
    }
}