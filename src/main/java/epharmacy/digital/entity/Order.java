package epharmacy.digital.entity;

public class Order {

    private int orderNumber;
    private int UserId;
    private double orderTotal;

    private Order(Builder builder){

        this.orderNumber = builder.orderNumber;
        this.UserId = builder.userId;
        this.orderTotal = builder.orderTotal;
    }

    public String toString(){

        return "Order Details:" +
                "Order Number:" + orderNumber + '\'' +
                "Order Name: " + UserId + '\'' +
                "Order Total:" + orderTotal;

    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getUserId(){

        return UserId;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public static class Builder{

        private int orderNumber;
        private int userId;
        private double orderTotal;

        public void setOrderNum(int orderNumber) {
            this.orderNumber = orderNumber;

        }

        public void setUserId(int userId) {

            this.userId = userId;
        }

        public void setOrderTotal(double orderTotal) {
            this.orderTotal = orderTotal;
        }

        public Order build(){
            return new Order(this);
        }
    }
}
