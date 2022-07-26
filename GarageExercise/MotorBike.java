package GarageExercise;

public class MotorBike extends Vehicle{

    private int cylinders = 2;

    public MotorBike () {
        super();
    }

    public MotorBike (String brand, int age, String condition, int maxRevs, int cylinders) {
        super(brand, age, condition, maxRevs);
        this.cylinders = cylinders;
    }

    public MotorBike (String brand, int age, String condition, int maxRevs) {
        super(brand, age, condition, maxRevs);
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void wheelie () {
        System.out.println(this.getBrand() + " does a wheelie! Siiiiiick!");
    }
}
