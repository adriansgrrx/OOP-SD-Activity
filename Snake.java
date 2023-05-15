class Snake extends Reptile {
    public Snake(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void speak() {
        System.out.println(getName() + " the snake hisses, \"Hsss-hsss-hsss\"");
    }

    public void displayInfo() {
        System.out.println("Snake - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}