public class Transaction {
    private String operation;

    private double amount;

    private double balance;

    /**
     * This string represents the deposit operation.
     */
    public static final String DEPOSIT = "deposit";

    /**
     * This string represents the withdrawal operation.
     */
    public static final String WITHDRAW = "withdraw";

    /**
     * Constructs a Transaction with given operation, amount and balance.
     *
     * @param operation - Either `Transaction.DEPOSIT` or `Transaction.WITHDRAW`.
     * @param amount - The amount of the transaction.
     * @param balance - The balance of the transaction.
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * Getter method for the `operation` property of a Transaction object.
     *
     * @return the current operation of the transaction.
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * Setter method for the `operation` property of a Transaction object.
     *
     * @param newOperation - The new operation of the transaction.
     */
    public void setOperation(String newOperation) {
        this.operation = newOperation;
    }

    /**
     * Getter method for the `amount` property of a Transaction object.
     *
     * @return the current amount of the transaction.
     */
    public double getAmount() {
        return this.amount;
    }

    /**
     * Setter method for the `amount` property of a Transaction object.
     *
     * @param newAmount - The new amount of the transaction.
     */
    public void setAmount(double newAmount) {
        this.amount = newAmount;
    }

    /**
     * Getter method for the `balance` property of a Transaction object.
     *
     * @return the current balance of the transaction.
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * Setter method for the `balance` property of a Transaction object.
     *
     * @param newBalance - The new balance of the transaction.
     */
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}
