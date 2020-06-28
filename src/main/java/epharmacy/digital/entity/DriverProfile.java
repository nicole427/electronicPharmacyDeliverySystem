package epharmacy.digital.entity;

public class DriverProfile {

    private int driverId;
    private String driverName, driverSurname;

    // builder pattern method constructor
    private DriverProfile(Builder builder){
        this.driverId = builder.driverId;
        this.driverName = builder.driverName;
        this.driverSurname = builder.driverSurname;
    }
    // getters for all attributes of entity UserProfile
    public int getDriverId() {
        return driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getDriverSurname() {
        return driverSurname;
    }
    // to string to display what is in the class
    @Override
    public String toString() {
        return "DriverProfile{" +
                "driverId=" + driverId +
                ", driverName='" + driverName + '\'' +
                ", driverSurname='" + driverSurname + '\'' +
                '}';
    }
    // add setters using building pattern
    public static class Builder{

        private int driverId;
        private String driverName, driverSurname;

        public Builder setDriverId(int driverId){
            this.driverId = driverId;
            return this;
        }
        public Builder setDriverName(String driverName){
            this.driverName= driverName;
            return this;
        }
        public Builder setDriverSurname(String driverSurname){
            this.driverSurname = driverSurname;
            return this;
        }
        //to below method is to make another copy of driverProfile
        public Builder copy (DriverProfile driverProfile){
            this.driverId = driverProfile.driverId;
            this.driverName = driverProfile.driverName;
            this.driverSurname = driverProfile.driverSurname;
            return this;
        }
        // creating an instance for the builder pattern
        public DriverProfile builder(){
            return new DriverProfile(this);
        }
    }
}

