package notaryz.habbui.rocket.configuration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationManager {

    public ConfigurationManager(String filePath) throws IOException {
        Properties props = new Properties();
        FileReader config_file = new FileReader(filePath);
        props.load(config_file);
    }
}
