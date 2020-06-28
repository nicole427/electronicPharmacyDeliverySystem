package epharmacy.digital.entity;

public class DriverLocation {
    // all the attributes of entity
    private int currentDriverLocation;

    // builder pattern method constructor
    private DriverLocation(Builder builder){
        this.currentDriverLocation = builder.currentDriverLocation;
    }
    // getters for all attributes of entity UserProfile
    public int getCurrentDriverLocation() {
        return currentDriverLocation;
    }

    // to string to display what is in the class
    @Override
    public String toString() {
        return "DriverLocation{" +
                "currentDriverLocation=" + currentDriverLocation + '\'' +
                '}';
    }
    // add setters using building pattern
    public static class Builder{

        private int currentDriverLocation;

        public Builder setCurrentDriverLocation(int currentDriverLocation){
            this.currentDriverLocation = currentDriverLocation;
            return this;
        }

        //to below method is to make another copy of DriverCar
        public Builder copy (DriverLocation driverLocation){
            this.currentDriverLocation = driverLocation.currentDriverLocation;
            return this;
        }
        // creating an instance for the builder pattern
        public DriverLocation builder(){
            return new DriverLocation(this);
        }
    }
}
