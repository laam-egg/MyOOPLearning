public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 1;

    public static final int TYPE_WITHDRAW_CHECKING = 2;

    public static final int TYPE_DEPOSIT_SAVINGS = 3;

    public static final int TYPE_WITHDRAW_SAVINGS = 4;

    private final int type;

    private final double amount;

    private final double initialBalance;

    private final double finalBalance;

    /**
     * Constructs a new transaction.
     *
     * @param type - Transaction type, can be one of Transaction.TYPE_* constants.
     * @param amount - The transaction amount.
     * @param initialBalance - The initial balance.
     * @param finalBalance - The final balance.
     */
    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /**
     * Use this function to retrieve the transaction type name.
     *
     * @return the transaction type name.
     */
    private String getTransactionTypeString() {
        switch (this.type) {
            case Transaction.TYPE_DEPOSIT_CHECKING:
                return "Nạp tiền vãng lai";

            case Transaction.TYPE_WITHDRAW_CHECKING:
                return "Rút tiền vãng lai";

            case Transaction.TYPE_DEPOSIT_SAVINGS:
                return "Nạp tiền tiết kiệm";

            case Transaction.TYPE_WITHDRAW_SAVINGS:
            default:
                return "Rút tiền tiết kiệm";
        }
    }

    /**
     * Dumps the transaction summary.
     *
     * @return the transaction summary as a string.
     */
    public String getTransactionSummary() {
        return String.format(
                "- Kiểu giao dịch: %s. Số dư ban đầu: $%.2f. Số tiền: $%.2f. Số dư cuối: $%.2f.",
                this.getTransactionTypeString(),
                this.initialBalance,
                this.amount,
                this.finalBalance
        );
    }
}
