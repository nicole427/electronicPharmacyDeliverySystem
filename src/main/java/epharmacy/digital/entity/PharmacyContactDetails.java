package epharmacy.digital.entity;

public class PharmacyContactDetails {
    // all the attributes of entity
    private int landlineNumber;
    private int cellPhoneNumber;

    public PharmacyContactDetails(Builder builder) {
        this.landlineNumber = builder.landlineNumber;
        this.cellPhoneNumber = builder.cellPhoneNumber;
    }

    // getters for all attributes of entity PharmacyContactDetails
    public int getLandlineNumber() {
        return landlineNumber;
    }

    public int getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    // to string method for PharmacyContactDetails entity
    @Override
    public String toString() {
        return "PharmacyContactDetails{" +
                "landlineNumber=" + landlineNumber +
                ", mobileNumber=" + cellPhoneNumber +
                '}';
    }

    // add setters using building pattern
    public static class Builder
    {
        private int landlineNumber;
        private int cellPhoneNumber;

        public Builder setLandlineNumber(int landlineNumber) {
            this.landlineNumber = landlineNumber;
            return this;
        }

        public Builder setMobileNumber(int cellPhoneNumber) {
            this.cellPhoneNumber = cellPhoneNumber;
            return this;
        }

        // Copy method for PharmacyContactDetails entity
        public Builder copy (PharmacyContactDetails pharmacyContactDetails)
        {
            this.landlineNumber = pharmacyContactDetails.landlineNumber;
            this.cellPhoneNumber = pharmacyContactDetails.cellPhoneNumber;
            return this;
        }

        // Instance for Builder Pattern
        public PharmacyContactDetails builder()
        {
            return new PharmacyContactDetails(this);
        }
    }
}
