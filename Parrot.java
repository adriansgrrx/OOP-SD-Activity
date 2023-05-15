class Parrot extends Mammal {
    public Parrot(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void speak() {
        System.out.println(getName() + " the eagle squawks, \"Squaaaaak!\"");
    }

    public void displayInfo() {
        System.out.println("Parrot - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}