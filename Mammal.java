abstract class Mammal extends Animal {
    public Mammal(String name, int age, String gender) {
        super(name, age, gender);
    }
    // @Override
    public void speak() {
        System.out.println("The mammal makes a sound.");
    }

    // Override the displayInfo() method
    // @Override
    public void displayInfo() {
        System.out.println("Mammal - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}