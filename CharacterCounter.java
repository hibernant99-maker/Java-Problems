import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter a character to count: ");
        char target = scanner.next().charAt(0);
        
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }
        
        System.out.println("The character '" + target + "' appears " + count + " time(s).");
        scanner.close();
    }
}