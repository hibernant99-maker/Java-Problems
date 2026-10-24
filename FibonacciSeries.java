public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 12; 
        int t1 = 0;
        int  t2 = 1;


        
        for (int i = 1; i <= n; i++) {
            System.out.print(t1);
            
     
         
            int nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }
        System.out.println();
    }
}
