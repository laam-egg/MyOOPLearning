public class InsufficientFundsException extends BankException {
    /**
     * Constructs a new exception object indicating an error of
     * insufficient funds.
     *
     * @param amount - The amount of transaction that exceeds
     *                 current balance.
     */
    public InsufficientFundsException(double amount) {
        super(String.format(
                "Số dư tài khoản không đủ $%.2f để thực hiện giao dịch",
                amount
        ));
    }
}
