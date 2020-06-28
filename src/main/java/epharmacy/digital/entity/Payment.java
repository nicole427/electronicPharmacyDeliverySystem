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
    public String toString() {
        return "Payment{" +
                "paymentStatus='" + paymentStatus + '\'' +
                '}';
    }

    public static class Builder
    {
        private String paymentStatus;

        public Builder setPaymentStatus(String paymentStatus){
            this.paymentStatus = paymentStatus;
            return this;
        }

        public Builder copy(Payment payment){
            this.paymentStatus = payment.paymentStatus;
            return this;
        }

        public Payment builder()
        {
            return new Payment(this);
        }

    }
}