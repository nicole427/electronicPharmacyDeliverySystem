package epharmacy.digital.entity;

public class Payment {
    private String paymentStatus;

    private Payment(Builder builder)
    {
        this.paymentStatus = builder.paymentStatus;
    }
    // Getters
    public String getPaymentStatus() {
        return paymentStatus;
    }

    @Override
    // ToString method for printing/displaying
    public String toString() {
        return "Payment{" +
                "paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
    // Builder class for the payment method
    public static class Builder
    {
        private String paymentStatus;


        public Builder setPaymentStatus(String paymentStatus)
        {
            this.paymentStatus = paymentStatus;
            return this;
        }

        // Not sure if this is necessary considering its one attribute but including for completeness
        public Builder copy (Payment Payment)
        {
            this.paymentStatus = Payment.paymentStatus;
            return this;
        }
        // Creating an instance for the builder pattern
        public Payment builder(){
            return new Payment(this);
        }

    }
}
