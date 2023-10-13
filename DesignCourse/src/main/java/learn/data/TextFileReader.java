package learn.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFileReader {
    // Create a BufferedReader object from the text file
    BufferedReader filePath;

    public void setFilePath(String filePath) throws IOException {
        this.filePath = new BufferedReader(new FileReader("./src/main/resources/" + filePath));
    }
    public String getData(String key) throws IOException {


        // Read the lines of the text file
        String line;
        String extractedText = "";
        while ((line = filePath.readLine()) != null) {
            // Search for the specific text in each line
            if (line.contains(key)) {
                // Extract the text using the String.substring() method
                return extractedText = line.substring(line.indexOf(key));
            }
        }
        // Close the reader
        filePath.close();
        return extractedText;

    }


}
