package GarageExercise;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private String name;
    private List<Vehicle> storedVehicles = new ArrayList<>();

    public Garage (String name) {
        this.name = name;
    }

    public void addVehicle (Vehicle newVehicle) {
        this.storedVehicles.add(newVehicle);
    }

    public void removeVehicle (String brandName) {
        // brandName serves as an id here, as for the purposes of this exercise, all brand names are unique.
        for (int i = 0; i < storedVehicles.size(); i++) {
            Vehicle v = storedVehicles.get(i);
            if (v.getBrand().equals(brandName)) {
                storedVehicles.remove(i);
                break;
            }
        }
    }

    public void removeByType (String type) {
        // creates a List<> to store matching values, and then 'removeAll's them from storedVehicles.
        List<Vehicle> vehiclesMatchingType = new ArrayList<>();
        for (Vehicle v : storedVehicles) {
            if (v.getClass().getSimpleName().equals(type)) {
                vehiclesMatchingType.add(v);
            }
        }
        storedVehicles.removeAll(vehiclesMatchingType);
    }

    public void fixVehicle (String type) {
        int fixingBill = 0;
        for (int i = 0; i < storedVehicles.size(); i++) {
            Vehicle v = storedVehicles.get(i);
            if (v.getClass().getSimpleName().equals(type)) {
                fixingBill += v.getMaxRevs() / 100;
            }
        }
        System.out.println("Fixing all vehicles of type: " + type + ". The bill will cost the total MaxRevs / 100.\n" +
                "As such, the bill is " + fixingBill);
    }

    public void printVehicles () {
        System.out.println("----------");
        for (Vehicle v : storedVehicles) {
            System.out.println(v.getBrand() + ": " + v.getClass().getSimpleName());
        }
        System.out.println("----------");
    }

    public void calculateBill () {
        // calculates the cost of storing each type of vehicle. Each type has a different form of cost calculation.
        int total = 0;
        for (Vehicle v : storedVehicles) {
            switch (v.getClass().getSimpleName()) {
                case ("Car"):
                    Car c = (Car) v;
                    total += (c.getDoors() * 20);
                    break;
                case ("MotorBike"):
                    MotorBike m = (MotorBike) v;
                    total += (m.getCylinders() * 30);
                    break;
                case ("Lorry"):
                    Lorry l = (Lorry) v;
                    total += (l.getStorageCapacity() / 10);
                    break;
            }
        }
        System.out.println("The total cost of storing these vehicles for 1 week is: " + total);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getStoredVehicles() {
        return storedVehicles;
    }

    public void setStoredVehicles(List<Vehicle> storedVehicles) {
        this.storedVehicles = storedVehicles;
    }

    public void clearGarage () {
        storedVehicles.clear();
        System.out.println("Garage Cleared.");
    }


}
