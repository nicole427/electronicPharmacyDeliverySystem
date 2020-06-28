package epharmacy.digital.entity;

public class PaymentType {

    // entity attributes
    private double cashPayment, eftPayment;

    // Builder pattern constructor
    private PaymentType(Builder builder)
    {
        this.cashPayment = builder.cashPayment;
        this.eftPayment = builder.eftPayment;
    }
    // Getters
    public double getCashPayment() {
        return cashPayment;
    }

    public double getEftPayment() {
        return eftPayment;
    }

    @Override
    // Tostring for display
    public String toString() {
        return "PaymentType{" +
                "cashPayment=" + cashPayment +
                ", eftPayment=" + eftPayment +
                '}';
    }
    // Builder class for the payment method
    public static class Builder
    {
        private double cashPayment,eftPayment;

        public Builder setCashPayment(double cashPayment)
        {
            this.cashPayment = cashPayment;
            return this;
        }

        public Builder setEftPayment(double eftPayment)
        {
            this.eftPayment = eftPayment;
            return this;
        }

        //to below method is to make another copy of PaymentType
        public Builder copy (PaymentType paymentType)
        {
            this.cashPayment = paymentType.cashPayment;
            this.eftPayment = paymentType.eftPayment;
            return this;
        }

        // creating an instance for the builder pattern
        public PaymentType builder()
        {
            return new PaymentType(this);
        }

    }
}
