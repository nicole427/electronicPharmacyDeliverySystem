package epharmacy.digital.entity;

public class PaymentNotificationMessage {

    private String referenceNumber;
    private double paymentTotal;

    private PaymentNotificationMessage(Builder builder)
    {
        this.referenceNumber = builder.referenceNumber;
        this.paymentTotal = builder.paymentTotal;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public double getPaymentTotal() {
        return paymentTotal;
    }

    @Override
    public String toString() {
        return "PaymentNotificationMessage{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", paymentTotal=" + paymentTotal +
                '}';
    }

    public static class Builder
    {
        private String referenceNumber;
        private double paymentTotal;

        public Builder setReferenceNumber(String referenceNumber)
        {
            this.referenceNumber = referenceNumber;
            return this;
        }

        public Builder setPaymentTotal(double paymentTotal)
        {
            this.paymentTotal = paymentTotal;
            return this;
        }

        public Builder copy (PaymentNotificationMessage paymentNotificationMessage)
        {
            this.referenceNumber = paymentNotificationMessage.referenceNumber;
            this.paymentTotal = paymentNotificationMessage.paymentTotal;
            return this;
        }

        public PaymentNotificationMessage builder()
        {
            return new PaymentNotificationMessage(this);
        }
    }
}
