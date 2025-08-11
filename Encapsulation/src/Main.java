public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        // Encapsulating data instead of declaring
        bankAccount.deposit(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(50);
        System.out.println(bankAccount.getBalance());
    }
}