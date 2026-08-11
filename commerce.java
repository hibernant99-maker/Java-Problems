import java.util.Scanner;

class Filter {

    
    public void filterProducts(String category) {
        System.out.println("Searching for products in category: " + category);
    }

    
    public void filterProducts(int minPrice, int maxPrice) {
        System.out.println("Searching for products between $" + minPrice + " and $" + maxPrice);
    }


    public void filterProducts(String brand, boolean isBrand) {
        if (isBrand) {
            System.out.println("Searching for products by brand: " + brand);
        }
    }

    
    public void filterProducts(String category, int minPrice, int maxPrice) {
        System.out.println("Searching for products in category: " + category + " between $" + minPrice + " and $" + maxPrice);
    }

    public void filterProducts(String category, int minPrice, int maxPrice, String brand) {
        System.out.println("Searching for products in category: " + category + ", brand: " + brand + ", between $" + minPrice + " and $" + maxPrice);
    }
}

public class commerce {
    public static void main(String[] args) {

     
        Filter f1 = new Filter();

       
        f1.filterProducts("fashion");                          
        f1.filterProducts(100, 500);                           
        f1.filterProducts("Nike", true);                       
        f1.filterProducts("fashion", 100, 500);               
        f1.filterProducts("fashion", 100, 500, "Nike");      
    }
}