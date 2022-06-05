import java.util.List;

public class Book extends Document {

    private int numberOfPages;

    public Book(String title, List<String> authors, int numberOfPages) {
        super(title, authors);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        String registrationNumber = "Registration Number : " + super.getRegistrationNumber() + "\n";
        String title = "title : " + super.getTitle() + "\n";
        String numberOfPages = "Number Of Pages : " + this.numberOfPages + "\n";
        String authors = "authors : " + super.getAuthors() + "\n";
        return "Book : \n" + registrationNumber + numberOfPages + title + authors;
    }

    //Getters And Setters-----------------------------
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    //------------------------------------------------
}
