import java.io.File;

public class MyFile implements Searchable{

    private File file;

    @Override
    public boolean hasKeyword(String word) {
        return false;
    }
}
