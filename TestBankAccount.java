public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(7500, 45000);

        //& depopsit works
        bankAccount1.addCheckingBalance(350);
        System.out.printf("Checking Balance: %.2f%n", bankAccount1.getCheckingBalance());

        //& withdrawal
        // bankAccount1.withdrawalBalance(350);
        // System.out.printf("Current Balance: %.2f%n", bankAccount1.getCheckingBalance());

        bankAccount1.withdrawalBalance(10000);
                                            // println must go to printf -> insert float into string -> remove + and use ,
        System.out.printf("Current Balance: %.2f%n", bankAccount1.getCheckingBalance());

        //& Display all accounts and balances

        bankAccount1.displayAllBalances();
        System.out.printf("Amount for all account balances: %.2f%n", bankAccount1.displayAllBalances());

        //& Display number of total accounts 
        //? when static call on the class and not the indivdual bankaccount1
        BankAccount.totalAccounts();
    }
}
