import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";

    public static final String SAVINGS = "SAVINGS";

    protected long accountNumber;

    protected double balance;

    protected final List<Transaction> transactionList;

    /**
     * Constructs a new Account with given properties.
     *
     * @param accountNumber - The account number.
     * @param balance - The account balance.
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionList = new ArrayList<Transaction>();
    }

    /**
     * Constructs a new Account with no information.
     */
    public Account() {
        this(-1, 0);
    }

    /**
     * Use this function to get account number.
     *
     * @return the result.
     */
    public long getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Use this function to get balance.
     *
     * @return the result.
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * Performs the basic withdrawal tasks.
     *
     * @param amount The amount to withdraw.
     * @throws InvalidFundingAmountException if amount is invalid.
     * @throws InsufficientFundsException if the current balance is insufficient
     *                                    to withdraw the specified amount.
     */
    public void doWithdrawing(double amount)
            throws InvalidFundingAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidFundingAmountException(amount);
        }
        if (amount > balance) {
            throw new InsufficientFundsException(amount);
        }
        this.balance -= amount;
    }

    /**
     * Performs the basic depositing tasks.
     *
     * @param amount The amount to deposit.
     * @throws InvalidFundingAmountException if amount is invalid.
     */
    public void doDepositing(double amount)
            throws InvalidFundingAmountException {
        if (amount <= 0) {
            throw new InvalidFundingAmountException(amount);
        }
        this.balance += amount;
    }

    /**
     * A subclass shall implement this method.
     *
     * @param amount - The amount to withdraw.
     */
    public abstract void withdraw(double amount);

    /**
     * A subclass shall implement this method.
     *
     * @param amount - The amount to deposit.
     */
    public abstract void deposit(double amount);

    /**
     * Dumps this account's transaction history as a string.
     *
     * @return the dumped string.
     */
    public String getTransactionHistory() {
        StringBuilder sb = new StringBuilder("Lịch sử giao dịch của tài khoản ");
        sb.append(this.accountNumber);
        sb.append(":\n");
        for (Transaction t : this.transactionList) {
            sb.append(t.getTransactionSummary());
            sb.append('\n');
        }
        return sb.toString();
    }

    /**
     * Adds a new transaction to this account.
     *
     * @param transaction - The transaction to be added.
     */
    public void addTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
    }

    /**
     * Checks whether this account equals the specified object.
     *
     * @param obj - Another Object to compare to.
     * @return boolean.
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof Account)) {
            return false;
        }
        Account other = (Account) obj;
        return this.getAccountNumber() == other.getAccountNumber();
    }
}
