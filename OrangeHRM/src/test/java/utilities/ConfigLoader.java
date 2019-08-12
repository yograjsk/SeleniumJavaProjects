package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private Properties prop;

    protected String browser;
    protected int elementWaitTimeOut;

    public ConfigLoader() throws IOException {
        prop = new Properties();
        prop.load(new FileInputStream(new File("/src/main/resources/propFiles/config.properties")));
    }

    public int getElementWaitTimeOut() {
        return elementWaitTimeOut = Integer.parseInt(prop.getProperty("elementWaitTimeOut","30"));
    }

    public void setElementWaitTimeOut(int elementWaitTimeOut) {
        this.elementWaitTimeOut = elementWaitTimeOut;
    }

    public String getBrowser() {
        return browser = prop.getProperty("browser","chrome");
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }


}
