
public class OddEvenCounter {
    public static void main(String[] args) {
       
        int[] numbers = {12, 7, 19, 22, 34, 5, 8, 11, 40, 3};
        
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }
}