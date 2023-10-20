import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String name;

    private String address;

    private final List<Vehicle> vehicleList;

    /**
     * Constructs a Person object with given properties.
     *
     * @param name - The name of the person.
     * @param address - The address of the person.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        this.vehicleList = new ArrayList<Vehicle>();
    }

    /**
     * Adds a vehicle that this person possesses.
     *
     * @param vehicle - A Vehicle object.
     */
    public void addVehicle(Vehicle vehicle) {
        if (!this.vehicleList.contains(vehicle)) {
            this.vehicleList.add(vehicle);
        }
    }

    /**
     * Reclaims this person's ownership of a vehicle.
     *
     * @param registrationNumber - The registration number of the vehicle.
     */
    public void removeVehicle(String registrationNumber) {
        this.vehicleList.removeIf(
                (Vehicle v) -> v.getRegistrationNumber().equals(registrationNumber)
        );
    }

    /**
     * This function returns the general information of the
     * person, including their name and address.
     * NOTE: 2023-10-19: This function is currently not
     * required by OASIS, but is added for convenience in
     * writing methods Car.getInfo() and MotorBike.getInfo().
     *
     * @return the general information of the person, as a
     * string.
     */
    public String getGeneralInfo() {
        return String.format("%s - %s", this.name, this.address);
    }

    /**
     * Lists all vehicles that this person possesses, along with
     * their detailed information.
     *
     * @return a string contains the list.
     */
    public String getVehiclesInfo() {
        if (this.vehicleList.isEmpty()) {
            return String.format("%s has no vehicle!", this.name);
        }
        StringBuilder s = new StringBuilder(this.name);
        s.append(" has:\n\n");

        for (Vehicle v : this.vehicleList) {
            s.append(v.getInfo());
            s.append("\n");
        }

        return s.toString();
    }

    /**
     * Use this function to retrieve the name of the person.
     *
     * @return the name of the person.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Changes this person's name.
     *
     * @param newName - The new name of the person.
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * Use this function to retrieve the address of the person.
     *
     * @return the address of the person.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Changes this person's address.
     *
     * @param newAddress - The new address of the person.
     */
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    /**
     * Detects equality.
     * NOTE: 2023-10-19: This function is not required by
     * OASIS, but helps Person.addVehicle() detects
     * duplicates.
     *
     * @param obj - Another Object.
     * @return whether the specified Object equals this Person instance.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person other = (Person) obj;
            return (
                    this.name.equals(other.name)
                    && this.address.equals(other.address)
            );
        }
        return false;
    }
}
