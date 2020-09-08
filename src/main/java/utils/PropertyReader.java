package utils;

import java.io.*;
import java.util.Properties;

public class PropertyReader {
    public static Properties prop = null;
    public FileInputStream fileInput = null;

    public PropertyReader() throws FileNotFoundException {

        try {
            fileInput = new FileInputStream(new File("src/config.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        prop = new Properties();
        try {
            prop.load(fileInput);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public  String getApplicationUrl(){
        return prop.getProperty("url");
    }
}