package LibraryWork;

public class Magazine extends LibItem{

    private String edition;
    private static int librarySection = 2;

    public Magazine (String name, int releaseYear, String edition) {
        super(name, releaseYear);
        this.edition = edition;
    }

    @Override
    public void updateItem (LibItem newitem) {
        if (newitem == null) {
            return;
        }
        if (! (newitem instanceof Magazine)) {
            throw new UnsupportedOperationException("Incorrect type:" + newitem.getClass().getName() +
                    ". Required type: " + this.getClass().getName());
        }
        else {
            this.setName(newitem.getName());
            this.setReleaseYear(newitem.getReleaseYear());
            this.edition = ((Magazine) newitem).getEdition();
        }
    }

    @Override
    public void describeItem() {
        System.out.println("This '" + this.getName() + "' magazine is edition " + this.getEdition() + ".\n" +
                "It was released in " + this.getReleaseYear() + ".\nIt can be found in library section '" +
                librarySection + "'.\n");
    }

    // getters and setters.
    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public static int getLibrarySection() {
        return librarySection;
    }

}
