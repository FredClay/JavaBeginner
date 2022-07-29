package LibraryWork;

public class LibCustomer {

    private String name;
    private int age;
    private int customerID;

    public LibCustomer (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void updateCustomer (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters and setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
