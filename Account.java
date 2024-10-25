public class Account {
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0; // Initialize balance to zero
    }

    // Constructor with an argument to set initial balance
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.printf("Current balance: %.2f%n", balance);
    }

    public static void main(String[] args) {
        Account account = new Account(); // Using no-argument constructor
        account.displayBalance(); // Display initial balance

        account.deposit(500); // Deposit amount
        account.displayBalance(); // Display balance after deposit

        account.withdraw(200); // Withdraw amount
        account.displayBalance(); // Display balance after withdrawal

        account.withdraw(1000); // Attempt to withdraw more than balance
        account.displayBalance(); // Display balance after withdrawal attempt

        // Create another account with initial balance
        Account anotherAccount = new Account(1000);
        anotherAccount.displayBalance(); // Display initial balance
        anotherAccount.withdraw(500);
        anotherAccount.displayBalance(); // Display balance after withdrawal
    }
}

