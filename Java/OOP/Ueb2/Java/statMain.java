package OOP.Ueb2.Java;

public class statMain {
    public static void main(String[] args)
    {
    StatClass r = new StatClass();  //Neues Objekt r mit Konstruktor StatClass
    StatClass s = new StatClass();  //Neues Objekt s mit Konstruktor StatClass
    r.i=10; //Der statische Integer wird in Objekt r auf den Wert 10 gesetzt (r.i = 10, s.i = 10)
    StatClass.i=10;  //Für alle Objekte des Konstruktors StatClass wird i auf 10 gesetzt (r.i = 10, s.i = 10)
    StatClass.statMethod(); //Für alle Objekte des Konstruktors StatClass wird die Methode statMethod aufgerufen (r.i = 20, s.i = 20)
    r.statMethod(); //Im Objekt r wird die Methode statMethod aufgerufen und der statische Integer i daher verdoppelt (r.i = 40, s.i = 40)
    s.statMethod(); //Im Objekt r wird die Methode statMethod aufgerufen und der statische Integer i daher verdoppelt (r.i = 80, s.i = 80)
    System.out.println(StatClass.i); //Der statische Integer i des Konstruktors i wird ausgegeben (80)
    System.out.println(s.i +" "+ r.i); //Der statische Integer i in den Objekten r und s werden ausgeben (80 80)
    }
   }
