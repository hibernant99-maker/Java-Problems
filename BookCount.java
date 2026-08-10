import java.util.Scanner;
class book {
    private String title;
    private String username;
    private static int totalbook=0;
    public book(String title,String username){
        this.title=title;
        this.username=username;
        totalbook++;
    }
     public static int gettotalcount(){
        return totalbook;
     }
}
public class BookCount {
    public static void main(String[] args) {
    book b1= new book("os","alice") ;
    book b2=new book("ds","bob");
    System.out.println("Totak books in system:"+book.gettotalcount());   
    }
    
}
