public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Initializes a new Student object with given information.
     *
     * @param name - The name of the student.
     * @param address - The address of the student.
     * @param program - The current academic program of the student.
     * @param year - The current academic year of the student.
     * @param fee - The current tuition fee of the student.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * Getter method for the `program` property of the Student object.
     *
     * @return the current academic program of the student.
     */
    public String getProgram() {
        return this.program;
    }

    /**
     * Setter method for the `program` property of the Student object.
     *
     * @param newProgram - The new academic program of the student.
     */
    public void setProgram(String newProgram) {
        this.program = newProgram;
    }

    /**
     * Getter method for the `year` property of the Student object.
     *
     * @return the current academic year of the student.
     */
    public int getYear() {
        return this.year;
    }

    /**
    * Setter method for the `year` property of the Student object.
    *
    * @param newYear - The new academic year of the student.
    */
    public void setYear(int newYear) {
      this.year = newYear;
    }

    /**
     * Getter method for the `fee` property of the Student object.
     *
     * @return the current tuition fee of the student.
     */
    public double getFee() {
        return this.fee;
    }

    /**
     * Setter method for the `fee` property of the Student object.
     *
     * @param newFee - The new tuition fee of the student.
     */
    public void setFee(double newFee) {
        this.fee = newFee;
    }

    /**
     * Dumps a string representation of this Student object.
     *
     * @return the string representation.
     */
    public String toString() {
        return String.format("Student[%s,program=%s,year=%d,fee=%.1f]",
                super.toString(),
                this.program,
                this.year,
                this.fee
        );
    }
}
