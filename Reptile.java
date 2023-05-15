abstract class Reptile extends Animal {
    public Reptile(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void speak() {
        System.out.println("The reptile makes a sound.");
    }

    public void displayInfo() {
        System.out.println("Reptile - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}