package epharmacy.digital.entity;

public class OtcItem {
    private int itemNumber;
    private String itemName;
    private int itemQty;
    private double itemPrice;

    public OtcItem(Builder builder){
        this.itemNumber = builder.itemNumber;
        this.itemName = builder.itemName;
        this.itemQty = builder.itemQty;
        this.itemPrice = builder.itemPrice;
    }
    public int getItemNumber() {
        return itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemQty() {
        return itemQty;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    @Override
    public String toString() {
        return "OtcItem{" +
                "itemNumber=" + itemNumber +
                ", itemName='" + itemName + '\'' +
                ", itemQty=" + itemQty +
                ", itemPrice=" + itemPrice +
                '}';
    }

    public static class Builder{
        private int itemNumber;
        private String itemName;
        private int itemQty;
        private double itemPrice;

        public Builder setItemNumber(int itemNumber){
            this.itemNumber= itemNumber;
            return this;
        }
        public Builder setItemName(String itemName){
            this.itemName= itemName;
            return this;
        }
        public Builder setItemQty(int itemQty){
            this.itemQty= itemQty;
            return this;

        }
        public Builder setItemPrice(double itemPrice){
            this.itemPrice= itemPrice;
            return this;
        }

        public Builder copy(OtcItem otcItem){
            this.itemNumber = otcItem.itemNumber;
            this.itemName = otcItem.itemName;
            this.itemQty= otcItem.itemQty;
            this.itemPrice = otcItem.itemPrice;
            return this;
        }
        public OtcItem builder(){
            return new OtcItem(this);
        }
    }
}

