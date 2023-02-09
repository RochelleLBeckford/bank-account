

//& Create a BankAccount class
/**
 * BankAccount
 */
//& The class should have the following attributes: (double) checking balance, (double) savings balance.
public class BankAccount {
    
    //& attributes
    private double checkingBalance;
    private double savingsBalance;

    //& Create a class member (static [this is private]) that has the number of accounts created thus far.
    private static int totalAccounts = 0;

    //& Create a class member (static) that tracks the total amount of money stored in every account created.
    private static double bankAccountsTotal = 0; 

    // public BankAccount (double checkingAccountCount) { // or (int checkingAccountCount)?
    //     totalAccounts++;
    //     checkingBalance = checkingAccountCount;
    //     savingsBalance = 0;
    //     bankAccountsTotal += checkingBalance + savingsBalance;
    // }

    public BankAccount ( double checkingBalance, double savingsBalance) {
        //& In the constructor, be sure to increment the account count.
        totalAccounts++;
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        //& Total amount of money stored in the accounts
        bankAccountsTotal += checkingBalance + savingsBalance;
    }

    //& Create a getter method for the user's checking account balance.
    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    //~ this is not necessary for this assignmnet -> it will set the amount
    // public void setCheckingBalance(double checkingBalance) {
    //     this.checkingBalance = checkingBalance;
    // }

    //& Create a getter method for the user's saving account balance.
    public double getSavingsBalance() {
        return this.savingsBalance;
    }
    //~ this is not necessary for this assignmnet -> it will set the amount
    // public void setSavingsBalance(double savingsBalance) {
    //     this.savingsBalance = savingsBalance;
    // }

    //& Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
    public double addCheckingBalance(double addCheckingBalance) {
        this.checkingBalance += addCheckingBalance;
        bankAccountsTotal += addCheckingBalance;
        return this.checkingBalance;
    }

    public double addSavingsBalance(double addSavingsBalance) {
        this.savingsBalance += addSavingsBalance;
        bankAccountsTotal += addSavingsBalance;
        return this.savingsBalance;
    }

    //& Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
    public void withdrawalBalance(double withdrawalAmount) {
        if (this.checkingBalance - withdrawalAmount >= 0) {
            this.checkingBalance -= withdrawalAmount;
            bankAccountsTotal -= withdrawalAmount;
        } else {
            System.out.println("Sorry, you do not have enough funds to make this withdrawal!");
        }
    }

    //& Create a method to see the total money from the checking and saving.

    public double displayAllBalances() {
        double accountBalance = this.checkingBalance + this.savingsBalance;
        return accountBalance;
    }

    // public static void displayBankAccountsTotal() {
    //     System.out.printf("Bank Account Balance: $%.2f" + bankAccountsTotal);
    // }

    public static void totalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }
}