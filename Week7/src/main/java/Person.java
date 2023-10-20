public class Person {
    private String name;

    private String address;

    /**
     * Initializes a Person object with given name and address.
     *
     * @param name - The name of the person.
     * @param address - The address of the person.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Getter method for the `name` property of the person.
     *
     * @return the current name of the person.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter method for the `name` property of the person.
     *
     * @param newName - The new name of the person.
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * Getter method for the `address` property of the person.
     *
     * @return the current address of the person.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Setter method for the `address` property of the person.
     *
     * @param newAddress - The new address of the person.
     */
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    /**
     * Dumps a string representation of this person.
     *
     * @return the string representation.
     */
    public String toString() {
        return String.format("Person[name=%s,address=%s]",
                this.name,
                this.address
        );
    }
}
