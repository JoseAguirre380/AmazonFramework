package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
    public ReadProperties(){

    }
    static Properties properties = new Properties();

    public static String getProperty(String property){
        InputStream entry = null;
        try{
            entry = new FileInputStream("./src/test/java/resources/application.properties");
            properties.load(entry);

        }catch (IOException e){
            e.printStackTrace();
        }
        return properties.getProperty(property);
    }
}
