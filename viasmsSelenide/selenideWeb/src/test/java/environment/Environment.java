package environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Environment {
    Properties prop = new Properties();

    public String getBrowser() throws IOException {
        File file = new File("src/main/resources/test.properties");
        FileInputStream fis = new FileInputStream(file.getAbsolutePath());
        // create Properties class object to access properties file
        Properties prop = new Properties();
        prop.load(fis);
        // get the property value and print it out
        //issue with maven
        return prop.getProperty("browser");
    }

    public String getUrl() throws IOException {
        File file = new File("src/main/resources/test.properties");
        FileInputStream fis = new FileInputStream(file.getAbsolutePath());
        // create Properties class object to access properties file
        Properties prop = new Properties();
        prop.load(fis);
        // get the property value and print it out
        return prop.getProperty("url");
    }
}
