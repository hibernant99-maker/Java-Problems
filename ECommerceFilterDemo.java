
class Brand {
    private String name;
    public Brand(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class ProductCatalogFilter {
    public void filterProducts(String category) {
        System.out.println("Filtering products by Category: " + category);
    }

    public void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Filtering products by Price Range: $" + minPrice + " to $" + maxPrice);
    }


    public void filterProducts(Brand brand) {
        System.out.println("Filtering products by Brand: " + brand.getName());
    }

    public void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("Filtering products by Category: " + category + 
                           " | Price Range: $" + minPrice + " to $" + maxPrice);
    }

    public void filterProducts(String category, double minPrice, double maxPrice, Brand brand) {
        System.out.println("Filtering products by Category: " + category + 
                           " | Price Range: $" + minPrice + " to $" + maxPrice + 
                           " | Brand: " + brand.getName());
    }
}

public class ECommerceFilterDemo {
    public static void main(String[] args) {
        ProductCatalogFilter filter = new ProductCatalogFilter();

      
        
    
        filter.filterProducts("electronics");

      
        filter.filterProducts(100.0, 500.0);

        filter.filterProducts(new Brand("Apple"));

 
        filter.filterProducts("fashion", 50.0, 200.0);

   
        filter.filterProducts("electronics", 200.0, 1000.0, new Brand("Nike")); // e.g., smart sportswear/watches
    }
}