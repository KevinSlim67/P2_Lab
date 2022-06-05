import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class DocumentList {
    private List<Document> documents;
    private MyFile myFile;

    public DocumentList() {
        myFile = new MyFile("titles.txt");
        documents = new ArrayList<Document>();
    }

    public void addDocument(Document d) {
        documents.add(d);
    }

    public List<String> allAuthors() {
        List<String> authors = new ArrayList<String>();

        //loops over every document, get its authors, and add it to the authors list
        for (int i = 0; i < documents.size(); i++) {
            authors.addAll(documents.get(i).getAuthors());
        }

        return authors;
    }

    public List<String> allDocuments() {
        List<String> documentInfo = new ArrayList<String>();
        for (int i = 0; i < documents.size(); i++) {
            documentInfo.add(documents.get(i).toString());
        }
        return documentInfo;
    }

    public boolean addToFile(Document d) {
        try {
            myFile.add(d.getTitle());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void deleteAllFromFile() {
        myFile.deleteAll();
    }

    public boolean search(String word) {
        for (int i = 0; i < documents.size(); i++) {
            if (documents.get(i).hasKeyword(word)) return true;
        }
        return false;
    }

    public boolean searchInFile(String word) {
        return myFile.hasKeyword(word);
    }

}
