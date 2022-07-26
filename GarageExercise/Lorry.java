package GarageExercise;

public class Lorry extends Vehicle{

    private int storageCapacity;

    public Lorry () {
        super();
    }

    public Lorry (String brand, int age, String condition, int maxRevs, int storageCapacity) {
        super(brand, age, condition, maxRevs);
        this.storageCapacity = storageCapacity;
    }

    public Lorry (String brand, int age, String condition, int maxRevs) {
        super(brand, age, condition, maxRevs);
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void describeStorage () {
        System.out.println(this.getBrand() + " has a storage capacity of " + this.getStorageCapacity() + "cubic feet!");
    }
}
