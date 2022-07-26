package GarageExercise;

public class Vehicle {

    private String brand;
    private int age;
    private String condition;
    private int maxRevs;

    public Vehicle () {

    }
    public Vehicle(String brand, int age, String condition, int maxRevs) {
        this.brand = brand;
        this.age = age;
        this.condition = condition;
        this.maxRevs = maxRevs;
    }

    public void rev () {
        String vroom = "Fully revving vehichle... Max Revs = " + this.maxRevs;
        System.out.println(vroom);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getMaxRevs() {
        return maxRevs;
    }

    public void setMaxRevs(int maxRevs) {
        this.maxRevs = maxRevs;
    }
}
