/*
* *********************************************
* This code is originally created by the author
* *********************************************
* *********************************************
 */

package klasses;

import java.util.Date;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/** 
 * Nov 9, 2016
 * Originally created with limited distribution
 * @author "arissetyawan"<arissetyawan.campus@gmail.com>
 */
public class ArissanModel{
    protected Integer Id;
    protected Date CreatedAt;
    protected Date UpdatedAt;

    public ArissanModel() throws IOException
    {
        PropertyReader prop = new PropertyReader("configs/Database.properties");
        Properties values = prop.ReadPropValues();
        values.get("user");
    }

}
