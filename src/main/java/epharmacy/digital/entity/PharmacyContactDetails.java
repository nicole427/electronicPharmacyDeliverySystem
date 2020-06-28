package epharmacy.digital.entity;

public class PharmacyContactDetails {
    // all the attributes of entity
    private int landlineNumber;
    private int mobileNumber;

    public PharmacyContactDetails(Builder builder) {
        this.landlineNumber = builder.landlineNumber;
        this.mobileNumber = builder.mobileNumber;
    }

    // getters for all attributes of entity PharmacyContactDetails
    public int getLandlineNumber() {
        return landlineNumber;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    // to string method for PharmacyContactDetails entity
    @Override
    public String toString() {
        return "PharmacyContactDetails{" +
                "landlineNumber=" + landlineNumber +
                ", mobileNumber=" + mobileNumber +
                '}';
    }

    // add setters using building pattern
    public static class Builder
    {
        private int landlineNumber;
        private int mobileNumber;

        public Builder setLandlineNumber(int landlineNumber) {
            this.landlineNumber = landlineNumber;
            return this;
        }

        public Builder setMobileNumber(int mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        // Copy method for PharmacyContactDetails entity
        public Builder copy (PharmacyContactDetails pharmacyContactDetails)
        {
            this.landlineNumber = pharmacyContactDetails.landlineNumber;
            this.mobileNumber = pharmacyContactDetails.mobileNumber;
            return this;
        }

        // Instance for Builder Pattern
        public PharmacyContactDetails builder()
        {
            return new PharmacyContactDetails(this);
        }
    }
}
