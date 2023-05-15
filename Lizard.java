class Lizard extends Reptile {
    public Lizard(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void speak() {
        System.out.println(getName() + " clicks, \"Tsk-tsk-tsk!\"");
    }

    public void displayInfo() {
        System.out.println("Lizard - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}