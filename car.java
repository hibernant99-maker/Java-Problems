

public class car {
    String brand;
    int year;

    public car() {
        this.brand = "Unknown";
        this.year = 2026;
    }

    public car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

  
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
      
        car car1 = new car(); 
        car1.displayInfo(); 

        car car2 = new car("Toyota", 2024); 
        car2.displayInfo(); 
    }
}