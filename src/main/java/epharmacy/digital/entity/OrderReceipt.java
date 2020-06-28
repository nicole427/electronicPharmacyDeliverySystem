package epharmacy.digital.entity;

public class OrderReceipt {

    private int orderNumber;
    private String itemName;
    private int itemQty;
    private double orderTotal;

    private OrderReceipt(Builder builder){

        this.orderNumber = builder.orderNumber;
        this.itemName = builder.itemName;
        this.itemQty = builder.itemQty;
        this.orderTotal = builder.orderTotal;

    }

    @Override
    public String toString() {
        return "OrderReceipt{" +
                "orderNumber=" + orderNumber +
                ", itemName='" + itemName + '\'' +
                ", itemQty=" + itemQty +
                ", orderTotal=" + orderTotal +
                '}';
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemQty() {
        return itemQty;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public static class Builder{

        private int orderNumber;
        private String itemName;
        private int itemQty;
        private double orderTotal;

        public void setOrderNumber(int orderNumber) {
            this.orderNumber = orderNumber;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public void setItemQty(int itemQty) {
            this.itemQty = itemQty;
        }

        public void setOrderTotal(double orderTotal) {
            this.orderTotal = orderTotal;
        }

        public OrderReceipt build(){
            return new OrderReceipt(this);
        }
    }
}
