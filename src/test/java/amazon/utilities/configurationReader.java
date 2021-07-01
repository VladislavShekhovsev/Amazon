package amazon.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configurationReader {

    private static Properties properties = new Properties();

    static {

        try {
            //#2 load the file into FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");
            //#4- Load this properties object with the file(configuration.properties)
            properties.load(file);
        } catch (IOException e) {
            System.out.println("File not found in Configuration properties.");
        }

    }

    //USE THE ABOVE CREATE LOGIC TO CREATE A RE_USABLE STATIC METHOD
    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }
}