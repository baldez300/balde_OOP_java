// Modify the main method so that two cat objects are created, and the program behaves in the following way:
    //The cat named Whiskers says: Meow!
    //The cat named Whiskers says: Meow!
    //The cat named Rex says: Meow!
    //The cat named Whiskers says: Meow!

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Cat cat = new Cat("Whiskers");
        Cat rex = new Cat("Rex");

        // Call the meow method on the cat instance
        cat.meow();
        cat.meow();
        rex.meow();
        cat.meow();
    }
}
