public class MotorBike extends Vehicle {

    private boolean hasSidecar;

    /**
     * Constructs a new MotorBike object with given properties.
     *
     * @param brand - The brand of the motorbike.
     * @param model - The model of the motorbike.
     * @param registrationNumber - The registration number of the motorbike.
     * @param owner - The owner of the motorbike.
     * @param hasSidecar - Whether this motorbike has a sidecar.
     */
    public MotorBike(String brand, String model,
                     String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * Dumps a string representation of this MotorBike object.
     *
     * @return the string representation.
     */
    @Override
    public String getInfo() {
        StringBuilder s = new StringBuilder("Motor Bike:");
        s.append("\n\tBrand: ").append(this.brand);
        s.append("\n\tModel: ").append(this.model);
        s.append("\n\tRegistration Number: ").append(this.registrationNumber);
        s.append("\n\tHas Side Car: ").append(this.hasSidecar);
        s.append("\n\tBelongs to ").append(this.owner.getGeneralInfo());
        return s.toString();
    }

    /**
     * Use this function to know whether this motorbike has
     * a sidecar.
     *
     * @return true if it does have, false if not.
     */
    public boolean isHasSidecar() {
        return this.hasSidecar;
    }

    /**
     * Sets whether this motorbike has a sidecar.
     *
     * @param hasSidecar - true if this motorbike has a sidecar,
     *                   false if not.
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
