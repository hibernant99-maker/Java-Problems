import java.util.Scanner;

public class Calculator {
    public static void main(String[]args) {
       Scanner sc=new Scanner(System.in);
       
       char ch = sc.next().charAt(0);
       double a=sc.nextDouble();
       double b=sc.nextDouble();
       double c=0;

       if (ch=='+') {
           c=a+b;
       }
       if(ch=='-') {
           c=a-b;
       }
       if(ch=='*'){ // Changed '-' to '*'
           c=a*b;
       }
       if (ch=='/') {
           c=a/b;
       }
       System.out.println(c);
    }
}