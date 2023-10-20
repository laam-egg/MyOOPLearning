public abstract class Vehicle {
    protected String brand;

    protected String model;

    protected String registrationNumber;

    protected Person owner;

    /**
     * Constructs a new Vehicle object with given properties.
     *
     * @param brand - The brand of the vehicle.
     * @param model - The model of the vehicle.
     * @param registrationNumber - The registration number of the vehicle.
     * @param owner - The owner of the vehicle.
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * A concrete subclass must implement this function
     * to dumps a string representation of this vehicle.
     *
     * @return the string representation.
     */
    public abstract String getInfo();

    /**
     * Transfer ownerships.
     * This means:
     *  1. To remove this vehicle from the old owner's vehicle list.
     *  2. To set the new owner for this vehicle.
     *  3. To add this vehicle to the new owner's vehicle list.
     *
     * @param newOwner - The new owner of the vehicle.
     */
    public void transferOwnership(Person newOwner) {
        Person oldOwner = this.getOwner();
        oldOwner.removeVehicle(this.getRegistrationNumber());
        this.setOwner(newOwner);
        newOwner.addVehicle(this);
    }

    /**
     * Use this function to retrieve the brand of the vehicle.
     *
     * @return the brand of the vehicle.
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * Changes the brand of this vehicle.
     *
     * @param newBrand - The new brand of the vehicle.
     */
    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    /**
     * Use this function to retrieve the model of the vehicle.
     *
     * @return the model of the vehicle.
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Changes the model of this vehicle.
     *
     * @param newModel - The new model of the vehicle.
     */
    public void setModel(String newModel) {
        this.model = newModel;
    }

    /**
     * Use this function to retrieve the registration number of the vehicle.
     *
     * @return the registration number of the vehicle.
     */
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    /**
     * Changes the registration number of this vehicle.
     *
     * @param newRegistrationNumber - The new registration number.
     */
    public void setRegistrationNumber(String newRegistrationNumber) {
        this.registrationNumber = newRegistrationNumber;
    }

    /**
     * Use this function to know the owner of the vehicle.
     *
     * @return the current owner of the vehicle, as a Person object.
     */
    public Person getOwner() {
        return this.owner;
    }

    /**
     * Changes the owner of this vehicle.
     *
     * @param newOwner - The new owner of the vehicle, as a Person object.
     */
    public void setOwner(Person newOwner) {
        this.owner = newOwner;
    }

    /**
     * Detects equality.
     * NOTE: 2023-10-19: This function is not required by
     * OASIS, but helps Person.addVehicle() detects
     * duplicates.
     *
     * @param obj - Another Object.
     * @return whether the specified Object equals this Vehicle instance.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle other = (Vehicle) obj;
            return (
                    this.brand.equals(other.brand)
                    && this.model.equals(other.model)
                    && this.registrationNumber.equals(other.registrationNumber)
                    && this.owner.equals(other.owner)
            );
        }
        return false;
    }
}
