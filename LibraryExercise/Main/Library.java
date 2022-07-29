package LibraryWork;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<LibItem> inventory;
    private final List<LibCustomer> customers;
    private int itemIDAssigner = 1;
    private int customerIDAssigner = 1;

    public Library () {
        this.inventory = new ArrayList<>();
        this.customers = new ArrayList<>();
    }


    public void addItem (LibItem item) {
        item.setId(this.itemIDAssigner);
        item.setAvailable(true);
        this.inventory.add(item);
        this.itemIDAssigner += 1;
    }

    public void checkoutItem (String name) {
        for (LibItem item : this.inventory) {
            if (item.getName().equals(name)) {
                if (!item.getAvailable()) {
                    System.out.println("Sorry! Chosen item is currently loaned out to someone else.\n");
                }
                else {item.setAvailable(false);}
                return;
            }
        }
    }

    public void checkinItem (String name) {
        boolean foundCorrespondingItem = false;
        for (LibItem item : this.inventory) {
            if (item.getName().equals(name)) {
                if (item.getAvailable()){
                    System.out.println("Item cannot be checked in, as it is already checked in!.");
                    return;
                }
                item.setAvailable(true);
                System.out.println("Thank you for returning " + name);
                foundCorrespondingItem = true;
                break;
            }
        }
        // print a friendly message if the item does not exist.
        if (!foundCorrespondingItem) {
            System.out.println("Item of name: '" + name + "' does not exist in this library.\n" +
                    "Please consider adding the item to the library instead.");
        }
    }

    public void removeItem (int itemID) {
        for (LibItem item : this.inventory) {
            if (item.getId() == itemID) {
                this.inventory.remove(item);
                break;
            }
        }
    }

    public void updateItemByName (String name, LibItem newItemInfo) {
        for (LibItem item : this.inventory) {
            if (item.getName().equals(name)) {
                item.updateItem(newItemInfo);
                return;
            }
        }
    }

    // customer related methods.
    public void addCustomer (LibCustomer customer) {
        customer.setCustomerID(this.customerIDAssigner);
        this.customers.add(customer);
        this.customerIDAssigner += 1;
    }

    public void deletePerson(String name) {
        for (LibCustomer customer : this.customers) {
            if (customer.getName().equals(name)) {
                System.out.println("Removing " + name);
                this.customers.remove(customer);
                return;
            }
        }
        System.out.println("Could not find a customer of that name.");
    }

    public void clearCustomers() {
        this.customers.clear();
        System.out.println("Deleting customer database!");
    }

    // getters and setters.
    public List<LibItem> getInventory() {
        return this.inventory;
    }
    public List<LibCustomer> getCustomers() {
        return this.customers;
    }

}
