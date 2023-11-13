public class CheckingAccount extends Account {
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        try {
            double initialBalance = this.balance;
            this.doWithdrawing(amount);
            double finalBalance = this.balance;
            Transaction transaction = new Transaction(
                    Transaction.TYPE_WITHDRAW_CHECKING,
                    amount,
                    initialBalance,
                    finalBalance
            );
            this.transactionList.add(transaction);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deposit(double amount) {
        try {
            double initialBalance = this.balance;
            this.doDepositing(amount);
            double finalBalance = this.balance;
            Transaction transaction = new Transaction(
                    Transaction.TYPE_DEPOSIT_CHECKING,
                    amount,
                    initialBalance,
                    finalBalance
            );
            this.transactionList.add(transaction);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
