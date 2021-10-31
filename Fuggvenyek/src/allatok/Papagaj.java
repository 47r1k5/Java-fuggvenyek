
package allatok;

import java.awt.Color;
public class Papagaj extends Allat implements IPapagaj{

    private Boolean repul;
    private Color szin;
    
    public Papagaj(){
    
    }
    
    public Papagaj(String nev, Integer kor, Boolean repul, Color szin) {
        super(nev, kor);
        this.repul = repul;
        this.szin = szin;
    }

    public Papagaj(String gyurika, int i, Boolean FALSE, javafx.scene.paint.Color LIGHTGREEN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean isRepul() {
        return repul;
    }

    @Override
    public Color getSzin() {
        return szin;
    }

    @Override
    public void megtanulRepulni(){
    this.repul=Boolean.TRUE;
    }
    
    @Override
    public void hangotAd(){
        System.out.println(this.nev + " mondja: Csip-csip");
    }
    
    public void repul(){
        System.out.println(this. nev+" éppen repül");
    }
}
