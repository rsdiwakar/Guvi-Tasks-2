public class Person {
    // Properties
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.age = 18; // Default age
    }

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a Person object using the default constructor
        Person person1 = new Person();
        person1.display();

        // Create a Person object with name and age
        Person person2 = new Person("Alice", 25);
        person2.display();
    }
}