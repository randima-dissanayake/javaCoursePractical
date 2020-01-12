import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class LettersToCapital extends FileReader {
    LettersToCapital(File file) throws IOException {
        super(file);
    }
	@Override
    public int read() throws IOException {
        int value = super.read();

        if (value >= 97 && value <= 122) {
            value -= 32;
        }
        return value;
    }
}