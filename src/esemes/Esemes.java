/*
 *  *********************************************
 *  This code is originally created by the author
 *  *********************************************
 *  *********************************************
 */
package esemes;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import klasses.PropertyReader;
import klasses.User;
import ui.MainForm;

/**
 *
 * @author arissetyawan
 */
public class Esemes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        MainForm form = new MainForm();
        form.setVisible(true);
        PropertyReader prop = new PropertyReader("configs/Database.properties");
        try {
            prop.ReadPropValues();
        } catch (IOException ex) {
            Logger.getLogger(Esemes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
