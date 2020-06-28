package epharmacy.digital.entity;

public class DriverProfile {

        private int driverId;
        private String driverName, driverSurname;

        // builder pattern method constructor
        private DriverProfile(epharmacy.digital.entity.DriverProfile.Builder builder){
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

            public epharmacy.digital.entity.DriverProfile.Builder setDriverId(int driverId){
                this.driverId = driverId;
                return this;
            }
            public epharmacy.digital.entity.DriverProfile.Builder setDriverName(String driverName){
                this.driverName= driverName;
                return this;
            }
            public epharmacy.digital.entity.DriverProfile.Builder setDriverSurname(String driverSurname){
                this.driverSurname = driverSurname;
                return this;
            }
            //to below method is to make another copy of driverProfile
            public epharmacy.digital.entity.DriverProfile.Builder copy (epharmacy.digital.entity.DriverProfile driverProfile){
                this.driverId = driverProfile.driverId;
                this.driverName = driverProfile.driverName;
                this.driverSurname = driverProfile.driverSurname;
                return this;
            }
            // creating an instance for the builder pattern
            public epharmacy.digital.entity.DriverProfile builder(){
                return new epharmacy.digital.entity.DriverProfile(this);
            }
        }
    }


