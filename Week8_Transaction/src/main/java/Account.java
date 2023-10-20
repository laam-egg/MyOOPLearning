import java.util.ArrayList;

public class Account {
    private double balance;

    private ArrayList<Transaction> transitionList;

    private ArrayList<Transaction> transactionList;

    /**
     * Default constructor for the `Account` class.
     */
    public Account() {
        this.transactionList = new ArrayList<Transaction>();
    }

    /**
     * Private method to deposit. Use `addTransaction()` instead.
     *
     * @param amount - The amount to deposit.
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        this.balance += amount;
        Transaction t = new Transaction(Transaction.DEPOSIT, amount, this.balance);
        transactionList.add(t);
    }

    /**
     * Private method to withdraw. Use `addTransaction()` instead.
     *
     * @param amount - The amount to withdraw.
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        }
        if (amount > this.balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }
        this.balance -= amount;
        Transaction t = new Transaction(Transaction.WITHDRAW, amount, this.balance);
        transactionList.add(t);
    }

    /**
     * Adds a transaction.
     *
     * @param amount - The amount of the transaction.
     * @param operation - The type of the transaction,
     *                  which can be `Transaction.DEPOSIT` or `Transaction.WITHDRAW`.
     */
    public void addTransaction(double amount, String operation) {
        switch (operation) {
            case Transaction.DEPOSIT:
                deposit(amount);
                break;

            case Transaction.WITHDRAW:
                withdraw(amount);
                break;

            default:
                System.out.println("Yeu cau khong hop le!");
                break;
        }
    }

    /**
     * Prints out the past transactions.
     */
    public void printTransaction() {
        int i = 1;
        for (Transaction t : this.transactionList) {
            System.out.print("Giao dich " + i + ": ");
            if (t.getOperation().equals(Transaction.DEPOSIT)) {
                System.out.print("Nap tien ");
            } else {
                System.out.print("Rut tien ");
            }
            System.out.printf("$%.2f. So du luc nay: $%.2f.\n", t.getAmount(), t.getBalance());
            ++i;
        }
    }
}
