public class Review {

    private String userName;
    private double rating;
    private String comment;

    Review(String userName , double rating , String comment){
        this.userName = userName;
        this.rating = rating;
        this.comment = comment;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }
    public void setComment(String comment){
        this.comment = comment;
    }

    public String getComment(){
        return comment;
    }

    public String toString() {
        return "Review by " + userName+ ": Rating = " + rating + ", Comment = " + comment;
    }



}
