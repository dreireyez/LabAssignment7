public class SavingsAccount implements BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = String.valueOf(accountNumber);
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    @Override
    public Double getBalance() {
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
    public Double getInterestRate() {
        return 0.01; 
    }
    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }
    @Override
    public Double computeBalanceWithInterest() {
        return this.balance + (this.balance * getInterestRate()); 
    }
    @Override
    public String showInfo() {
        String accountInfo = "";
            accountInfo += "Account number: " + this.accountNumber +"\n";
            accountInfo += "Account name: " + this.accountName +"\n";
            accountInfo += "Balance: " + this.balance;
        return accountInfo;
    }
}