import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {

        Document[] documents = {
                new Book("Gone Girl", Arrays.asList("David", "Lucas", "Jesse"), 200),
                new Book("You", Arrays.asList("Kevin", "Charbel"), 300),
                new Book("Harry Potter", Arrays.asList("JK Rowling"), 268),
                new Dictionary("English 1", Arrays.asList("Bryan", "Alan"), "english", 1),
                new Dictionary("Francais 3", Arrays.asList("Jean-Pierre", "Matteo"), "francais", 3)
        };

        DocumentList documentList = new DocumentList();

        for (int i = 0; i < documents.length; i++) {
            documentList.addDocument(documents[i]);
            documentList.addToFile(documents[i]);
        }

        System.out.println(documentList.allAuthors());
        System.out.println(documentList.allDocuments());


        try {
            searchWord(documentList);
        } catch (Exception e) {
            System.out.println("That was a blank title! Please input a valid title next time! :(");
        }

    }

    static void searchWord(DocumentList documentList) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a title : ");
        String title = s.nextLine();

        if (title == "")
            throw new Exception("Title is empty !");

        if (documentList.searchInFile(title))
            System.out.println(title + " is in the file! :)");
        else
            System.out.println(title + " is not in the file! :(");

        if (documentList.search(title))
            System.out.println(title + " is the title of one of the documents! :)");
        else
            System.out.println(title + " is not the title of one of the documents! :(");
    }
}
