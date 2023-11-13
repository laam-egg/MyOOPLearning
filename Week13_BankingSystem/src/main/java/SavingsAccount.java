public class SavingsAccount extends Account {
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance < 5000 || amount > 1000) {
            System.out.println("Lỗi: Không rút được tiền.");
            return;
        }
        try {
            double initialBalance = this.balance;
            this.doWithdrawing(amount);
            double finalBalance = this.balance;
            Transaction transaction = new Transaction(
                    Transaction.TYPE_WITHDRAW_SAVINGS,
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
                    Transaction.TYPE_DEPOSIT_SAVINGS,
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
