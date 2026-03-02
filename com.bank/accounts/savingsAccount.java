public savingsAccount extends Accounts {
    private double interestRate;

    public savingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = getBalance() * (interestRate / 100);
        System.out.println("Interest for account " + getAccountNumber() + ": " + interest);
    }
}