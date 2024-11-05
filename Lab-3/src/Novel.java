public class Novel extends Book{

    private String genre;



    Novel(String title, String auteur, String ISBN, double price, int quantityInStock, String genre){
        super(title, auteur, ISBN, price, quantityInStock);
        this.genre = genre;
    }


    public void setGenre(String genre){
        this.genre=genre;
    }

    public String getGenre(){
        return genre;
    }
//


    // getMediaType(): return "Bestselling Novel" if Average Rating more than or equal 4.5, else return "Novel".

    public String getMediaType(){
        if(getAverageRating() >= 4.5){
            return "Bestselling Novel";
        } else return "Novel";
    }

    @Override
    public String toString() {
        return super.toString()  + "\nGenre: " + genre + "\n-------------";
    }
}
