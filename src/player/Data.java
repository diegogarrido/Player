package player;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Properties;

public class Data {

    public void saveData(String lastDir) {
        Properties prop = new Properties();
        try (OutputStream output = new FileOutputStream("config.properties")) {
            
            prop.setProperty("lastDir", lastDir);
            
            prop.store(output, null);
        } catch (Exception io) {
        }
    }
    
    public String[] loadData(){
        String[] props = new String[1];
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream("config.properties")) {
            prop.load(input);
            props[0]=prop.getProperty("lastDir");
        } catch (Exception io) {
        }
        return props;
    }
}
