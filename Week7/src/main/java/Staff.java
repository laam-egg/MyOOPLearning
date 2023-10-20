public class Staff extends Person {
    private String school;

    private double pay;

    /**
     * Initializes a Staff object with given information.
     *
     * @param name - The name of the staff person.
     * @param address - The address of the staff person.
     * @param school - The school of the staff person.
     * @param pay - The pay of the staff person.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * Getter method for the `school` property of the Staff object.
     *
     * @return the current school of the staff person.
     */
    public String getSchool() {
        return this.school;
    }

    /**
     * Setter method for the `school` property of the Staff object.
     *
     * @param newSchool - The new school of the staff person.
     */
    public void setSchool(String newSchool) {
        this.school = newSchool;
    }

    /**
     * Getter method for the `pay` property of the Staff object.
     *
     * @return the current pay of the staff person.
     */
    public double getPay() {
        return this.pay;
    }

    /**
     * Setter method for the `pay` property of the Staff object.
     *
     * @param newPay - The new pay of the staff person.
     */
    public void setPay(double newPay) {
        this.pay = newPay;
    }

    /**
     * Dumps a string representation of this Staff object.
     *
     * @return the string representation.
     */
    public String toString() {
        return String.format("Staff[%s,school=%s,pay=%.1f]",
                super.toString(),
                this.school,
                this.pay
        );
    }
}
