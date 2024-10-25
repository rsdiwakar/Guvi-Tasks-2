// Base class
public class Emp {
    private String name;
    private int age;

    // Constructor
    public Emp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass
class Employee extends Emp {
    private String employeeID;
    private double salary;

    // Constructor
    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age); // Initialize Person attributes
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Getters
    public String getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    @Override
    public void display() {
        super.display(); // Call the display method of Person
        System.out.println("Employee ID: " + employeeID);
        System.out.printf("Salary: %.2f%n", salary);
    }

    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("Alice", 30, "E12345", 75000.00);

        // Display employee details
        emp.display();
    }
}
