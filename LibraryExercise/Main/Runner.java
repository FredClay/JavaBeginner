package LibraryWork;

public class Runner {

    public static void main (String[] args) {
        // example runner makes new library and fills it with different children of class 'LibItem'.
        Library myLib = new Library();

        CompactDisc cd1 = new CompactDisc("Rumours", 1973, "Fleetwood Mac");
        myLib.addItem(new Book("Dune", 1965, "Frank Herbert"));
        myLib.addItem(new Magazine("Fishing Today", 2008, "08/2"));
        myLib.addItem(new GeographicalMaps("The Land Down Under", 1911, "Australia " +
                "and New Zealand."));
        myLib.addItem(cd1);

        // checks the items have been added properly and that their IDs are auto-incremented as new items are added.
        for (LibItem item : myLib.getInventory()) {
            System.out.println(item.getName());
            System.out.println(item.getId());
        }

        // testing the updateItem methods for various LibItem child-classes.
        myLib.updateItemByName("Rumours", new CompactDisc("Dark Side", 1973, "Prog Rock"));
        // below line will throw an error, as Book:Dune cannot be updated to CompactDisc.
        // myLib.updateItemByName("Dune", new CompactDisc("ELO", 1981, "Alternative"));

        // asserts that the updates have worked as expected and that the IDs have not been changed.
        for (LibItem item : myLib.getInventory()) {
            System.out.println(item.getName());
            System.out.println(item.getId());
        }

        // tests that the Playable Interface's playSample method has been correctly overridden where required.
        cd1.playSample();

    }

}
