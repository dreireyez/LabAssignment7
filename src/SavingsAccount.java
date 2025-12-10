public class SavingsAccount implements BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    @Override
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Concrete implementation of methods
    @Override
    public String showAccountType() {
        return "Savings Account";
    }
    @Override
    public double getInterestRate() {
        return 0.01; 
    }
    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }
    @Override
    public double computeBalanceWithInterest() {
        return this.balance + (this.balance * getInterestRate()); 
    }
    @Override
    public String showInfo() {
        String accountInfo = "";
            accountInfo += "Account Number: " + this.accountNumber;
            accountInfo += "Account Name: " + this.accountName;
            accountInfo += "Balance: " + this.balance;
            accountInfo += "Account Type: " + showAccountType();
            accountInfo += "Interest Rate: " + getInterestRate();
            accountInfo += "New Balance: " + computeBalanceWithInterest();
            accountInfo += "Benefits: " + showBenefits();
        return accountInfo;
    }
}