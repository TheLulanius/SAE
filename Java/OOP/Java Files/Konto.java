import java.util.Set;

public class Konto{ 
    private String kNr;
    public String standardnummer = "69";
    private String kInhaber;
    private double kStand;
    private static int counter=0;
    
    public Konto(){ 
        kStand=0;
        setkNr(standardnummer);
        counter++;
    }
    public Konto(String kInhaber, String kNr, double kStand){
        this.kInhaber=kInhaber;
        setkNr(kNr);
        this.kStand=kStand;
        counter++;
    }

    public void einzahlen(double betrag){
        kStand=kStand+betrag;
    }
    public void auszahlen(double betrag){
        kStand=kStand-betrag;
    }
    public double getKStand(){
     return kStand;
    }
    public String getkNr(){
        return kNr;
    }
    public String getKInhaber(){
        return kInhaber;
       }
    public void setkNr (String kNr){
        this.kNr=kNr;
    }
    public void setkNr (long kNr){
        setkNr(Long.toString(kNr));
    }
    public void setkInhaber (String kInhaber){
        this.kInhaber=kInhaber;
    }
    public void setkStand (Double kStand){
        this.kStand=kStand;
    }
    public int getCounter(){
        return counter;
    } 
    public String toString() {
        String kontoinfo = "Kontonummer: "+kNr+" Kontoinhaber: "+kInhaber+" Kontostand: "+kStand;
        return kontoinfo;
    }
}
