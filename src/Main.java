import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Magazine magazine1 = new Magazine("SimpleMagazine", 24);
        Magazine magazine2 = new Magazine("BestMagazine", 36);
        Book book1 = new Book("Hardcover", "Ready Player One", 460);
        Book book2 = new Book("Paperback", "Ready Player Two", 355);


        Printable[] printables = new Printable[] {magazine1, magazine2, book1, book2};

        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                Magazine.printMagazines(((Magazine) printable).getName());
            } else {
                Book.printBook(((Book) printable).getName());
            }
        }


    }




}
