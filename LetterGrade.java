 import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       

        System.out.print("Enter the student's grade/GPA: ");
        double grade = scanner.nextDouble();

     
            if (grade >= 3.5) {
                System.out.println("Congratulations! The student has earned a medal.");
            } else {
                System.out.println("Semester completed, but the grade is below 3.5. No medal awarded.");
            }
   
       
        

        scanner.close();
    }
}
     

