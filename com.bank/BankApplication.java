public class BankApplication {
    public static void main(String[] args) {
        // Create a customer
        Customers customer = new Customers("C001", "John Doe");

        // Create an account and link it to the customer
        Accounts account = new Accounts("1234567890", 10000);
        customer.linkAccount(account);

        // Perform deposit and withdrawal
        account.deposit(5000);
        account.withdraw(2000);

        // Calculate interest for a savings account
        savingsAccount savings = new savingsAccount("0987654321", 15000, 5);
        savings.calculateInterest();

        // Demonstrate package access behavior
        Loan loan = new Loan(50000);
        loan.calculateEMI();
        loan.accessAccountMembers(); // This will show access control behavior
    }
}