// Create an abstract class Animal with the following attributes/properties and methods:
// Attributes/Properties: name (String), age (int), gender (String)
// Constructor to initialize the properties
// Abstract methods: speak() and displayInfo()

abstract class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender; 
    }

    public abstract void speak();
    public abstract void displayInfo();
    
    // getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}