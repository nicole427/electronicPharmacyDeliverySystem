package epharmacy.digital.entity;
// class package MedicalAid
public class MedicalAid {
        // adding assigning the attributes with their values
        private int userMedicalAidNumber;

        //userMedicalAid builder constructor
        private MedicalAid(Builder builder){
            this.userMedicalAidNumber = builder.userMedicalAidNumber;
        }
        //get methods for all the attributes

    public int getUserMedicalAidNumber() {
        return userMedicalAidNumber;
    }

    //to string to display all the attributes

    @Override
    public String toString() {
        return "MedicalAid{" +
                "userMedicalAidNumber=" + userMedicalAidNumber +
                '}';
    }

    //builder pattern class for the setters of the attributes
        public static class Builder{
            private int userMedicalAidNumber;


            public Builder setUserMedicalAidNumber(int userMedicalAidNumber){
                this.userMedicalAidNumber=userMedicalAidNumber;
                return this;
            }

            //copy method of the builder in order to create new userContactDetail
            public Builder copy (MedicalAid medicalAid){
                this.userMedicalAidNumber = medicalAid.userMedicalAidNumber;
                return this;
            }
            // creating an instance for the builder pattern
            public MedicalAid builder(){

                return new MedicalAid(this);
            }
        }
    }


