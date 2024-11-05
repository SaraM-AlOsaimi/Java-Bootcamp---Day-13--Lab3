import java.util.List;

public class Music extends Media{

 private String  artist ;



 Music(String title , String auteur , String ISBN , double price,String artist){
    super(title,auteur,ISBN,price);
    this.artist =artist;
 }

 public void setArtist(String artist){
    this.artist=artist;
 }
 public String getArtist(){
    return artist;
 }

    // listen(User user): Allows users to listen to music.
    // generatePlaylist(List<Music> musicCatalog): Generates a playlist of similar songs based on the artist (auteur).

    public void listen(User user){
    user.addToCart(this);
    }

    public void  generatePlaylist(List<Music> musicCatalog) {
        for (Music music : musicCatalog) {
            if (music.getAuteur().equals(this.getAuteur())) {
                System.out.println("Similar music: " + music.getTitle());
            }
        }
    }

    public void purchase(User user) {
        user.addToPurchased(this);  // Add the music to the user's purchased list
        System.out.println("Purchased music: " + getTitle());
    }


//    getMediaType(): return "Premium Music" if the price more than
//    or equel 10, else return "Music".

    public String getMediaType(){
    if(getPrice() >= 10){
        return "Premium Music";
    } else return "Music";
    }

    @Override
    public String toString() {
        return super.toString() + "\nArtist: " + artist + "\n-------------";
    }





}
