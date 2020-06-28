package epharmacy.digital.entity;

public class CatalogueItemType {
    private String otcItem;
    private String prescriptionItem;
    public CatalogueItemType(Builder builder){
        this.otcItem = builder.otcItem;
        this.prescriptionItem = builder.prescriptionItem;
    }
    public String getOtcItem() {
        return otcItem;
    }

    public String getPrescriptionItem() {
        return prescriptionItem;
    }

    @Override
    public String toString() {
        return "CatalogueItemType{" +
                "otcItem='" + otcItem + '\'' +
                ", prescriptionItem='" + prescriptionItem + '\'' +
                '}';
    }

    public static class Builder{
        private String otcItem;
        private String prescriptionItem;

        public Builder setOtcItem(String otcItem){
            this.otcItem = otcItem;
            return this;
        }
        public Builder setPrescriptionItem(String prescriptionItem){
            this.prescriptionItem = prescriptionItem;
            return this;
        }

        public Builder copy (CatalogueItemType catItemType){
            this.otcItem = catItemType.otcItem;
            this.prescriptionItem = catItemType.prescriptionItem;
            return this;
        }

        public CatalogueItemType builder(){
            return new CatalogueItemType(this);
        }

    }
}
