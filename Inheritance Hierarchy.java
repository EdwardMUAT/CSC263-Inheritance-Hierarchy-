// Parent class: Vehicle
class Vehicle {
    // Fields common to all vehicles
    private String brand;
    private int year;

    // Constructor for the Vehicle class
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Method common to all vehicles
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

// Child class: Car
class Car extends Vehicle {
    // Additional field specific to Car
    private int numberOfDoors;

    // Constructor for the Car class
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); // Call to parent class constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Getter for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    // Overriding the displayInfo method to include additional information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to parent class method
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

// Child class: Bike
class Bike extends Vehicle {
    // Additional field specific to Bike
    private boolean hasCarrier;

    // Constructor for the Bike class
    public Bike(String brand, int year, boolean hasCarrier) {
        super(brand, year); // Call to parent class constructor
        this.hasCarrier = hasCarrier;
    }

    // Getter for hasCarrier
    public boolean isHasCarrier() {
        return hasCarrier;
    }

    // Overriding the displayInfo method to include additional information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to parent class method
        System.out.println("Has carrier: " + hasCarrier);
    }
}

// Child class: Truck
class Truck extends Vehicle {
    // Additional field specific to Truck
    private int loadCapacity;

    // Constructor for the Truck class
    public Truck(String brand, int year, int loadCapacity) {
        super(brand, year); // Call to parent class constructor
        this.loadCapacity = loadCapacity;
    }

    // Getter for loadCapacity
    public int getLoadCapacity() {
        return loadCapacity;
    }

    // Overriding the displayInfo method to include additional information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to parent class method
        System.out.println("Load capacity: " + loadCapacity + " kg");
    }
}

// Main class to demonstrate the inheritance hierarchy
public class Main {
    public static void main(String[] args) {
        // Creating objects of each class
        Car car = new Car("Toyota", 2021, 4);
        Bike bike = new Bike("Yamaha", 2020, true);
        Truck truck = new Truck("Volvo", 2019, 15000);

        // Displaying information for each vehicle
        car.displayInfo();
        System.out.println();
        bike.displayInfo();
        System.out.println();
        truck.displayInfo();
    }
}
