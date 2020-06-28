package epharmacy.digital.entity;

public class CatType {

    private String catType, typeDescription;

    private CatType(Builder builder) {
        this.catType = builder.catType;
        this.typeDescription = builder.typeDescription;
    }

    @Override
    public String toString() {
        return "CatType{" +
                "catType='" + catType + '\'' +
                ", typeDescription='" + typeDescription + '\'' +
                '}';
    }

    public String getCatType() {
        return catType;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public static class Builder {
        private String catType, typeDescription;

        public CatType.Builder setCatName(String catType) {
            this.catType = catType;
            return this;
        }

        public CatType.Builder setCatDescription(String typeDescription) {
            this.typeDescription = typeDescription;
            return this;
        }

        public CatType.Builder copy(CatType cattype){
            this.catType = cattype.catType;
            this.typeDescription = cattype.typeDescription;
            return this;
        }

        public CatType build(){
            return new CatType(this);
        }

    }
}
