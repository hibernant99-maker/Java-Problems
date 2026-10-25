public class Car {
    private String owner;
    private String brandName;
    private String serialNumber;
    private double fuelLevel; 
    private boolean isStarted;

    
    public Car(String owner, String brandName, String serialNumber, double fuelLevel) {
        this.owner = owner;
        this.brandName = brandName;
        this.serialNumber = serialNumber;
        this.fuelLevel = fuelLevel;
        this.isStarted = false; 
    }

   
    public void startCar() {
        if (fuelLevel <= 0) {
            System.out.println("Cannot start " + brandName + ". Out of fuel!");
        } else if (isStarted) {
            System.out.println(brandName + " is already running.");
        } else {
            isStarted = true;
            System.out.println(brandName + " (Serial: " + serialNumber + ") owned by " + owner + " has started.");
        }
    }


    public void stopCar() {
        if (!isStarted) {
            System.out.println(brandName + " is already turned off.");
        } else {
            isStarted = false;
            System.out.println(brandName + " has been stopped.");
        }
    }

    
    public void checkFuel() {
        System.out.println("Fuel level for " + brandName + " (" + serialNumber + "): " + fuelLevel + "%");
    }

    
    public static void main(String[] args) {
       
        Car myCar = new Car("Alice", "Toyota", "TR-98765-X", 35.0);

        myCar.checkFuel();
        myCar.startCar();
        myCar.stopCar();
    }
}
