import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Breaking Bad", Arrays.asList("Kevin", "Charbel"));
        System.out.println(document.toString());


        Document document2 = new Document("The Walking Dead", Arrays.asList("Aline", "Elie"));
        System.out.println(document2.toString());

    }
}
