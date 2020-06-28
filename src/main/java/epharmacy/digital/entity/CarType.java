package epharmacy.digital.entity;

public class CarType {
    private String carName;
    private String carModel;
    private CarType(Builder builder){
        this.carName = builder.carName;
        this.carModel = builder.carModel;
    }
    public String getCarName() {
        return carName;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "carName='" + carName + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }

    public static class Builder{
        private String carName;
        private String carModel;

        public Builder setCarName(String carName){
            this.carName = carName;
            return this;
        }

        public Builder setCarModel(String carModel){
            this.carModel = carModel;
            return this;
        }

        public Builder copy(CarType carType){
            this.carName = carType.carName;
            this.carModel= carType.carModel;
            return this;
        }

        public CarType builder(){
            return new CarType(this);
        }

    }
}
