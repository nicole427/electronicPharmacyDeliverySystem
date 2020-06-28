package epharmacy.digital.entity;

public class PharmacyCatalogue {
    private String catalogueName;
    private String catalogueDescription;

    // builder pattern method constructor
    public PharmacyCatalogue(Builder builder) {
        this.catalogueName = builder.catalogueName;
        this.catalogueDescription = builder.catalogueDescription;
    }

    // getters for all attributes of entity Pharmacy
    public String getCatalogueName() {
        return catalogueName;
    }

    public String getCatalogueDescription() {
        return catalogueDescription;
    }

    // to string method for PharmacyCatalogue entity
    @Override
    public String toString() {
        return "PharmacyCatalogue{" +
                "catalogueName='" + catalogueName + '\'' +
                ", catalogueDescription='" + catalogueDescription + '\'' +
                '}';
    }

    // add setters using building pattern
    public static class Builder
    {
        private String catalogueName;
        private String catalogueDescription;

        public Builder setCatalogueName(String catalogueName) {
            this.catalogueName = catalogueName;
            return this;
        }

        public Builder setCatalogueDescription(String catalogueDescription) {
            this.catalogueDescription = catalogueDescription;
            return this;
        }

        // Copy method for PharmacyCatalogue entity
        public Builder copy(PharmacyCatalogue pharmacyCatalogue)
        {
            this.catalogueName = pharmacyCatalogue.catalogueName;
            this.catalogueDescription = pharmacyCatalogue.catalogueDescription;
            return this;
        }

        // Instance for Builder Pattern
        public PharmacyCatalogue builder()
        {
            return new PharmacyCatalogue(this);
        }
    }
}
