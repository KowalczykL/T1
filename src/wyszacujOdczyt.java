
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Łukasz Kowalczyk
 */
public class wyszacujOdczyt {
    
    public int SzacujOdczyt(int wskP, int wskB, String DataP, String DataB, String DataSzac)
    {   
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date dataP2 = dateFormat.parse(DataP);
        } catch (ParseException ex) {
            Logger.getLogger(wyszacujOdczyt.class.getName()).log(Level.SEVERE, null, ex);
        }
                try {
            Date dataB2 = dateFormat.parse(DataB);
        } catch (ParseException ex) {
            Logger.getLogger(wyszacujOdczyt.class.getName()).log(Level.SEVERE, null, ex);
        }

                
                
        
        
        
        
       
        
        
        
        return 0;
    }
}
