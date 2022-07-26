package GarageExercise;

public class Car extends Vehicle{

    int doors = 4;

    public Car () {
        super();
    }
    public Car (String brand, int age, String condition, int revs, int doors) {
        super(brand, age, condition, revs);
        this.doors = doors;
    }
    public Car (String brand, int age, String condition, int revs) {
        super(brand, age, condition, revs);
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void slapRoof () {
        System.out.print("Slaps roof of " + this.getBrand() + ". This is one heck of a car!");
    }
}
