import java.util.Scanner;

public class ProductXYZ {

    // Product class definition
    public static class Product {
        private int pid;
        private double price;
        private int quantity;

        // Parameterized constructor
        public Product(int pid, double price, int quantity) {
            this.pid = pid;
            this.price = price;
            this.quantity = quantity;
        }

        // Getters
        public int getPid() {
            return pid;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept product information
        for (int i = 0; i < products.length; i++) {
            System.out.print("Enter product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // Find product with highest price
        int highestPricePid = findHighestPricePid(products);
        System.out.println("Product ID with the highest price: " + highestPricePid);

        // Calculate total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.printf("Total amount spent on all products: %.2f%n", totalAmount);

        scanner.close();
    }

    // Method to find the Pid of the product with the highest price
    public static int findHighestPricePid(Product[] products) {
        int highestPid = products[0].getPid();
        double highestPrice = products[0].getPrice();

        for (Product product : products) {
            if (product.getPrice() > highestPrice) {
                highestPrice = product.getPrice();
                highestPid = product.getPid();
            }
        }
        return highestPid;
    }

    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }
}
