
package allatok;

import java.awt.Color;
import java.util.Random;

public class Bogar implements IPapagaj, IRovar{

    @Override
    public Boolean isRepul() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Color getSzin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void megtanulRepulni() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void petezik() {
        Integer peteDarabszam = new Random().nextInt(IRovar.MaxPeteDarabszam);
                
        for (Integer db = 0; db < peteDarabszam; db++) {
            System.out.println("pete potty");
        }
    }
    
}
