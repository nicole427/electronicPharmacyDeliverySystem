package epharmacy.digital.entity;

public class Payment {

    private String paymentType, pharmacyBankDetails;
    private int paymentTotal;

    private Payment(Builder builder)
    {
        this.paymentType = builder.paymentType;
        this.pharmacyBankDetails = builder.pharmacyBankDetails;
        this.paymentTotal = builder.paymentTotal;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public String getPharmacyBankDetails() {
        return pharmacyBankDetails;
    }

    public int getPaymentTotal() {
        return paymentTotal;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentType=" + paymentType +
                ", pharmacyBankDetails=" + pharmacyBankDetails +
                ", paymentTotal=" + paymentTotal +
                '}';
    }

    public static class Builder
    {

        private String paymentType, pharmacyBankDetails;
        private int paymentTotal;


        public Builder setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public Builder setPharmacyBankDetails(String pharmacyBankDetails)
        {
            this.pharmacyBankDetails = pharmacyBankDetails;
            return this;
        }

        public Builder setPaymentTotal(int paymentTotal)
        {
            this.paymentTotal = paymentTotal;
            return this;
        }
        public Builder copy(Payment Payment){
            this.paymentType = Payment.paymentType;
            this.pharmacyBankDetails = Payment.pharmacyBankDetails;
            this.paymentTotal = Payment.paymentTotal;

            return this;
        }

        public Payment builder()
        {
            return new Payment(this);
        }

    }
}
