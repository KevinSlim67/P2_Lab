import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

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
        try {
            Scanner s = new Scanner(file);
            int lineNum = 0;

            while (s.hasNextLine()) {
                String line = s.nextLine();
                lineNum++;
                if(line.contains(word)) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        return false;
    }
}
