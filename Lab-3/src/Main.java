import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("----Online Media Store----");

                // Create Users
                User user1 = new User("Sara", "sara@example.com");
                User user2 = new User("Fahd", "Fahd@example.com");
                User user3 = new User("Mohammed" , "mohammed@gmail.com");

         System.out.println("----------------");
                // testing getter
               System.out.println("User Name: "+ user1.getUserName());
               System.out.println("Email: " + user1.getEmail());

               System.out.println(user3.toString());


                // Create Media Items -- Books
                Book book1 = new Book("Thinking Fast and Slow", "Daniel Kahneman", "123689439", 68.99, 6);
                Book book2 = new Book("The Power Of regret", "Daniel H. Pink", "987654321", 49.50, 7);
                Book book3 = new Book("Atomic Habits" , "James Clear","1847941834",89.00,5);


                // Create Media Items -- Novels
                Novel novel1 = new Novel("The Murder on the Links ", "Agatha Christie", "6281072057589", 37.00, 10, "Crime novel");
                Novel novel2 = new Novel("My Sweet Orange Tree","Jose Mauro","8765431234",50.0,2,"autobiographical novel");

                // Create Media Items -- AcademicBooks
                AcademicBook academicBook1 = new AcademicBook("Effective Java", "Joshua Bloch", "345678901", 50.00, 2, "Computer Science");

                // Create Media Items -- Movies
                Movie movie1 = new Movie("Harry Potter and the Chamber of Secrets", "J.K.Rowling", "112233445", 33.90, 130);

                // Create Media Items -- Musics
                Music music1 = new Music("Five little Monkeys Jumping on the Bed", "Dr. Seuss", "556677889", 12.99, "The Laurie Berkner Band");


                // Create a list of media items
                List<Media> mediaCatalog = new ArrayList<>();
                mediaCatalog.add(book1);
                mediaCatalog.add(book2);
                mediaCatalog.add(book3);
                mediaCatalog.add(novel1);
                mediaCatalog.add(novel2);
                mediaCatalog.add(academicBook1);
                mediaCatalog.add(movie1);
                mediaCatalog.add(music1);

                // Create reviews for the books
                Review review1 = new Review("sara", 5, "Amazing book!");
                Review review2 = new Review("Fahd", 4, "Good, but could be better.");

                book1.addReview(review1);
                book1.addReview(review2);


                Review review3 = new Review("Sara", 4.8, "A must-read !");
                book3.addReview(review3);

                Review review4 = new Review("Mohammed", 3.5, "Great.");
                academicBook1.addReview(review4);

                // Create a store and add users and media
                Store store = new Store();

                store.addUser(user1);
                store.addUser(user2);
                store.addUser(user3);

                store.addMedia(book1);
                store.addMedia(book2);
                store.addMedia(book3);

                store.addMedia(novel1);
                store.addMedia(novel2);

                store.addMedia(academicBook1);

                store.addMedia(movie1);

                store.addMedia(music1);
        System.out.println("\n----------------");
                // Display all users and media in the store
                System.out.println("Users in the store:");
                store.displayUser();
        System.out.println("\n----------------");
                System.out.println("\nAvailable Media:");
                store.displayMedia();


                // Users add items to their cart
                user1.addToCart(book1);
                user1.addToCart(book3);
                user1.addToCart(movie1);

                user2.addToCart(music1);
                user2.addToCart(academicBook1);

                user3.addToCart(academicBook1);

        System.out.println("\n----------------");
                // Display the carts
                System.out.println("\nUser 1's cart: " + user1.getShoppingCart());
                System.out.println("\nUser 2's cart: " + user2.getShoppingCart());
                System.out.println("\nUser 3's cart: " + user3.getShoppingCart());

        System.out.println("\n----------------");
                // Checkout by user1
                user1.checkOut();
                System.out.println("\nUser 1 purchased items: " + user1.getPurchaseMediaList());

        System.out.println("\n----------------");
                // Restock a book and check if it's a bestseller
                book1.restock(5);
                System.out.println("\nIs Book1 a bestseller? " + book1.isBestSeller());

        System.out.println("\n----------------");
                // Display all media after the purchase
                System.out.println("\nAvailable Media after purchase:");
                store.displayMedia();
        System.out.println("\n----------------");
                // Movie recommendations based on the auteur
                System.out.println("\nMovie Recommendations based on 'J.K.Rowling':");
                movie1.recommendSimilarMovies(store.getMovies());
        System.out.println("\n----------------");
                // Music playlist generation based on artist
                System.out.println("\nMusic Playlist based on 'The Laurie Berkner Band':");
                music1.generatePlaylist(store.getMusicCatalog());
        System.out.println("\n----------------");
                // Display updated media list
                System.out.println("\nUpdated Media List:");
                store.displayMedia();

            }

}