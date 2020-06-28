package epharmacy.digital.entity;

public class PharmacyLocation {
    // all the attributes of entity
    private String locationStreetName;
    private int locationStreetNumber;
    private String locationName;
    private int locationCode;

    // builder pattern method constructor
    private PharmacyLocation(Builder builder)
    {
        this.locationStreetName = builder.locationStreetName;
        this.locationStreetNumber = builder.locationStreetNumber;
        this.locationName = builder.locationName;
        this.locationCode = builder.locationCode;
    }

    // getters for all attributes of entity pharmacyLocation
    public String getLocationStreetName() {
        return locationStreetName;
    }

    public int getLocationStreetNumber() {
        return locationStreetNumber;
    }

    public String getLocationName() {
        return locationName;
    }

    public int getLocationCode() {
        return locationCode;
    }

    // to string method for PharmacyLocation entity
    @Override
    public String toString() {
        return "PharmacyLocation{" +
                "locationStreetName='" + locationStreetName + '\'' +
                ", locationStreetNumber=" + locationStreetNumber +
                ", locationName='" + locationName + '\'' +
                ", locationCode=" + locationCode +
                '}';
    }

    // add setters using building pattern
    private static class Builder {
        private String locationStreetName;
        private int locationStreetNumber;
        private String locationName;
        private int locationCode;

        public Builder setLocationStreetName(String locationStreetName) {
            this.locationStreetName = locationStreetName;
            return this;
        }

        public Builder setLocationStreetNumber(int locationStreetNumber) {
            this.locationStreetNumber = locationStreetNumber;
            return this;
        }

        public Builder setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
        }

        public Builder setLocationCode(int locationCode) {
            this.locationCode = locationCode;
            return this;
        }

        // Copy method for PharmacyLocation entity
        public Builder copy(PharmacyLocation pharmacyLocation)
        {
            this.locationStreetName = pharmacyLocation.locationStreetName;
            this.locationStreetNumber = pharmacyLocation.locationStreetNumber;
            this.locationName = pharmacyLocation.locationName;
            this.locationCode = pharmacyLocation.locationCode;
            return this;
        }

        // Instance for Builder Pattern
        public PharmacyLocation builder() {
            return new PharmacyLocation(this);
        }
    }
}
