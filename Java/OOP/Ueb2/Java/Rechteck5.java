package OOP.Ueb2.Java;


public class Rechteck5 {
    private double seiteA;
    private double standardseiteA = 0;
    private double seiteB;
    private double standardseiteB = 0;
    private double seiteAB;
    public double flaeche;
    public double umfang;
    public double diagonale;
    public boolean quadrat;
    public static int counter = 0;

    // Konstruktoren
    public Rechteck5() {
        setSeiteA(standardseiteA);
        setSeiteB(standardseiteB);
        getFlaeche();
        getUmfang();
        getDiagonale();
        istQuadrat();
        counter++;
    }

    public Rechteck5(double seiteA, double seiteB) {
        this.seiteA = seiteA;
        this.seiteB = seiteB;
        getFlaeche();
        getUmfang();
        getDiagonale();
        istQuadrat();
        counter++;
    }

    public Rechteck5(String seiteA, String seiteB) {
        setSeiteA(seiteA);
        setSeiteB(seiteB);
        getFlaeche();
        getUmfang();
        getDiagonale();
        istQuadrat();
        counter++;
    }

    // Setter Methoden
    public void setSeiteA(Double seiteA) {
        this.seiteA = seiteA;
    }

    public void setSeiteB(Double seiteB) {
        this.seiteB = seiteB;
    }

    public void setSeiteAB(Double seiteAB) {
        this.seiteAB = seiteAB;
    }

    // Setter überladene Seitenlänge
    public void setSeiteA(String seiteA) {
        setSeiteA(Double.parseDouble(seiteA));
    }

    public void setSeiteB(String seiteB) {
        setSeiteB(Double.parseDouble(seiteB));
    }

    public void setSeiteAB(String seiteAB) {
        setSeiteAB(Double.parseDouble(seiteAB));
    }

    // Getter Methoden
    public double getSeiteA() {
        return seiteA;
    }

    public double getSeiteB() {
        return seiteB;
    }

    public double getSeiteAB() {
        return seiteAB;
    }

    public double getFlaeche() {
        this.flaeche = seiteA * seiteB;
        return flaeche;
    }

    public double getUmfang() {
        this.umfang = 2 * (seiteA * seiteB);
        return umfang;
    }

    public double getDiagonale() {
        this.diagonale = Math.sqrt(Math.pow(seiteA, 2) + Math.pow(seiteB, 2));
        return diagonale;
    }

    public boolean istQuadrat() {
        if(seiteA==seiteB){
            quadrat=true;
        }else{
            quadrat=false;
        }
        return quadrat;
    }

    public double getAnzahlRechteck() {
        return counter;
    }

    // show Methoden
    public double showFlaeche() {
        this.flaeche = seiteA * seiteB;
        System.out.println(this.flaeche);
        return flaeche;
    }
    //Ausgabe
    public String toString() {
        String ausgabe = "Seite A:"+seiteA+" Seite B:"+seiteB+" Fläche: "+flaeche+" Umfang:"+umfang+" Diagonale: "+diagonale+" Ist ein Quadrat?: "+quadrat+" Anzahl erzeugter Quadrate: "+getAnzahlRechteck();
        return ausgabe;
    }
    //main Methode
    public static void main(String[] args) {
        Rechteck5 r1 = new Rechteck5(3,5);
        Rechteck5 r2 = new Rechteck5();
        Rechteck5 r3 = new Rechteck5("4","4");
        System.out.println(r1+"\n");
        System.out.println(r2+"\n");
        System.out.println(r3+"\n");
        
    }

}