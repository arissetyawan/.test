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
    protected String result = "";
    protected String filename = "";
    InputStream inputStream;

    public PropertyReader(String filename)
    {
        this.filename = filename;
    }


    public String ReadPropValues() throws IOException {

        try {
            Properties prop = new Properties();
            String propFileName = this.filename;

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                    prop.load(inputStream);
            } else {
                    throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            Date time = new Date(System.currentTimeMillis());

            // get the property value and print it out
            System.out.println(prop.getClass());
            String user = prop.getProperty("user");
            String company1 = prop.getProperty("driver");
            String company2 = prop.getProperty("host");
            String company3 = prop.getProperty("database");

            result = "Company List = " + company1 + ", " + company2 + ", " + company3;
            System.out.println(result + "\nProgram Ran on " + time + " by user=" + user);
        } catch (Exception e) {
                System.out.println("Exception: " + e);
        } finally {
                inputStream.close();
        }
        return result;
    }

    public void getPropValues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
