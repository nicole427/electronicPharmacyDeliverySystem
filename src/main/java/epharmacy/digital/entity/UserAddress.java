package epharmacy.digital.entity;

public class UserAddress {
    //assigning all the attributes with their values
    private String streetName;
    private int streetNumber;
    private int areaCode;
    private String areaName;
    //constructor method for builder class
    private UserAddress(Builder builder){
        this.streetName = builder.streetName;
        this.streetNumber = builder.streetNumber;
        this.areaCode = builder.areaCode;
        this.areaName = builder.areaName;
    }
    //getters for all the attributes
    public String getStreetName() {
        return streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public String getAreaName() {
        return areaName;
    }
    // to string to show all the attributes
    @Override
    public String toString() {
        return "UserAddress{" +
                "streetName='" + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                ", areaCode=" + areaCode +
                ", areaName='" + areaName + '\'' +
                '}';
    }
    //builder pattern class
    public static class Builder{
        private String streetName;
        private int streetNumber;
        private int areaCode;
        private String areaName;
        //setters using builder pattern
        public Builder setStreetName(String streetName){
            this.streetName = streetName;
            return this;
        }
        public Builder setStreetNumber(int streetNumber){
            this.streetNumber = streetNumber;
            return this;
        }
        public Builder setAreaCode(int areaCode){
            this.areaCode = areaCode;
            return this;
        }
        public Builder setAreaName(String areaName){
            this.areaName = areaName;
            return this;
        }
        //copy method from builder class
        public Builder copy(UserAddress userAddress){
            this.streetName = userAddress.streetName;
            this.streetNumber = userAddress.streetNumber;
            this.areaCode = userAddress.areaCode;
            this.areaName = userAddress.areaName;
            return this;
        }
        //creating an instance of builder class
        public UserAddress builder(){
            return new UserAddress(this);

        }
    }
}
