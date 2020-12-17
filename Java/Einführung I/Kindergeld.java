import javax.swing.JOptionPane;

public class Kindergeld {
    public static void main (String[] args){
        double kindergeld = 0;
        String e1 = JOptionPane.showInputDialog(null, "Bitte geben Sie ihr jährliches Einkommen ein");
        double einkommen = Double.parseDouble(e1);

        String e2 = JOptionPane.showInputDialog(null, "Bitte geben Sie die Anzahl der Kinder ein");
        int kinder = Integer.parseInt(e2);

        if (kinder<=0){
            JOptionPane.showMessageDialog(null, "Sie sind leider nicht berechtigt Kindergeld zu erhalten! Zeug ein paar oder verpiss dich, NÄCHSTER!", "Kindergeldrechner 2020", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        else if (kinder>4){
            int zviel = kinder-4;
            JOptionPane.showMessageDialog(null, "Sie haben leider zu viele Kinder. Bitte werfen Sie mindestens "+zviel+" Kinder von der Klippe um Kindergeld zu erhalten ", "Kindergeldrechner 2020", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        else{
        if(einkommen<45000){
            if(kinder==1){
                kindergeld = kindergeld+70.00;
            }
            else if(kinder == 2){
                kindergeld = kindergeld+130.00;
            }
            else if(kinder == 3){
                kindergeld = kindergeld+220.00;
            }
            else if(kinder == 4){
                kindergeld = kindergeld+240.00;
            }
        }
        else {
            if(kinder<=2){
                kindergeld = kindergeld+70.00;
            }
            else if (kinder>2){
                kindergeld = kindergeld+140.00;
            }
        }
    }
    JOptionPane.showMessageDialog(null, "Herzlichen Glückwunsch! Sie erhalten "+kindergeld+" Duke-Dollar D$ Kindergeld!", "Kindergeldrechner 2020", JOptionPane.INFORMATION_MESSAGE);
}
}

