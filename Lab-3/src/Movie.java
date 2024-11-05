import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{

    private int duration;


    Movie(String title , String auteur , String ISBN , double price,int duration){
        super(title, auteur,ISBN , price);
        this.duration= duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public int getDuration(){
        return duration;
    }

    public void watch(User user){
      user.addToCart(this);
    }

    public void recommendSimilarMovies(List<Movie> movieCatalog) {
        for (Movie movie : movieCatalog) {
            if (movie.getAuteur().equals(this.getAuteur())) {
                System.out.println("Recommended movie: " + movie.getTitle());
            }
        }
    }

    // . getMediaType(): return "Long Movie" if duration more than or equal 120, else return "Movie"

    public String getMediaType(){
        if(duration >= 120){
            return "Long Movie";
        }else return "Movie";
    }

    @Override
    public String toString() {
        return super.toString() + "\nDuration: " + duration + " minutes" + "\n-------------";
    }


}
