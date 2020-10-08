import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Grenzwerte {
    public static void main (String[] args){
        ArrayList <Integer> numbers = new ArrayList <> ();
        String eingabe1 = JOptionPane.showInputDialog(null, "Bitte geben Sie den unteren Grenzwert ein");
        int unterergrenzwert = Integer.parseInt(eingabe1);

        String eingabe2 = JOptionPane.showInputDialog(null, "Bitte geben Sie den oberen Grenzwert ein");
        int oberergrenzwert = Integer.parseInt(eingabe2);

        while (unterergrenzwert>=oberergrenzwert){
            String eingabe3 = JOptionPane.showInputDialog(null, "Bitte geben Sie einen neuen oberen Grenzwert ein, dieser muss über den unterem Grenzwert liegen. Unterer Grenzwert: "+unterergrenzwert);
            oberergrenzwert = Integer.parseInt(eingabe3);
        }

        for (int i = unterergrenzwert; i<=oberergrenzwert; i++ ){
            if (i % 2 !=0){
                numbers.add(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Es wurden "+numbers.size()+" ungerade Zahlen zwischen "+unterergrenzwert+" und "+oberergrenzwert+" gefunden, diese lauten "+numbers);
    }
}
