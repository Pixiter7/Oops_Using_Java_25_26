public class Loan {
    private double loanAmount;

    public Loan(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void calculateEMI() {
        // Simple EMI calculation for demonstration
        double interestRate = 10; // Annual interest rate
        int tenureInYears = 5; // Loan tenure in years
        double monthlyInterestRate = interestRate / (12 * 100);
        int totalMonths = tenureInYears * 12;
        double emi = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalMonths)) /
                     (Math.pow(1 + monthlyInterestRate, totalMonths) - 1);
        System.out.println("EMI for loan amount " + loanAmount + ": " + emi);
    }

    public void accessAccountMembers() {
        // Attempting to access members of Accounts class
        Accounts account = new Accounts("1234567890", 10000);
        // The following lines will cause a compilation error due to access control
        // System.out.println(account.accountNumber); // Cannot access private member
        // System.out.println(account.balance); // Cannot access private member
    }
}