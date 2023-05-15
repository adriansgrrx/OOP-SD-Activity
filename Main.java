public class Main {
    public static void main(String[] args) {
        // Instantiate different animal objects
        Lion lion = new Lion("Simba", 5, "Male");
        Elephant elephant = new Elephant("Dumbo", 5, "Male");

        lion.displayInfo();
        lion.speak();
        System.out.println("");
        
        elephant.displayInfo();
        elephant.speak();
        System.out.println("");
    }
}