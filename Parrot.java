class Parrot extends Bird {
    public Parrot(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void speak() {
        System.out.println(getName() + " squawks, \"Squaaaaak!\"");
    }

    public void displayInfo() {
        System.out.println("Parrot - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}