package epharmacy.digital.entity;

public class PharmacyBankAccountDetails {
    private String bankName;
    private int accountNumber;
    private int branchCode;
    private String beneficiaryReference;

    // builder pattern method constructor
    private PharmacyBankAccountDetails(Builder builder)
    {
        this.bankName = builder.bankName;
        this.accountNumber = builder.accountNumber;
        this.branchCode = builder.branchCode;
        this.beneficiaryReference = builder.beneficiaryReference;
    }

    // getters for all attributes of entity PharmacyBankAccount
    public String getBankName() {
        return bankName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBranchCode() {
        return branchCode;
    }

    public String getBeneficiaryReference() {
        return beneficiaryReference;
    }

    // to string method for PharmacyBankAccount entity
    @Override
    public String toString() {
        return "PharmacyBankAccountDetails{" +
                "bankName='" + bankName + '\'' +
                ", accountNumber=" + accountNumber +
                ", branchCode=" + branchCode +
                ", beneficiaryReference='" + beneficiaryReference + '\'' +
                '}';
    }

    // add setters using building pattern
    public static class Builder
    {
        private String bankName;
        private int accountNumber;
        private int branchCode;
        private String beneficiaryReference;

        public Builder setBankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        public Builder setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder setBranchCode(int branchCode) {
            this.branchCode = branchCode;
            return this;
        }

        public Builder setBeneficiaryReference(String beneficiaryReference) {
            this.beneficiaryReference = beneficiaryReference;
            return this;
        }

        // Copy method for PharmacyBankAccount entity
        public Builder copy (PharmacyBankAccountDetails pharmacyBankAccountDetails)
        {
            this.bankName = pharmacyBankAccountDetails.bankName;
            this.accountNumber = pharmacyBankAccountDetails.accountNumber;
            this.branchCode = pharmacyBankAccountDetails.branchCode;
            this.beneficiaryReference = pharmacyBankAccountDetails.beneficiaryReference;
            return this;
        }
        // Instance for Builder Pattern
        public PharmacyBankAccountDetails builder()
        {
            return new PharmacyBankAccountDetails(this);
        }
    }
}
