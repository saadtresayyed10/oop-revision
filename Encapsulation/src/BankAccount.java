public class BankAccount {
    // Instance variable
    private double balance;

    // Behaviour methods
    public double deposit(double amount) {
        if(balance > 0) {
            System.out.println("Invalid balance");
        }

        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if(amount >= balance && balance > 0) {
            System.out.println("Invalid amount");
        }

        balance -= amount;
        return balance;
    }

    // Getter and Setter for encapsulation
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
