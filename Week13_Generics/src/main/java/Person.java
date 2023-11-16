public class Person extends Week11 implements Comparable<Person> {

    protected String name;

    protected int age;

    protected String address;

    /**
     * Constructs a new Person with no information.
     */
    public Person() {
        this(null, 0, null);
    }

    /**
     * Constructs a new Person with given information.
     *
     * @param name - The person's name.
     * @param age - The person's age.
     * @param address - The person's address.
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * Use this function to get name.
     *
     * @return the result.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Use this function to set name.
     *
     * @param name - The name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Use this function to get age.
     *
     * @return the result.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Use this function to set age.
     *
     * @param age - The age.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Use this function to get address.
     *
     * @return the result.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Use this function to set address.
     *
     * @param address - The address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Person other) {
        if (this.name.equals(other.name)) {
            return Integer.compare(this.age, other.age);
        }
        return this.name.compareTo(other.name);
    }
}
