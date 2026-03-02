public class Customers {
    private String customerId;
    private String name;
    private Accounts linkedAccount;

    public Customers(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void linkAccount(Accounts account) {
        this.linkedAccount = account;
        System.out.println("Account " + account.getAccountNumber() + " linked to customer " + name);
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public Accounts getLinkedAccount() {
        return linkedAccount;
    }
}