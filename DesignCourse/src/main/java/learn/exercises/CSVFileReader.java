package learn.exercises;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVFileReader {

    CSVReader filePath;

    public void setFilePath(String filePath) throws IOException {
        // Create a CSVReader object from the CSV file
        this.filePath = new CSVReaderBuilder(new FileReader("./src/main/resources/" + filePath)).withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
    }

    public String getData(int rowNum, int colNum) throws IOException, CsvException {
        // Read the lines of the CSV file
        List<String[]> records = filePath.readAll();
        // Close the reader
        filePath.close();
        // Do something with the cell value
        return records.get(rowNum)[colNum];
    }

}