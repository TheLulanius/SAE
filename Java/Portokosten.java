import javax.swing.JOptionPane;

public class Portokosten {
    public static void main (String[] args){
        
        String eingabe = JOptionPane.showInputDialog(null, "Bitte geben Sie den Warenpreis ein");
        double preis = Double.parseDouble(eingabe);
        double bestellung = preis;

        if (preis<100){
            preis = preis + 5.50;
        }
        else if (preis<200){
            preis = preis + 3.00;
        }
        JOptionPane.showMessageDialog(null, "Ihre Bestellung in Höhe von "+bestellung+"€ kostet mit Porto und Verpackung "+preis+"€", "Porto und Verpackungsrechner 3000", JOptionPane.INFORMATION_MESSAGE);
    }
}
