import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Verbrauchsrechner {
    public static void main (String [] args){
        //Formatierung um alle Werte auf 2 Nachkommastellen zu runden
        NumberFormat n = NumberFormat.getInstance();
        n.setMaximumFractionDigits(2);
        
        String eingabe = JOptionPane.showInputDialog("Geben Sie die gefahrene Kilometeranzahl an");
        int strecke = Integer.parseInt(eingabe);

        if (JOptionPane.showConfirmDialog(null, "Wissen Sie die getankte Literanzahl?", "WARNING", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            String eingabe2 = JOptionPane.showInputDialog(null, "Geben Sie die getankte Menge in Litern ein (Trennung mit . statt mit ,)");
            double liter = Double.parseDouble(eingabe2);

            //Rechnung

            double verbrauch = (liter/strecke)*100;
            JOptionPane.showMessageDialog(null, "Sie haben "+n.format(verbrauch)+" l/100km verbraucht");
            
        } //if
        else{
            String eingabe3 = JOptionPane.showInputDialog(null, "Bitte geben Sie den Preis pro Liter ein für den Sie getankt haben (Trennung mit . statt mit ,)");
            double preis = Double.parseDouble(eingabe3);

            String eingabe4 = JOptionPane.showInputDialog(null, "Bitte geben Sie den Betrag ein den Sie für den Tankvorgang bezahlt haben (Trennung mit . statt mit ,)");
            double bezahlt = Double.parseDouble(eingabe4);

            //Rechnung

            double literanzahl = bezahlt/preis;
            double verbraucht = (literanzahl/strecke)*100;
        
            JOptionPane.showMessageDialog(null, "Sie haben "+n.format(verbraucht)+" l/100km verbraucht");
        } //else

        

    }
}