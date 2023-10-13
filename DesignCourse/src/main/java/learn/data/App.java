package learn.data;

import com.opencsv.exceptions.CsvException;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, CsvException {

        JsonFileReader jsonFileReader = new JsonFileReader("./src/main/resources/jsonData.json");
        System.out.println("Type: " + jsonFileReader.getData("Type"));
        System.out.println("Speed: " + jsonFileReader.getData("Speed"));
        System.out.println("Color: " + jsonFileReader.getData("Color"));


        TextFileReader textFileReader = new TextFileReader();
        textFileReader.setFilePath("textData.txt");
        System.out.println(textFileReader.getData("dummy"));

        ExcelFileReader excelFileReader = new ExcelFileReader();
        System.out.println(excelFileReader.getData(1, 0));

        CSVFileReader csvFileReader = new CSVFileReader();
        csvFileReader.setFilePath("csvData.csv");
        System.out.println(csvFileReader.getData(1,1));

    }
}
