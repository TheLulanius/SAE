package OOP.Ueb2.Java;

public class Bruch {
    public int zaehler;
    public int nenner;
    public int standardzaehler = 0;
    public int standardnenner = 1;

    
    
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

    /*public int add(Bruch Bruch) {
        int z1 = getZaehler();
        int z2 = Bruch.getZaehler();
        int z3 = z1+z2;
        z3 = zaehler;

        int n1 = getNenner();
        int n2 = Bruch.getNenner();
        int n3 = n1+n2;
        n3 = nenner;

        return zaehler,nenner;
        
    }

    public static void main(String[] args) {
        Bruch b1 = new Bruch();
        Bruch b2 = new Bruch(1, 4);
        Bruch b3 = new Bruch();

        b3=b1.add(b2);
    } */



}

