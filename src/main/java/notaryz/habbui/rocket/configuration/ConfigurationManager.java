package notaryz.habbui.rocket.configuration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationManager {
    private Properties configini;
    public ConfigurationManager(String filePath) throws IOException {
        this.configini = new Properties();
        FileReader config_file = new FileReader(filePath);
        configini.load(config_file);
    }

    public String getValue(String key){
        return configini.getProperty("key");
    }

    public Integer getInteger(String key){
        return Integer.parseInt(configini.getProperty(key));
    }

}
