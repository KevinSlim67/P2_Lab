import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        DocumentList documentList = new DocumentList();
        Document doc = new Document("Hello", Arrays.asList("Kevin", "Charbel"));
        Document doc2 = new Document("World", Arrays.asList("Matteo", "Alan"));
        documentList.addDocument(doc);
        documentList.addDocument(doc2);

        System.out.println(documentList.searchInFile("Helo"));

    }
}
