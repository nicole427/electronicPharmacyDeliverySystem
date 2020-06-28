package epharmacy.digital.entity;

public class Catalogue {

    private String catName, catDescription;

    private Catalogue(Builder builder) {
        this.catName = builder.catName;
        this.catDescription = builder.catDescription;
    }

    @Override
    public String toString() {
        return "Catalogue{" +
                "catName='" + catName + '\'' +
                ", catDescription='" + catDescription + '\'' +
                '}';
    }

    public String getCatName() {
        return catName;
    }

    public String getCatDescription() {
        return catDescription;
    }

    public static class Builder {
        private String catName, catDescription;

        public Builder setCatName(String catName) {
            this.catName = catName;
            return this;
        }

        public Builder setCatDescription(String catDescription) {
            this.catDescription = catDescription;
            return this;
        }

        public Builder copy(Catalogue catalogue){
            this.catName = catalogue.catName;
            this.catDescription = catalogue.catDescription;
            return this;
        }

        public Catalogue build(){
            return new Catalogue(this);
        }

    }

}
