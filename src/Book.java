
public class Book {
    private String title;
    private String pages;
    private String publicationYear;

    public Book(String title, String pages, String publicatioYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicatioYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPages() {
        return this.pages;
    }

    public String getPublicationYear() {
        return this.publicationYear;
    }
}
