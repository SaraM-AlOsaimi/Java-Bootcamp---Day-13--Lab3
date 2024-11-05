import java.util.MissingFormatArgumentException;

// Media is a superclass for all the three media types in the store ... book , movie , music

public class Media {

    private String title;
    private String auteur;
    private String ISBN ; // International Standard Book Number. It is a unique identifier for books.
    private double price;


//    Media(){
//
//    }

    Media(String title , String auteur , String ISBN , double price){
        this.title=title;
        this.auteur=auteur;
        this.ISBN=ISBN;
        this.price=price;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public String getAuteur() {
        return auteur;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public String getISBN() {
        return ISBN;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void purchase(User user) {
        user.addToPurchased(this);  // Add the movie to the user's purchased list
        System.out.println("Purchased movie: " + getTitle());
    }


    // getMediaType method return "media"
    public String getMediaType(){
        return "Media";
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuteur: " + auteur + "\nISBN: " + ISBN + "\nPrice: SAR " + price ;
    }


}
