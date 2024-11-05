import java.util.ArrayList;

public class User {

    private String userName;
    private String email;
    private ArrayList<Media>  purchaseMediaList;
    private ArrayList<Media> shoppingCart;


    User(String userName , String email ){
        this.userName = userName;
        this.email = email;
        this.purchaseMediaList = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public void addToCart(Media media){
        shoppingCart.add(media);
    }

    public void removeFromCart(Media media){
        shoppingCart.remove(media);
    }



    // Check out and process purchase
    public void checkOut() {
        for (Media media : shoppingCart) {
            media.purchase(this);
        }
        shoppingCart.clear();  // Clear the cart after purchase
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public void setPurchaseMediaList(ArrayList<Media> purchaseMediaList) {
         checkOut();
         this.purchaseMediaList = shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart){
        this.shoppingCart=shoppingCart;
    }

    public ArrayList<Media> getShoppingCart(){
        return shoppingCart;
    }

    // Add media to purchased list
    public void addToPurchased(Media media) {
        purchaseMediaList.add(media);
    }

    @Override
    public String toString() {
        return "User: " + userName + "\nEmail: " + email;
    }


}
