import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class Relativtag {
    public static void main (String[] args){
        
        String e1 = JOptionPane.showInputDialog(null, "Bitte geben sie den gewünschten Tag ein");
        int day = Integer.parseInt(e1);

        String e2 = JOptionPane.showInputDialog(null, "Bitte geben sie den gewünschten Monat ein");
        int month = Integer.parseInt(e2);

        String e3 = JOptionPane.showInputDialog(null, "Bitte geben sie das gewünschte Jahr ein");
        int year = Integer.parseInt(e3);

        LocalDate start = LocalDate.of(year, 1, 1);
        LocalDate stop = LocalDate.of(year, month, day);

        long relativtag = ChronoUnit.DAYS.between(start, stop);

        JOptionPane.showMessageDialog(null, "Der "+day+"."+month+"."+year+" ist der "+relativtag+". Tag im Jahr "+year, "Tagesrechnerle 2020", JOptionPane.INFORMATION_MESSAGE);
    }
}

