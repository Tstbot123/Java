package unitModels;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ModelConfig {
    private Properties properties;

    public ModelConfig(String propertiesFilePath) {
        properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(propertiesFilePath)) {
            if (input == null) {
                System.out.println("Sorry, unable to find " + propertiesFilePath);
                return;
            }
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getModelPath(String key) {
        return properties.getProperty(key);
    }
}

