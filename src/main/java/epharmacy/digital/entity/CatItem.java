package epharmacy.digital.entity;

public class CatItem {

    private String itemType;

    public CatItem(Builder builder) {
        this.itemType = builder.itemType;
    }

    @Override
    public String toString() {
        return "CatItem{" +
                "itemType='" + itemType + '\'' +
                '}';
    }


    public String getItemType() {
        return itemType;
    }

    public static class Builder {
        private String itemType;

        public CatItem.Builder setCatName(String itemType) {
            this.itemType = itemType;
            return this;
        }

        public CatItem.Builder copy(CatItem catitem){
            this.itemType = catitem.itemType;
            return this;
        }

        public CatItem build(){
            return new CatItem(this);
        }

    }


}
