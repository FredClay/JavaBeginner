package LibraryWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    void testItemAdding() {
        Library testLib = new Library();
        testLib.addItem(new Book("Dune", 1965, "Frank Herbert"));
        testLib.addItem(new CompactDisc("Dark Side", 1973, "Prog Rock"));
        assertEquals(2, testLib.getInventory().size());
    }

    @Test
    void testUpdateItemByName () {
        Library testLib = new Library();
        testLib.addItem(new Book("Dune", 1965, "Frank Herbert"));
        testLib.updateItemByName("Dune", new Book("LotR", 1962, "Tolkein"));
        assertTrue(testLib.getInventory().get(0).getName().equals("LotR"));
    }

    @Test
    void testCheckoutItem () {
        Library testLib = new Library();
        testLib.addItem(new Book("Dune", 1965, "Frank Herbert"));
        testLib.checkoutItem("Dune");
        assertFalse(testLib.getInventory().get(0).getAvailable());
    }

    @Test
    void testAddRemovePerson () {
        Library testLib = new Library();
        testLib.addCustomer(new LibCustomer("Fred", 24));
        testLib.addCustomer(new LibCustomer("Toto", 22));
        testLib.deletePerson("Fred");
        assertEquals(1, testLib.getCustomers().size());
    }

    @Test
    void testLibraryIdSystem () {
        Library testLib = new Library();
        testLib.addItem(new Book("Dune", 1965, "Frank Herbert"));
        testLib.removeItem(1);
        testLib.addItem(new Book("LotR", 1962, "Tolkein"));
        assertEquals(2, testLib.getInventory().get(0).getId());
    }

}
