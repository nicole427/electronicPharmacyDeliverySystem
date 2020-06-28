package epharmacy.digital.entity;

public class DriverCar {
    // all the attributes of entity
    private int carRegistration;
    private String carColour;

    // builder pattern method constructor
    private DriverCar(Builder builder){
        this.carRegistration = builder.carRegistration;
        this.carColour = builder.carColour;
    }
    // getters for all attributes of entity UserProfile
    public int getCarRegistration() {
        return carRegistration;
    }

    public String getCarColour() {
        return carColour;
    }

    // to string to display what is in the class
    @Override
    public String toString() {
        return "DriverCar{" +
                "carRegistration=" + carRegistration +
                ", carColour='" + carColour + '\''  +
                '}';
    }
    // add setters using building pattern
    public static class Builder{

        private int carRegistration;
        private String carColour;

        public Builder setCarRegistration(int carRegistration){
            this.carRegistration = carRegistration;
            return this;
        }
        public Builder setCarColour(String carColour){
            this.carColour= carColour;
            return this;
        }

        //to below method is to make another copy of DriverCar
        public Builder copy (DriverCar driverCar){
            this.carRegistration = driverCar.carRegistration;
            this.carColour = driverCar.carColour;
            return this;
        }
        // creating an instance for the builder pattern
        public DriverCar builder(){
            return new DriverCar(this);
        }
    }
}