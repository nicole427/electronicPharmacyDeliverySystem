package epharmacy.digital.entity;

public class Payment {
    private String paymentStatus;
    private String paymentType, pharmacyBankDetails;
    private int paymentTotal;

    private Payment(Builder builder)
    {
        this.paymentStatus = builder.paymentStatus;
        this.paymentType = builder.paymentType;
        this.pharmacyBankDetails = builder.pharmacyBankDetails;
        this.paymentTotal = builder.paymentTotal;
    }

    public String getPaymentStatus() {
        return paymentStatus;
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
                ", paymentStatus=" + paymentStatus +
                '}';
    }

    public static class Builder
    {
        private String paymentStatus;
        private String paymentType, pharmacyBankDetails;
        private int paymentTotal;
        
        public Builder setPaymentStatus(String paymentStatus){
        this.paymentStatus = paymentStatus;
            return this;
        }

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
        public Builder copy(Payment payment){
            this.paymentStatus = payment.paymentStatus;
            this.paymentType = payment.paymentType;
            this.pharmacyBankDetails = payment.pharmacyBankDetails;
            this.paymentTotal = payment.paymentTotal;

            return this;
        }

        public Payment builder()
        {
            return new Payment(this);
        }

    }
}
