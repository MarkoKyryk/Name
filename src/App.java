import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Type the title: ");
            String title = scanner.nextLine();
            System.out.println("Type number of pages: ");
            String pages = scanner.nextLine();
            System.out.println("Type the year of publication: ");
            String publicationYear = scanner.nextLine();
            if (title.isEmpty() || pages.isEmpty() || publicationYear.isEmpty()) {
                break;
            }
            books.add(new Book(title, pages, publicationYear));
        }
        System.out.println("What information will be printed?: ");
        String infoType = scanner.nextLine();
        for (Book book : books) {
            if (infoType.equals("title")) {
                System.out.println(book.getTitle());
            } else {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Pages: " + book.getPages());
                System.out.println("Year of publication: " + book.getPublicationYear());
            }
        }
    }
}

// concatenate