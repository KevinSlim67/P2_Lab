import java.util.List;

public class Dictionary extends Document{

    private String language;
    private int volumeNumber;

    public Dictionary(String title, List<String> authors, String language, int volumeNumber) {
        super(title, authors);
        this.language = language;
        this.volumeNumber = volumeNumber;
    }

    @Override
    public String toString() {
        String registrationNumber = "Registration Number : " + super.getRegistrationNumber() + "\n";
        String title = "title : " + super.getTitle() + "\n";
        String language = "language : " + this.language + "\n";
        String volumeNumber = "volumeNumber : " + this.volumeNumber + "\n";
        String authors = "authors : " + super.getAuthors() + "\n";
        return "Dictionary : \n" + registrationNumber + title + language + volumeNumber + authors;
    }

    //Getters And Setters-----------------------------
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getVolumeNumber() {
        return volumeNumber;
    }

    public void setVolumeNumber(int volumeNumber) {
        this.volumeNumber = volumeNumber;
    }
    //------------------------------------------------
}
