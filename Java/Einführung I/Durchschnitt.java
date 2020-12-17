import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Durchschnitt {
    public static void main (String[] args){

        ArrayList <Integer> numbers = new ArrayList <> ();
        int zahl = 1;
        int max = 0;
        int durchschnitt = 0;

        while (zahl != 0){
            String eingabe = JOptionPane.showInputDialog(null, "Bitte geben Sie eine Zahl ein");
            zahl = Integer.parseInt(eingabe);
            numbers.add(zahl);   
        }
            for (int i=0; i<numbers.size(); i++){
                max = max+numbers.get(i);
                durchschnitt = max/numbers.size();
            }
    JOptionPane.showMessageDialog(null, "Sie haben "+numbers.size()+" Zahlen eingegeben. Alle eingegebenen Werte ergeben zusammen "+max+" und der Durchschnitt aller eingegebenen Zahlen ist "+durchschnitt, "Zahlenzählmaschinendings", JOptionPane.INFORMATION_MESSAGE);   
    }

}
