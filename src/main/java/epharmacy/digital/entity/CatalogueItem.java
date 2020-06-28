package epharmacy.digital.entity;

public class CatalogueItem {

    private String itemName;
    private String itemDescription;

    public CatalogueItem(Builder builder) {

        this.itemName = builder.itemName;
        this.itemDescription = builder.itemDescription;

    }


    @Override
    public String toString() {
        return "CatalogueItem{" +
                "itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                '}';
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public static class Builder {
        private String itemName;
        private String itemDescription;

        public Builder setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public Builder setItemDescription(String itemDescription) {
            this.itemDescription = itemDescription;
            return this;
        }

        public Builder copy(CatalogueItem catitem){
            this.itemName = catitem.itemName;
            this.itemDescription = catitem.itemDescription;
            return this;
        }

        public CatalogueItem builder(){
            return new CatalogueItem(this);
        }

    }


}

