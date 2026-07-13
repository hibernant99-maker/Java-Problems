import java.util.Scanner;

public class PositiveIntegerCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        if (number > 0) {
            System.out.println(number + " is a positive integer.");
        } else if (number < 0) {
            System.out.println(number + " is a negative integer.");
        } else {
            System.out.println("The number is zero.");
        }
        
        sc.close();
    }
}