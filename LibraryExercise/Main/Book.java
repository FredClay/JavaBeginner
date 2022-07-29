package LibraryWork;

public class Book extends LibItem implements Playable{

    private String author;
    private final static int librarySection = 1;

    public Book (String name, int releaseYear, String author) {
        super(name, releaseYear);
        this.author = author;
    }

    public Book () {
        super();
    }

    @Override
    public void updateItem (LibItem newitem) {
        if (newitem == null) {
            return;
        }
        if (! (newitem instanceof Book)) {
            throw new UnsupportedOperationException("Incorrect type:" + newitem.getClass().getName() +
                    ". Required type: " + this.getClass().getName());
        }
        else {
            this.setName(newitem.getName());
            this.setReleaseYear(newitem.getReleaseYear());
            this.author = ((Book) newitem).getAuthor();
        }
    }

    @Override
    public void describeItem() {
        System.out.println("This book was written in " + this.getReleaseYear() + " by " + this.getAuthor() +
                "\n. It's title is " + this.getName() + ", and it can be found in library section '" + librarySection +
                "'.\n");
    }

    @Override
    public void playSample() {
        System.out.println("Now paying Chapter 1 from " + this.getName() + " audiobook...\n");
    }

    // getters and setters.
    public void setAuthor (String author) {
        this.author = author;
    }

    public String getAuthor () {
        return this.author;
    }

    public int getLibrarySection() {
        return librarySection;
    }

}
