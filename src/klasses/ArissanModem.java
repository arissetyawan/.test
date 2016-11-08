/*
* *********************************************
* This code is originally created by the author
* *********************************************
* *********************************************
 */

package klasses;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

/** 
 * Nov 9, 2016
 * Originally created with limited distribution
 * @author "arissetyawan"<arissetyawan.campus@gmail.com>
 */
public class ArissanModem {
    class StandardError
    {
        public final String DISCONNECTED = "phone disconnected";
        
    }

    protected Integer Id;
    protected Date CreatedAt;
    protected Date UpdatedAt;
    private String debug;
    private String log;
    private String baud;
    private String port;
    private boolean connected;

    public ArissanModem() throws IOException
    {
        PropertyReader reader = new PropertyReader("configs/Device.properties");
        this.log= (String) reader.get("log");
        this.debug= (String) reader.get("debug");
        this.port= (String) reader.get("port");
        this.baud= (String) reader.get("baud");
        this.connect();
    }

    protected String sendCommand(String command)
    {
            return "OK";
    }

    protected String parseResponse(String response)
    {
        return "POL";
    }

    protected String fetchInbox()
    {
        return "X";
    }
    
    protected String fetcthOutbox()
    {
        return "X";
    }
    
    protected String fetcthSent()
    {
        return "X";
    }
    
    protected boolean delete()
    {
        return true;
    }

    protected String getStatus()
    {
        if(this.connected)
        {
            return "connected";
        }
        return "disconnected";
    }

    protected boolean connect()
    {
        this.connected = true;
        return this.connected;
    }

    protected boolean disConnect()
    {
        this.connected=false;
        return this.connected;
    }
}
