abstract class Bird extends Animal {
    public Bird(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void speak() {
        System.out.println("The bird makes a sound.");
    }

    public void displayInfo() {
        System.out.println("Bird - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}