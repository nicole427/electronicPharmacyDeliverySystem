package epharmacy.digital.entity;

public class PhoneCall {

    private int orderNumber;
    private String orderName;
    private double orderTotal;

    private PhoneCall(Builder builder){

        this.orderName = builder.orderName;
        this.orderNumber = builder.orderNumber;
        this.orderTotal = builder.orderTotal;
    }

    @Override
    public String toString() {
        return "PhoneCall{" +
                "orderNumber=" + orderNumber +
                ", orderName='" + orderName + '\'' +
                ", orderTotal=" + orderTotal +
                '}';
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public static class Builder{

        private int orderNumber;
        private String orderName;
        private double orderTotal;

        public void setOrderNumber(int orderNumber) {
            this.orderNumber = orderNumber;
        }

        public void setOrderName(String orderName) {
            this.orderName = orderName;
        }

        public void setOrderTotal(double orderTotal) {
            this.orderTotal = orderTotal;
        }

        public PhoneCall build(){
            return new PhoneCall(this);
        }
    }
}
