import java.util.ArrayList;
import java.util.List;

public class Customer {

    private long idNumber;

    private String fullName;

    private final List<Account> accountList;

    /**
     * Constructs a new Customer object with given information.
     *
     * @param idNumber - The ID number of the customer.
     * @param fullName - The customer's full name.
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
        this.accountList = new ArrayList<Account>();
    }

    /**
     * Constructs a new Customer object with no information.
     */
    public Customer() {
        this(-1, null);
    }

    /**
     * Dumps a string representation of this Customer object.
     *
     * @return the string representation.
     */
    public String getCustomerInfo() {
        return String.format("Số CMND: %s. Họ tên: %s.",
                this.idNumber,
                this.fullName
        );
    }

    /**
     * Adds an account to this customer's account list.
     *
     * @param account - The account to be added.
     */
    public void addAccount(Account account) {
        this.accountList.add(account);
    }

    /**
     * Removes an account from this customer's account list.
     *
     * @param account - The account to be removed.
     */
    public void removeAccount(Account account) {
        this.accountList.removeIf(
                (Account a) -> a.equals(account)
        );
    }

    /**
     * Use this function to get id number.
     *
     * @return the result.
     */
    public long getIdNumber() {
        return this.idNumber;
    }

    /**
     * Use this function to set id number.
     *
     * @param idNumber - The id number.
     */
    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * Use this function to get full name.
     *
     * @return the result.
     */
    public String getFullName() {
        return this.fullName;
    }

    /**
     * Use this function to set full name.
     *
     * @param fullName - The full name.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Use this function to get account list.
     *
     * @return the result.
     */
    public List<Account> getAccountList() {
        return this.accountList;
    }
}
