package epharmacy.digital.entity;

public class Order {

    private int orderNum;
    private String orderName;
    private double orderTotal;

    private Order(Builder builder){

        this.orderNum = builder.orderNum;
        this.orderName = builder.orderName;
        this.orderTotal = builder.orderTotal;
    }

    public String toString(){

        return "Order Details:" +
                "Order Number:" + orderNum + '\'' +
                "Order Name: " + orderName + '\'' +
                "Order Total:" + orderTotal;

    }

    public int getOrderNum() {
        return orderNum;
    }

    public String getOrderName(){

        return orderName;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public static class Builder{

        private int orderNum;
        private String orderName;
        private double orderTotal;

        public void setOrderNum(int orderNum) {
            this.orderNum = orderNum;

        }

        public void setOrderName(String orderName) {
            this.orderName = orderName;
        }

        public void setOrderTotal(double orderTotal) {
            this.orderTotal = orderTotal;
        }

        public Order build(){
            return new Order(this);
        }
    }
}
