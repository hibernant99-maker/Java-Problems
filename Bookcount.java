import java.util.Scanner;
class book{
    private String book;
    private String name;
    private static int totalbooks=0;
    public   book(String title,String username){
        this.book=title;
        this.name=username;
totalbooks++;
    }
    public static int gettotalcount() {
        return totalbooks;
    }
};

public class Bookcount {
    public static void main(String[]args){
        book b1=new book("os","ahmed");
        book b2=new book("ds","ahmed");
        book b3=new book("sre","suraiya");
        System.out.println("the total book countis:"+book.gettotalcount());
    }
    
}
