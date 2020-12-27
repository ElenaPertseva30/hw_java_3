import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class IoUtils {

    public static void main(String[] args) {
        String nameBook = "Book name";
        String file = "history" + nameBook + ".txt";

        for (int i = 0; i < 10; i++) {
            addWritingToHistoryBook(file, nameBook, "String" + i);

        }
    }

    private static void addWritingToHistoryBook(String file, String nameBook, String message ) {
        String text = message + "\n";
        try {
            writeStringToHistory(nameBook, text);
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }

    private static void writeStringToHistory(String nameBook, String text) throws IOException {
        BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nameBook, true), StandardCharsets.UTF_8));
        bufferWriter.write(text);
        bufferWriter.close();
    }
}




