package allatok;

import java.util.Random;

public class Kutya extends Allat{
    

    private Boolean him;
    private VercsoportEnum vercsoport;
    
    //public Kutya(){}
    public Kutya(){
        this.nev = "Új kutya";
        this.kor = 0;
        
        /*Random rnd = new Random();
        him=rnd.nextBoolean(); 
        
        megegyezik
        
        him= new Random().nextBoolean();*/
        
        this.him= new Random().nextBoolean();
        this.vercsoport= VercsoportEnum.DEA1_1;
    }

    public Kutya(String nev, Integer kor, Boolean him, VercsoportEnum vercsoport) {
        if (nev!=null&&kor!=null&&him!=null&&vercsoport!=null) {
            this.nev = nev;      
            if (kor>=0 && kor<30) {        
            this.kor = kor;
            }else{
            this.kor=0;
            }
            this.him = him;
            this.vercsoport = vercsoport;
        }else{
            this.nev = "Új kutya";
            this.kor = 0;
            this.him= new Random().nextBoolean();
            this.vercsoport= VercsoportEnum.DEA1_1;
        }
    }
    
    public Boolean isHim(){
        return this.him;
    }

    @Override
    public void hangotAd(){
        System.out.println(this.nev + " mondja: Vaú-vaú");
    }
    public Kutya parosodik(Kutya egyikKutya, Kutya masikKutya){
        Kutya utod = new Kutya(egyikKutya.nev + " " + masikKutya.nev, 0, new Random().nextBoolean(),egyikKutya.vercsoport);
        return utod;
    }
    
    public static Kutya parosodas(Kutya egyikKutya, Kutya masikKutya){
        Kutya utod = null;
        if (egyikKutya.him!=masikKutya.him) {
            utod = new Kutya(egyikKutya.nev + " " + masikKutya.nev, 0, new Random().nextBoolean(),egyikKutya.vercsoport);
        }
        return utod;
    }
    
    public Boolean vercsoportTeszt(Kutya paciens, VercsoportEnum vercsoportIndikator){
        if(this.vercsoport!=null){
            if(this.vercsoport.equals(vercsoportIndikator)){
                return Boolean.TRUE;
            }
        return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }
    
    public Boolean dragabbVercsoportTeszt(VercsoportEnum vercsoportIndikator){
        try{
            if(this.vercsoport.equals(vercsoportIndikator)){
                return Boolean.TRUE;
            }
        }
        catch(Exception ex){
            
        }
        return Boolean.FALSE;
    }
    

    
    
    
}