package learn.data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonFileReader {
    String filePath;

    public JsonFileReader(String filePath) {
        System.out.println("I'm the constructor");
        this.filePath = filePath;
    }


    public String getData(String key) throws IOException {
        String file = new String(Files.readAllBytes(Paths.get(filePath)));
        String[] data = file.split("\"" + key + "\"\\s*:\\s*\"");
        return data[1].split("\"")[0];
    }




}
