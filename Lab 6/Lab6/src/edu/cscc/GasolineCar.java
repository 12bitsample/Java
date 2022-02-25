package edu.cscc;

public class GasolineCar extends Car {
    private int cylinders;
    private double tankCapacity;

    // Constructor
    public GasolineCar(String make, String model, int year, int cylinders, double tankCapacity) {
        super(make, model, year);
        this.cylinders = cylinders;
        this.tankCapacity = tankCapacity;
    }

    // Accessors / Mutators

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int make) { this.cylinders = cylinders; }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    GasolineCar gc = new GasolineCar();
    Car car;


    // Utility methods
    public void describe() {
        System.out.println("Make: "+ getMake() +
                "\nModel: "+ getModel() +
                "\nYear: "+ getYear() +
                "\nCylinders: "+ getCylinders() +
                "\nFuel Tank Capacity: "+ getTankCapacity());
    }

}
