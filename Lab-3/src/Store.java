
import java.util.ArrayList;
import java.util.List;

public class Store {

    private ArrayList<Media> mediaArrayList;
    private ArrayList<User> userArrayList;


    Store(){
        this.mediaArrayList = new ArrayList<>();
        this.userArrayList = new ArrayList<>();
    }
    public ArrayList<Media> getMediaList() {
        return mediaArrayList;
    }

    public ArrayList<User> getUserList() {
        return userArrayList;
    }

    public void addUser(User user){
      userArrayList.add(user);
    }

    public void displayUser(){
       for (User u : userArrayList){
           System.out.println(u);
       }
    }

    public void addMedia(Media media){
        mediaArrayList.add(media);
    }

    public void displayMedia(){
        for (Media m : mediaArrayList){
            System.out.println(m);
        }
    }

    public Media SearchBook(String title) {
        for (Media media : mediaArrayList) {
            if (media instanceof Book && media.getTitle().equals(title)) {
                return media;
            }
        }
            return null;
        }

    // Method to get all movies in the store
    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        for (Media media : mediaArrayList) {
            if (media instanceof Movie) {
                movies.add((Movie) media);
            }
        }
        return movies;
    }

    // Optional: You can also add a similar method for Music if needed
    public List<Music> getMusicCatalog() {
        List<Music> musicList = new ArrayList<>();
        for (Media media : mediaArrayList) {
            if (media instanceof Music) {
                musicList.add((Music) media);  // Cast the Media object to Music
            }
        }
        return musicList;
    }


}
