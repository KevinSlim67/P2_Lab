import java.util.ArrayList;
import java.util.List;

public class Document implements Searchable{

    private int registrationNumber;
    private String title;
    private List<String> authors;
    private static int countRN = 1;

    public Document(String title, List<String> authors) {
        registrationNumber = countRN++;
        this.title = title;
        this.authors = new ArrayList<String>(authors);
    }


    @Override
    public boolean hasKeyword(String word) {
        if (title.contains(word)) return true;
        return false;
    }

    public String toString() {
        String registrationNumber = "Registration Number : " + this.registrationNumber + "\n";
        String title = "title : " + this.title + "\n";
        String authors = "authors : " + this.authors + "\n";
        return "Document : \n" + registrationNumber + title + authors;
    }

    //Getters And Setters-----------------------------
    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
    //--------------------------------------------------
}
