
    import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sales percentage : ");
        double salesPercentage = scanner.nextDouble();

        System.out.print("Enter attendance percentage : ");
        int attendancePercentage = scanner.nextInt();

        int bonus = 5; 

      
        if (salesPercentage >= 95.0) {
            
           
            if (attendancePercentage == 100) {
                bonus = 60;
            } else if (attendancePercentage == 90) {
                bonus = 40;
            }
            
        } else if (salesPercentage >= 80.0) {
            
            if (attendancePercentage == 100) {
                bonus = 40;
            } else if (attendancePercentage == 90) {
                bonus = 20;
            }
            
        }

        System.out.println("The earned bonus is: " + bonus + "%");

        scanner.close();
    }
}
