public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Manny", 10, "Male");
        Elephant elephant = new Elephant("Dambie", 15, "Female");
        Snake snake = new Snake("Von", 3, "Male");
        Lizard lizard = new Lizard("Veronica", 2, "Female");
        Eagle eagle = new Eagle("Mighty Mark", 3, "Male");
        Parrot parrot = new Parrot("Ruth", 5, "Female");

        lion.displayInfo();
        lion.speak();
        System.out.println("");
        
        elephant.displayInfo();
        elephant.speak();
        System.out.println("");

        snake.displayInfo();
        snake.speak();
        System.out.println("");

        lizard.displayInfo();
        lizard.speak();
        System.out.println("");

        eagle.displayInfo();
        eagle.speak();
        System.out.println("");

        parrot.displayInfo();
        parrot.speak();
        System.out.println("");
    }
}