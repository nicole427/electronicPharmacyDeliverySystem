package epharmacy.digital.entity;

public class PrescriptionItem {
    private int prescriptionNumber;
    private String prescriptionType;
    private String prescribingDoctor;

    private PrescriptionItem(Builder builder){
        this.prescriptionNumber = builder.prescriptionNumber;
        this.prescriptionType = builder.prescriptionType;
        this.prescribingDoctor = builder.prescribingDoctor;
    }
    public int getPrescriptionNumber() {
        return prescriptionNumber;
    }

    public String getPrescriptionType() {
        return prescriptionType;
    }

    public String getPrescribingDoctor() {
        return prescribingDoctor;
    }

    @Override
    public String toString() {
        return "PrescriptionItem{" +
                "prescriptionNumber=" + prescriptionNumber +
                ", prescriptionType='" + prescriptionType + '\'' +
                ", prescribingDoctor='" + prescribingDoctor + '\'' +
                '}';
    }
    public static class Builder{
        private int prescriptionNumber;
        private String prescriptionType;
        private String prescribingDoctor;

        public Builder setPrescriptionNumber(int prescriptionNumber){
            this.prescriptionNumber= prescriptionNumber;
            return this;
        }
        public Builder setPrescriptionType(String prescriptionType){
            this.prescriptionType= prescriptionType;
            return this;
        }
        public Builder setPrescribingDoctor(String prescribingDoctor){
            this.prescribingDoctor= prescribingDoctor;
            return this;

        }


        public Builder copy(PrescriptionItem prescriptionItem){
            this.prescriptionNumber = prescriptionItem.prescriptionNumber;
            this.prescriptionType = prescriptionItem.prescriptionType;
            this.prescribingDoctor= prescriptionItem.prescribingDoctor;
            return this;
        }
        public PrescriptionItem builder(){
            return new PrescriptionItem(this);
        }
    }
}

