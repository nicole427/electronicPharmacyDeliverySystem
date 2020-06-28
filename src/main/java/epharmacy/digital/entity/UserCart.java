package epharmacy.digital.entity;

public class UserCart {

    //attributes
    private int userID,itemNumber, itmQty;
    private String itemName, userNotes;

    public UserCart(Builder builder) {
        this.itemNumber = builder.itemNumber;
        this.itemName = builder.itemName;
        this.itmQty = builder.itmQty;
        this.userNotes = builder.userNotes;
        this.userID = builder.userID;
    }

    //Accessors
    public int getUserID() {
        return userID;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public int getItmQty() {
        return itmQty;
    }

    public String getItemName() {
        return itemName;
    }

    public String getUserNotes() {
        return userNotes;
    }

    @Override
    public String toString() {
        return "userCart{" +
                "userID=" + userID +
                ", itemNumber=" + itemNumber +
                ", itmQty=" + itmQty +
                ", itemName='" + itemName + '\'' +
                ", userNotes='" + userNotes + '\'' +
                '}';
    }

    //
    public static class Builder{
        private int userID,itemNumber, itmQty;
        private String itemName, userNotes;
        
       public Builder setUserID (int userID) {
           this.userID = userID;
           return this;
       }

       public Builder setItemNumber (int itemNumber) {
           this.itemNumber = itemNumber;
           return this;
       }
       public Builder setItemQty (int itmQty) {
           this.itmQty =itmQty;
           return this;

       }
       public Builder setItemName (String itemName) {
           this.itemName = itemName;
           return this;
       }
       public Builder setUserNotes( String userNotes) {
           this.userNotes = userNotes;
           return this;

       }

       //copy method
       public UserCart.Builder copy (UserCart userCart){
           this.userID = userID;
           this.userNotes = userNotes;
           this.itemName = itemName;
           this.itemNumber = itemNumber;
           this.itmQty =itmQty;
           return this;
       }
        public UserCart builder(){
            return new UserCart(this);

        }
    }
}
