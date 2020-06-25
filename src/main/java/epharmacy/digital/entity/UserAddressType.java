package epharmacy.digital.entity;

public class UserAddressType {
    //assigning attributes with their values
    private String primaryAddress;
    private String secondaryAddress;
    private String tertiaryAddress;

    // constructor for builder class
    private UserAddressType(Builder builder) {
        this.primaryAddress = builder.primaryAddress;
        this.secondaryAddress = builder.secondaryAddress;
        this.tertiaryAddress = builder.tertiaryAddress;
    }
    //getters for all the attributes
    public String getPrimaryAddress() {
        return primaryAddress;
    }

    public String getSecondaryAddress() {
        return secondaryAddress;
    }

    public String getTertiaryAddress() {
        return tertiaryAddress;
    }
    // to string method to display all the attributes
    @Override
    public String toString() {
        return "UserAddressType{" +
                "primaryAddress='" + primaryAddress + '\'' +
                ", secondaryAddress='" + secondaryAddress + '\'' +
                ", tertiaryAddress='" + tertiaryAddress + '\'' +
                '}';
    }
    // builder pattern class for the attribute setters
    public static class Builder{
        private String primaryAddress;
        private String secondaryAddress;
        private String tertiaryAddress;

        public Builder setPrimaryAddress(String primaryAddress){
            this.primaryAddress = primaryAddress;
            return this;
        }
        public Builder setSecondaryAddress(String secondaryAddress){
            this.secondaryAddress = secondaryAddress;
            return this;
        }
        public Builder setTertiaryAddress(String tertiaryAddress){
            this.tertiaryAddress = tertiaryAddress;
            return this;
        }
        //builder copy method to make new user address type
        public Builder copy(UserAddressType userAddressType){
            this.primaryAddress= userAddressType.primaryAddress;
            this.secondaryAddress = userAddressType.secondaryAddress;
            this.tertiaryAddress = userAddressType.tertiaryAddress;
            return this;
        }
        //creating an instance of the class
        public UserAddressType Builder(){
            return new UserAddressType(this);
        }
    }
}
