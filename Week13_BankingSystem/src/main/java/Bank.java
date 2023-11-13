import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private final List<Customer> customerList;

    /**
     * Constructs a blank new Bank object.
     */
    public Bank() {
        this.customerList = new ArrayList<Customer>();
    }

    /**
     * Use this function to load customer list from an
     * input stream into the system.
     *
     * @param inputStream The input stream.
     */
    public void readCustomerList(InputStream inputStream) {
        Scanner sc = new Scanner(inputStream);
        String namePartPattern = "[^0-9]+";

        List<String> nameParts = new ArrayList<String>();
        String fullName = "";
        long idNumber;

        while (sc.hasNext(namePartPattern)) {
            nameParts.clear();

            do {
                nameParts.add(sc.next(namePartPattern));
            } while (sc.hasNext(namePartPattern));
            fullName = String.join(" ", nameParts);
            idNumber = sc.nextLong();
            Customer customer = new Customer(idNumber, fullName);

            while (sc.hasNextLong()) {
                // Read the next account of this customer.
                long accountNumber = sc.nextLong();
                String accountType = sc.next();
                double accountBalance = sc.nextDouble();
                Account account = null;
                if (accountType.equals(Account.CHECKING)) {
                    account = new CheckingAccount(accountNumber, accountBalance);
                } else {
                    account = new SavingsAccount(accountNumber, accountBalance);
                }
                customer.addAccount(account);
            }

            this.customerList.add(customer);
        }
    }

    /**
     * Dumps a string contains information of all customers,
     * sorted by name.
     *
     * @return the dumped string.
     */
    public String getCustomersInfoByNameOrder() {
        final List<Customer> sorted = new ArrayList<Customer>(this.customerList);
        sorted.sort((Customer a, Customer b) -> a.getFullName().compareTo(b.getFullName()));
        return Bank.getCustomersInfoInList(sorted);
    }

    /**
     * Dumps a string contains information of all customers,
     * sorted by ID number.
     *
     * @return the dumped string.
     */
    public String getCustomersInfoByIdOrder() {
        final List<Customer> sorted = new ArrayList<Customer>(this.customerList);
        sorted.sort((Customer a, Customer b) -> Long.compare(a.getIdNumber(), b.getIdNumber()));
        return Bank.getCustomersInfoInList(sorted);
    }

    /**
     * Private method to be used by getCustomersInfoByXXXOrder methods.
     *
     * @param customers - The sorted customer list.
     * @return the dumped string.
     */
    private static String getCustomersInfoInList(List<Customer> customers) {
        StringBuilder sb = new StringBuilder();
        for (Customer customer : customers) {
            sb.append("Số CMND: ");
            sb.append(customer.getIdNumber());
            sb.append(". Họ tên: ");
            sb.append(customer.getFullName());
            sb.append(".\n");
        }
        return sb.toString();
    }

    /**
     * Use this function to get customer list.
     *
     * @return the result.
     */
    public List<Customer> getCustomerList() {
        return this.customerList;
    }
}
