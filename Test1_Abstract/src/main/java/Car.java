public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Constructs a new Car with given properties.
     *
     * @param brand - The brand of the car.
     * @param model - The model of the car.
     * @param registrationNumber - The registration number of the car.
     * @param owner - The owner of the car.
     * @param numberOfDoors - The number of doors that the car has.
     */
    public Car(
            String brand, String model,
            String registrationNumber,
            Person owner,
            int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Dumps a string representation of this car.
     *
     * @return the string representation.
     */
    @Override
    public String getInfo() {
        StringBuilder s = new StringBuilder("Car:");
        s.append("\n\tBrand: ").append(this.brand);
        s.append("\n\tModel: ").append(this.model);
        s.append("\n\tRegistration Number: ").append(this.registrationNumber);
        s.append("\n\tNumber of Doors: ").append(this.numberOfDoors);
        s.append("\n\tBelongs to ").append(this.owner.getGeneralInfo());
        return s.toString();
    }

    /**
     * Use this function to retrieve the car's number of doors.
     *
     * @return the number of doors.
     */
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    /**
     * Changes the car's number of doors.
     *
     * @param newNumberOfDoors - The car's new number of doors.
     */
    public void setNumberOfDoors(int newNumberOfDoors) {
        this.numberOfDoors = newNumberOfDoors;
    }
}
