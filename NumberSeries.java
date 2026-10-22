
    public class NumberSeries {
        public static void main(String[] args) {
         
    
           
            int sumEven = 0;
            int sumOdd= 0;
    
            System.out.print("Even Series: ");
            for (int i = 2; i <= 20; i += 2) {
                System.out.print(i + " ");
                sumEven += i;
            }
            System.out.println("\nSum of Even Series: " + sumEven);
    
            System.out.print("Odd Series:  ");
            for (int i = 1; i <= 19; i += 2) {
                System.out.print(i + " ");
                sumOdd += i;
            }
            System.out.println("\nSum of Odd Series:  " + sumOdd + "\n");
    
    
         
       
            int Even = 0;
            int Odd = 0;
            
            int j = 2;
            System.out.print("Even Series: ");
            while (j <= 20) {
                System.out.print(j + " ");
                Even += j;
                j += 2;
            }
            System.out.println("\nSum of Even Series: " + Even);
    
            j = 1;
            System.out.print("Odd Series:  ");
            while (j <= 19) {
                System.out.print(j + " ");
                Odd += j;
                j += 2;
            }
            System.out.println("\nSum of Odd Series:  " + Odd+ "\n");
    
    
         
           
            int sumEvenDo = 0;
            int sumOddDo = 0;
            
            int k = 2;
            System.out.print("Even Series: ");
            do {
                System.out.print(k + " ");
                sumEvenDo += k;
                k += 2;
            } while (k <= 20);
            System.out.println("\nSum of Even Series: " + sumEvenDo);
    
            k = 1;
            System.out.print("Odd Series:  ");
            do {
                System.out.print(k + " ");
                sumOddDo += k;
                k += 2;
            } while (k <= 19);
            System.out.println("\nSum of Odd Series:  " + sumOddDo);
        }
    }

