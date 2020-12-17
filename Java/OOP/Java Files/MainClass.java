public class MainClass {
    public static void main(String[] args){
        Kontomanager kmanager = new Kontomanager(2);
        kmanager.kontohinzu(new Konto(), 0);
        kmanager.kontohinzu(new Konto("Huber","12022200",5), 1);


        System.out.println(kmanager);
        System.out.println("");

        kmanager.einzahlen(10000, "69");
        kmanager.auszahlen(100, "69");
        kmanager.switchkNr("69", "40223307");
        

    //     Konto k1 = new Konto();

    //     Konto k2 = new Konto("Huber","12022200",5);

    //     k1.setkNr("40223307");

    //     k1.einzahlen(10000);

    //    // System.out.println("Kontostand k1: "+k1.getKStand());

    //     k1.auszahlen(100);

    //     //System.out.println("Kontostand k1: "+k1.getKStand());

    //     //System.out.println("Kontostand k2: "+k2.getKStand());

    System.out.println(kmanager);

   }

}