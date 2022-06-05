import java.io.File;
import java.io.FileWriter;

public class MyFile implements Searchable {

    private File file;

    public MyFile(String fileName) {
        try {
            file = new File(fileName);
            if (!file.exists()) file.createNewFile();
        } catch (Exception e) {
            System.out.println("Sorry, we were not able to create the file!");
        }
    }

    public boolean add(String word) {
        FileWriter fw;

        try {
            fw = new FileWriter(file, true);
            fw.write(word + "\r\n");
            fw.close();
            System.out.println("String successfully added to file");
            return true;

        } catch (Exception e) {
            System.out.println("Sorry, we could not append to file");
        }

        return false;
    }

    public boolean deleteAll() {
        FileWriter fw;

        try {
            fw = new FileWriter(file, false);
            fw.close();
            System.out.println("Successfully deleted all data from file!");
            return true;

        } catch (Exception e) {
            System.out.println("Sorry, could not delete data");
        }

        return false;
    }

    @Override
    public boolean hasKeyword(String word) {
        return false;
    }
}
