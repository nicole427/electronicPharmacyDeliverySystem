package epharmacy.digital.entity;

public class UserProfile {
    // all the attributes of entity
    private int userId;
    private String userName, userSurname;

    // builder pattern method constructor
    private UserProfile(Builder builder){
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.userSurname = builder.userSurname;
    }
    // getters for all attributes of entity UserProfile
    public int getUserId() {

        return userId;
    }

    public String getUserName() {

        return userName;
    }

    public String getUserSurname() {

        return userSurname;
    }
    // to string to display what is in the class
    @Override
    public String toString() {
        return "UserProfile{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                '}';
    }
    // add setters using builder pattern
    public static class Builder{

        private int userId;
        private String userName, userSurname;

        public Builder setUserId(int userId){
            this.userId = userId;
            return this;
        }
        public Builder setUserName(String userName){
            this.userName= userName;
            return this;
        }
        public Builder setUserSurname(String userSurname){
            this.userSurname = userSurname;
            return this;
        }
        //to below method is to make another copy of userProfile
        public Builder copy (UserProfile userProfile){
            this.userId = userProfile.userId;
            this.userName = userProfile.userName;
            this.userSurname = userProfile.userSurname;
            return this;
        }
        // creating an instance for the builder pattern
        public UserProfile builder(){

            return new UserProfile(this);
        }
    }
}