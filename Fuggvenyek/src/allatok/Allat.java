
package allatok;

public abstract class Allat {
    protected String nev;
    protected Integer kor;
    
    public Allat(){
    
    }
    
    public Allat(String nev, Integer kor) {
        this.nev = nev;
        this.kor = kor;
    }
    
    public String getNev() {
        return nev;
    }

    public Integer getKor() {
        return kor;
    }
    
    public void setNev(String nev) {
        this.nev = nev;
    }
    
    public void szulinap(){
        this.kor++;
    }
    
    public void hangotAd(){
        System.out.println(this.nev+"mondja: --- ---");
    }
    
}
