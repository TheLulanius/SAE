package OOP.JavaFiles;
import java.util.ArrayList;
import java.util.List;


public class Konto{ 
    private String kNr;
    public String standardnummer = "69";
    private String kInhaber;
    private double kStand;
    private static int counter=0;
    private String blz = "65062577";
    private String iban;
    
    public Konto(){ 
        kStand=0;
        setkNr(standardnummer);
        setIBAN(iban);
        counter++;
    }
    public Konto(String kInhaber, String kNr, double kStand){
        this.kInhaber=kInhaber;
        setkNr(kNr);
        this.kStand=kStand;
        setIBAN(iban);
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
        String kontoinfo = "Kontonummer: "+kNr+" Kontoinhaber: "+kInhaber+" Kontostand: "+kStand+" IBAN: "+iban;
        return kontoinfo;
    }

    public void setIBAN(String iban){
                if (kNr.length()<10){
                    int rest = 10-kNr.length();
                    for (int x=0; x<rest; x++){
                        setkNr("0"+kNr);
                    }
                }
            String viban = blz+kNr+"131400"; //viban = vorläufige IBAN, 131400 ist Ländercode DE und Prüfsumme

            List <String> ibanparts = new ArrayList<String>(); //Arraylist in der alle Teile der IBAN enthalten sind, die jeweils max 9 characters lang sind
            int y = 0;
            while (y < viban.length()) {
                ibanparts.add(viban.substring(y, Math.min(y + 9,viban.length())));
                y += 9;
            }

            int anzahlteile = ibanparts.size();
            for(y=0; y<anzahlteile; y++){ //y muss kleiner anzahlteile sein, da erster ArrayList Teil Index 0 hat und anzahlteile bei 1 anfängt, somit existiert kein Eintrag in ArraList mit Index anzahlteile, sondern nur mit Index anzahlteile-1
                long olddif = Long.parseLong(ibanparts.get(y));
                long dif = olddif/97;
                long newdif = dif*97;
                long rest = olddif-newdif;
                String differenz = String.valueOf(rest);
                if(y<anzahlteile-1){ //Y muss hier -1 sein, da er später mit y+1 einen nicht vorhandenen Wert ändern möchte
                    String neuerWert = differenz+ibanparts.get(y+1);
                    ibanparts.set(y+1, neuerWert);
                }else{ //Hier wird die Prüfsumme als eigener Teil ans Ende der ArrayList hinzugefügt
                    ibanparts.add(y+1, differenz); //y+1 == anzahlteile
                }
            }
            int intprüfsumme = 98-Integer.parseInt(ibanparts.get(anzahlteile));
            String prüfsumme = String.valueOf(intprüfsumme);
            if(prüfsumme.length()<2){
                prüfsumme = "0"+prüfsumme;
            }
            iban = "DE"+prüfsumme+getBLZ()+getkNr();
            this.iban=iban;          

            }

    public String getIBAN(){
        return iban;
    }

    public String getBLZ(){
        return blz;
    }
}
