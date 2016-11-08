/*
* *********************************************
* This code is originally created by the author
* *********************************************
* *********************************************
 */

package klasses;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;
/** 
 * Nov 9, 2016
 * Originally created with limited distribution
 * @author "arissetyawan"<arissetyawan.campus@gmail.com>
 */
public class PropertyReader { 
    private Properties prop = new Properties();
    protected String result = "";
    protected String filename = "";
    InputStream inputStream;

    public PropertyReader(String filename)
    {
        this.filename = filename;
    }

    public Object get(String key)
    {
        Object val = this.prop.getProperty(key);
        Console.log(val.toString());
        return val;
    }

    public Properties ReadPropValues() throws IOException {

        try {
            Properties prop = new Properties();
            String propFileName = this.filename;

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                    prop.load(inputStream);
            } else {
                    throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
            return prop;

        } catch (Exception e) {
                System.out.println("Exception: " + e);
        } finally {
                inputStream.close();
        }
        return new Properties();
    }
}
