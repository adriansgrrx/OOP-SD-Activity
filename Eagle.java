class Eagle extends Mammal {
    public Eagle(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void speak() {
        System.out.println(getName() + " screeches, \"Eaaaahhhhh!\"");
    }

    public void displayInfo() {
        System.out.println("Eagle - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}