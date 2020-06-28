package epharmacy.digital.entity;
// class package MedicalAid
public class MedicalAid {
    // adding assigning the attributes with their values
    private int userMedicalAidNumber;
    private String medicalAidName;
    private String medicalScheme;

    //userMedicalAid builder constructor
    private MedicalAid(Builder builder){
        this.userMedicalAidNumber = builder.userMedicalAidNumber;
        this.medicalAidName = builder.medicalAidName;
        this.medicalScheme = builder.medicalScheme;

    }
    //get methods for all the attributes

    public int getUserMedicalAidNumber() {
        return userMedicalAidNumber;
    }

    public String getMedicalAidName() {
        return medicalAidName;
    }

    public String getMedicalScheme() {
        return medicalScheme;
    }


    //to string to display all the attributes


    @Override
    public String toString() {
        return "MedicalAid{" +
                "userMedicalAidNumber=" + userMedicalAidNumber +
                ", medicalAidName='" + medicalAidName + '\'' +
                ", medicalScheme='" + medicalScheme + '\'' +
                '}';
    }

    //builder pattern class for the setters of the attributes
    public static class Builder{
        private int userMedicalAidNumber;
        private String medicalAidName;
        private String medicalScheme;


        public Builder setUserMedicalAidNumber(int userMedicalAidNumber){
            this.userMedicalAidNumber=userMedicalAidNumber;
            return this;
        }
        public Builder setMedicalAidName(String medicalAidName){
            this.medicalAidName= medicalAidName;
            return this;
        }
        public Builder setMedicalScheme(String medicalScheme){
            this.medicalScheme=medicalScheme;
            return this;
        }

        //copy method of the builder in order to create new userContactDetail
        public Builder copy (MedicalAid medicalAid){
            this.userMedicalAidNumber = medicalAid.userMedicalAidNumber;
            this.medicalAidName = medicalAid.medicalAidName;
            this.medicalScheme = medicalAid.medicalScheme;
            return this;
        }
        // creating an instance for the builder pattern
        public MedicalAid builder(){

            return new MedicalAid(this);
        }
    }
}

