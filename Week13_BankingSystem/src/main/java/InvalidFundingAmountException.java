public class InvalidFundingAmountException extends BankException {
    /**
     * Constructs a new exception object indicating an error of invalid
     * funding amount.
     *
     * @param amount - The funding amount that is considered invalid.
     */
    public InvalidFundingAmountException(double amount) {
        super(String.format("Số tiền không hợp lệ: $%.2f", amount));
    }
}
