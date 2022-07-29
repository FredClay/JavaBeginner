package LibraryWork;

public abstract class LibItem {

    private int id = 0;
    private String name;
    private int releaseYear;
    private boolean available = true;

    public LibItem () {
    }

    public LibItem (String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    protected abstract void updateItem(LibItem item);

    protected abstract void describeItem();

    // getters and setters.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean getAvailable () {
        return this.available;
    }

    public void setAvailable (boolean available) {
        this.available = available;
    }
}
