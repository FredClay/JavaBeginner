package LibraryWork;

public class GeographicalMaps extends LibItem{

    private String region;
    private static int librarySection = 3;

    public GeographicalMaps (String name, int releaseYear, String region) {
        super(name, releaseYear);
        this.region = region;
    }

    @Override
    public void updateItem (LibItem newitem) {
        if (newitem == null) {
            return;
        }
        if (! (newitem instanceof GeographicalMaps)) {
            throw new UnsupportedOperationException("Incorrect type:" + newitem.getClass().getName() +
                    ". Required type: " + this.getClass().getName());
        }
        else {
            this.setName(newitem.getName());
            this.setReleaseYear(newitem.getReleaseYear());
            this.region = ((GeographicalMaps) newitem).getRegion();
        }
    }

    @Override
    public void describeItem() {
        System.out.println("This Geographical map, '" + this.getName() + "', focuses on " + this.getRegion() +
                ".\n" + "It was first released in " + this.getReleaseYear() + ", and it can be found " +
                "in library section '" + librarySection +"'.\n");
    }

    // getters and setters.
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getLibrarySection() {
        return librarySection;
    }

}
