package epharmacy.digital.entity;
// class package UserContactDetail
public class UserContactDetail {
    private int cellPhoneNumber;
    private int homePhone;
    //userContactDetail builder constructor
    private UserContactDetail(Builder builder){
        this.cellPhoneNumber = builder.cellPhoneNumber;
        this.homePhone = builder.homePhone;
    }
    //get methods for all the attributes
    public int getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public int getHomePhone() {
        return homePhone;
    }
    //to string to display all the attributes
    @Override
    public String toString() {
        return "UserContactDetail{" +
                "cellPhoneNumber=" + cellPhoneNumber +
                ", homePhone=" + homePhone +
                '}';
    }
    //builder pattern class for the setters of the attributes
    public static class Builder{
        private int cellPhoneNumber;
        private int homePhone;

        public Builder setCellPhoneNumber(int cellPhoneNumber){
            this.cellPhoneNumber=cellPhoneNumber;
            return this;
        }
        public Builder setHomePhone(int homePhone){
            this.homePhone=homePhone;
            return this;
        }
        //copy method of the builder in order to create new userContactDetail
        public Builder copy (UserContactDetail userContactDetail){
            this.cellPhoneNumber = userContactDetail.cellPhoneNumber;
            this.homePhone = userContactDetail.homePhone;
            return this;
        }
        // creating an instance for the builder pattern
        public UserContactDetail builder(){

            return new UserContactDetail(this);
        }
    }
}
