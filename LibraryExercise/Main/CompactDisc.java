package LibraryWork;

public class CompactDisc extends LibItem implements Playable{

        private String genre;
        private final static int librarySection = 4;

        public CompactDisc (String name, int releaseYear, String genre) {
            super(name, releaseYear);
            this.genre = genre;
        }

        public CompactDisc () {
            super();
        }

    @Override
    public void updateItem (LibItem newitem) {
        if (newitem == null) {
            return;
        }
        if (! (newitem instanceof CompactDisc)) {
            throw new UnsupportedOperationException("Incorrect type:" + newitem.getClass().getName() +
                    ". Required type: " + this.getClass().getName());
        }
        else {
            this.setName(newitem.getName());
            this.setReleaseYear(newitem.getReleaseYear());
            this.genre = ((CompactDisc) newitem).getGenre();
        }
    }

        @Override
        public void describeItem() {
            System.out.println(this.getName() + " is a " + this.getGenre() + " album from the year"
                    + this.getReleaseYear() + ".\nIt can be found in library section '" + librarySection + "'.");
        }

        @Override
        public void playSample() {
            System.out.println("Now playing audio from Track 4 of " + this.getName() + "...");
        }

        // getters and setters.
        public void setGenre (String genre) {
            this.genre = genre;
        }

        public String getGenre () {
            return this.genre;
        }

        public int getLibrarySection() {
            return librarySection;
        }

    }
