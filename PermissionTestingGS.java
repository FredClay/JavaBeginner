package TrainingModules;

public class PermissionTestingGS {

    public static void main (String[] args) {
        GetterSetter dog1 = new GetterSetter("Brutus", 4);
        GetterSetter dog2 = new GetterSetter("Julius", 9);
        int ageD1 = dog1.getAge();
        String nameD2 = dog2.getName();

        dog1.speak();
        dog1.setAge(10);
        dog1.speak();
    }
}
