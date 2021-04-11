public class Bank {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank() {
        this(10101010, 00.0, "Default name", "Default email", "+XX XXX XXX XXXX");
        System.out.println("Empty constructor called");
    }

    public Bank(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor updated with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Bank(String customerName, String email, String phoneNumber) {
        this(99999, 100.50, customerName, email, phoneNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return this.customerName = customerName;
    }

    public String getEmail() {
        return this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("Deposited amount= " + deposit);
        System.out.println("Total balance= " + this.balance);
    }

    public void withdrawFunds(double withdrawal) {
        if(this.balance - withdrawal < 0) {
            System.out.println("Insufficient Balance");
        } else {
            this.balance -= withdrawal;
            System.out.println("Withdrew= " + withdrawal);
            System.out.println("Total remaining balance= " + this.balance);
        }
    }

}
