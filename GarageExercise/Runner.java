package GarageExercise;

public class Runner {

    public static void main (String[] args) {
        Car c1 = new Car("Mercedes", 4, "Like New", 8000);
        Car c2 = new Car("BMW", 13, "Used", 6500, 2);
        MotorBike m1 = new MotorBike("Triumph", 20, "Pristine", 11000, 6);
        MotorBike m2 = new MotorBike("Harley", 6, "Poor", 10000, 4);
        Lorry l1 = new Lorry("Volvo", 10, "Mint", 6000, 2200);
        Lorry l2 = new Lorry("Renault", 7, "Used", 6500, 3000);

        Garage myGarage = new Garage("Home");

        myGarage.addVehicle(c1);
        myGarage.addVehicle(c2);
        myGarage.addVehicle(m1);
        myGarage.addVehicle(m2);
        myGarage.addVehicle(l1);
        myGarage.addVehicle(l2);

        myGarage.printVehicles();
        myGarage.calculateBill();

        myGarage.removeByType("MotorBike");

        myGarage.printVehicles();
        myGarage.calculateBill();
    }

}
