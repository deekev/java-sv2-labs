package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperations {

    private Path path;

    public LongWord(Path path) {
        this.path = path;
    }

    @Override
    public String getLongWord() {
        List<String> parts = readFromFile(path);
        StringBuilder sb = new StringBuilder(parts.get(0));
        for (int i = 1; i < parts.size(); i ++) {
            sb.append(parts.get(i).substring(parts.get(i).length()-1));
        }
        return sb.toString();
    }
}