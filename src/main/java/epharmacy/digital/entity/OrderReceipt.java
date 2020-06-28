package epharmacy.digital.entity;

public class OrderReceipt {

    private int orderNumber;
    private int userId;
    private String catalogueItemName;
    private int catalogueItemQty;
    private double orderTotal;

    private OrderReceipt(Builder builder){

        this.orderNumber = builder.orderNumber;
        this.userId = builder.userId;
        this.catalogueItemName = builder.catalogueItemName;
        this.catalogueItemQty = builder.catalogueItemQty;
        this.orderTotal = builder.orderTotal;

    }

    @Override
    public String toString() {
        return "OrderReceipt{" +
                "orderNumber=" + orderNumber +
                ", userId='" + userId + '\'' +
                ", CatalogueItemQty=" + catalogueItemQty +
                ", CatalogueItemName=" + catalogueItemName +
                ", orderTotal=" + orderTotal +
                '}';
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getUserId() {
        return userId;
    }
    public String getCatalogueItemName(){return catalogueItemName;}

    public int getCatalogueItemQty() {
        return catalogueItemQty;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public static class Builder{


        private int orderNumber;
        private int userId;
        private String catalogueItemName;
        private int catalogueItemQty;
        private double orderTotal;


        public Builder setOrderNumber(int orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        public Builder setUserId(int userId) {
            this.userId = userId;
            return this;
        }
        public Builder setCatalogueItemName(String catalogueItemName) {
            this.catalogueItemName = catalogueItemName;
            return this;
        }
        public Builder setCatalogueItemQty(int catalogueItemQty) {

            this.catalogueItemQty = catalogueItemQty;
            return this;
        }

        public Builder setOrderTotal(double orderTotal) {

            this.orderTotal = orderTotal;
            return this;
        }
        public Builder copy(OrderReceipt orderReceipt){
            this.orderNumber= orderReceipt.orderNumber;
            this.catalogueItemName = orderReceipt.catalogueItemName;
            this.catalogueItemQty = orderReceipt.catalogueItemQty;
            this.userId = orderReceipt.userId;
            this.orderTotal = orderReceipt.orderTotal;
            return this;
        }
        public OrderReceipt builder(){
            return new OrderReceipt(this);
        }
    }

}
