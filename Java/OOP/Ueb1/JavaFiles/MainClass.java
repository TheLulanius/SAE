package OOP.Ueb1.JavaFiles;

import javax.swing.JOptionPane;

public class MainClass {
    public static void main(String[] args){
        Kontomanager kmanager = new Kontomanager(2);
        kmanager.kontohinzu(new Konto(), 0);
        kmanager.kontohinzu(new Konto("Huber","12022200",5), 1);

        kmanager.einzahlen(10000, "0000000069");
        kmanager.auszahlen(100, "0000000069");
        kmanager.switchkNr("0000000069", "40223307");
        //kmanager.switchInhaber("Günther, Erich", "Mustermann"); // zusätzliche Funktion: Nachträglich Benutzer ändern
        
    
    JOptionPane.showMessageDialog(null, "Folgende Konten sind bei der JavaBank angelegt: \n"+kmanager, "Kontoinformationen - JavaBank", JOptionPane.INFORMATION_MESSAGE);

   }

}