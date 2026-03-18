class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double balance) { this.balance = balance; }
    public double getBalance() { return balance; }
}

class SavingsAccount extends BankAccount {
    void displayInfo() {
        System.out.println("Acc No: " + accountNumber + ", Holder: " + accountHolder);
    }
}