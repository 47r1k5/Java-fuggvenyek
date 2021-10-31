package fuggvenyek;

import allatok.VercsoportEnum;
import allatok.Papagaj;
import allatok.Kutya;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javafx.scene.paint.Color;

public class Fuggvenyek {
    
    //paraméter nélküli végrehajtó függvény
    public static void husdaralo1(){
        System.out.println("Én vagyok a húsdaráló1 nevű függvény. Nagyon szép napunk van. Rttem reggel szenyót. Futás közben a Lucifer 1. évadát néztem.");
    }
    
    public static void husdaralo1(String szoveg){
        System.out.println(szoveg);
    }
    
    public static void husdaralo1(Integer darab){
        System.out.println(darab);
    }
    
    //paraméteres végrehajtó függvény
    public static void husdaralo2(Integer a, Integer b){
        System.out.println("a és b összege: "+(a+b));
    }
    
    //paraméter nélüli értékvisszaadó függvény
    public static Integer husdaralo3(){
        Integer osszeg = 2+2;
        
        return osszeg;
    }
    
    //paraméteres értékvisszaadó függvény
    public static Integer husdaralo4(Integer a, Integer b){
        Integer osszeg = a+b;
        return osszeg;
    }
    
    public static Double husdaralo5(Double a, Double b, String muv){
        Double ered=0.0;
        if (muv.equals("+")){
            ered = a+b;
        }
        else if (muv.equals("-")){
            ered = a-b;
        }
        else if (muv.equals("*")){
            ered = a*b;
        }
        else if (muv.equals("/")&&b!=0){
            ered = a/b;
        }
        else{
            System.out.println("Hibás bemenő adat!");
        }
        return ered;
    }
    

    
    public static void main(String[] args) {
        
        husdaralo1();
        husdaralo1();
        
        husdaralo2(2,7);
        husdaralo2(-5,9);
        
        System.out.println(husdaralo3());
        Integer ered = husdaralo3();
        System.out.println(ered);
        
        System.out.println(husdaralo4(7,9));
        ered = husdaralo4(8,15);
        System.out.println(ered);
        
        Kutya k = new Kutya();
        /*k.nev="Scooby";
        k.kor = 5;
        k.him = true;
        k.vercsoport="DEA 1.1";*/
        
        System.out.println(k.getNev() + " kora: " + k.getKor() + " év.");
        
        Kutya u = new Kutya();
        //System.out.println(u.getNev());
        /*u.nev="Tilda";
        u.kor=4;
        u.him=Boolean.FALSE;
        u.vercsoport="DEA 4";*/
        System.out.println(u.getNev() + " kora: " + u.getKor() + " év.");
        
        //u.getKor()=2; Ilyen nincs!
        
        Kutya t = new Kutya("T-rex",5,Boolean.TRUE,VercsoportEnum.DEA4);
        System.out.println(t.getNev());
        System.out.println(t.getKor());        
        System.out.println(t.isHim());
        t.szulinap();
        t.setNev("Velo");
        System.out.println(t.getNev());
        System.out.println(t.getKor());
        System.out.println(t.isHim());
        
        Kutya y = new Kutya("T-rex",5,Boolean.TRUE,VercsoportEnum.DEA1_1);
        System.out.println(y.getKor());
        y.hangotAd();
        
        Kutya x= new Kutya();
        Kutya ty=x.parosodik(t,y);
        new Kutya().parosodik(t,y);
        System.out.println(ty.getNev());
        
        if (t.isHim()!=y.isHim()) {
            Kutya ty2= Kutya.parosodas(t,y);
        }
        
        Kutya paciens = t;
        VercsoportEnum indikator = VercsoportEnum.DEA1_1;
        String teszt = "Vércsoport teszt "+paciens.getNev()+"kutyára: \n";
        String tesztV ="\t indikátor: "+indikator.name();
        String eredmeny = "\t eredmény: "+paciens.dragabbVercsoportTeszt(indikator);
        
        String output = teszt + tesztV +eredmeny;
        
        System.out.println(output);
        
        if (paciens.dragabbVercsoportTeszt(indikator)) {
            output=paciens.getNev()+" kutyától az egyezés esetén ";
            Boolean beteg=Boolean.FALSE;
            Integer maxLevetel=VercsoportEnum.DEA1_1.getLevetel(beteg);
            output+=maxLevetel+"ml vért lehet levenni";
            System.out.println(output);
        }
        
        Papagaj p = new Papagaj("Gyurika",3,Boolean.FALSE,Color.LIGHTGREEN);
        System.out.println(p.isRepul());
        p.megtanulRepulni();
        System.out.println(p.isRepul());
        
        //Allat a = new Allat; absztrakt függvény, nem lehet új egyedet létehozni
        
    }
    
}
