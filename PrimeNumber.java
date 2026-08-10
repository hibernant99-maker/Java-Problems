 import java.util.Scanner;
 public class PrimeNumber {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1) {
            System.out.println("prime number");
        }
        if(n==2){
            System.out.println("Prime number");
        }
      else   if(n%2==0) System.out.println("not prime");
        else {
            int count=0;

            for (int i=3;i*i<=n;i++) {
                if(n%i==0) {
        count++;
                }
            }
            if(count==0) System.out.println("Prime number");
            else System.out.println("not prime");
        }

    }
}
