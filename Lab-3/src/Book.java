import java.util.ArrayList;

public class Book extends Media {

    private int quantityInStock;
    private ArrayList<Review> reviews;


    Book(String title, String auteur, String ISBN, double price, int quantityInStock) {
        super(title, auteur, ISBN, price);
        this.reviews = new ArrayList<>();
        this.quantityInStock = quantityInStock;

    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }



    public void addReview(Review review) {
        reviews.add(review);
    }


    public double getAverageRating() {
        double totalRating = 0;
     for (Review review : reviews){
         totalRating += review.getRating();
     }
     return reviews.isEmpty() ? 0 : totalRating / reviews.size();
}



    public boolean isBestSeller(){
        return getAverageRating() >= 4.5;
    }

    public void purchase(User user) {
        // Check if there is stock available
        if (quantityInStock > 0) {
            // Reduce stock by 1 and add the book to the user's purchased list
            quantityInStock--;
            user.addToPurchased(this);  // Add the book to the user's purchase list
        } else {
            System.out.println("Out of stock :(");
        }
    }

    public void restock(int quantity){
        quantityInStock += quantity;
        System.out.println("Restocked " + quantity + " units of " + getTitle());
    }

    public String getMediaType(){
        return isBestSeller() ? "Bestselling Book" : "Book";
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantity in Stock:  " + quantityInStock + "\nAverage Rating: " + getAverageRating() + "\n-------------";

    }

}
