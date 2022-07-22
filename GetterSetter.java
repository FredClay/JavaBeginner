package TrainingModules;

public class GetterSetter {
    // A public class to get/set attributes of dogs (specifically red setters...).

    private String name;
    private int age;

    public GetterSetter (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return this.name;
    }

    public int getAge () {
        return this.age;
    }

    public void setName (String newName) {
        this.name = newName;
    }

    public void setAge (int newAge) {
        this.age = newAge;
    }

    public void speak () {
        String phrase;
        if (this.age < 7) {
            phrase = this.name + " says 'Meow!'";
        }
        else {
            phrase = this.name + " says 'Woof!'";
        }
        System.out.println(phrase);
    }
}
