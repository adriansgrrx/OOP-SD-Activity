public class Main {
    public static void main(String[] args) {
        // Instantiate different animal objects
        Lion lion = new Lion("Manny", 10, "Male");
        Elephant elephant = new Elephant("Dumbo", 20, "Female");
        Snake snake = new Snake("Von", 3, "Male");
        Lizard lizard = new Lizard("Dio", 2, "Male");

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
    }
}