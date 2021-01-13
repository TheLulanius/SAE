package OOP.Ueb2.Java;

public class Bruch {
    private int zaehler;
    private int nenner;
    private int standardzaehler = 0;
    private int standardnenner = 1;

    
    
    //Konstruktoren
    public Bruch(){
        bruchEingeben(standardzaehler, standardnenner);
    }

    public Bruch(int zaehler, int nenner){
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public Bruch(int zaehler){
        bruchEingeben(zaehler, standardnenner);
    }

    //Methoden
    public void bruchEingeben(int zaehler, int nenner){
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public void bruchAusgeben(){
        System.out.println(zaehler+"/"+nenner);
    }

    public int getZaehler(){
        return zaehler;
    }

    public int getNenner(){
        return nenner;
    }

    public Bruch add(Bruch Bruch) {
        int z1 = getZaehler();
        int z2 = z1+Bruch.getZaehler();

        int n1 = getNenner();
        int n2 = n1+Bruch.getNenner();
        return new Bruch(z2, n2);
    }

    //Rechnungen
    public Bruch sub(Bruch Bruch) {
        int z1 = getZaehler();
        int z2 = z1-Bruch.getZaehler();

        int n1 = getNenner();
        int n2 = n1-Bruch.getNenner();
        return new Bruch(z2, n2);
    }

    public Bruch mult(Bruch Bruch) {
        int z1 = getZaehler();
        int z2 = z1*Bruch.getZaehler();

        int n1 = getNenner();
        int n2 = n1*Bruch.getNenner();
        return new Bruch(z2, n2);
    }

    public Bruch div(Bruch Bruch) {
        int z1 = getZaehler();
        int z2 = z1*Bruch.getNenner();

        int n1 = getNenner();
        int n2 = n1*Bruch.getZaehler();
        return new Bruch(z2, n2);
    }

    public static void main(String[] args) {
        Bruch b1 = new Bruch(); // 0/1
        Bruch b2 = new Bruch(1, 4); // 1/4
        Bruch b3 = new Bruch(2); // 2/1

        //Test
        b1.bruchAusgeben();
        b2.bruchAusgeben();
        b3.bruchAusgeben();
        System.out.println("");

        b1=b2.div(b3);

        b1.bruchAusgeben();
        b2.bruchAusgeben();
        b3.bruchAusgeben();

        
    } 
}

