package learn.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonFileReader {
    String filePath = "";

    public void setFilePath(String filePath) throws IOException {
        this.filePath = new String(Files.readAllBytes(Paths.get("./src/main/resources/" + filePath)));
    }


    public String getData(String key) {
        String[] data = filePath.split("\"" + key + "\"\\s*:\\s*\"");
        return data[1].split("\"")[0];
    }




}
