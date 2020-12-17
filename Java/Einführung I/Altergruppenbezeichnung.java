import javax.swing.JOptionPane;

public class Altergruppenbezeichnung {
    public static void main (String[] args){
        String eingabe = JOptionPane.showInputDialog(null, "Bitte geben Sie ihr Alter an");
        int alter = Integer.parseInt(eingabe);
    
        if(alter<0){
            String eingabe2 = JOptionPane.showInputDialog(null, "Bitte geben Sie ihr Alter an, dies muss mindestens 0 betragen");
        alter = Integer.parseInt(eingabe2);
        }
        else{

        if(alter<10){
            JOptionPane.showMessageDialog(null, "Sie gehören zur Altergruppe Kind", "Altersgruppenbestimmer 420", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(alter>=10 && alter<20){
            JOptionPane.showMessageDialog(null, "Sie gehören zur Altergruppe Teenie", "Altersgruppenbestimmer 420", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(alter>=20 && alter<30){
            JOptionPane.showMessageDialog(null, "Sie gehören zur Altergruppe Twen", "Altersgruppenbestimmer 420", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(alter>=30 && alter<50){
            JOptionPane.showMessageDialog(null, "Sie gehören zur Altergruppe Middle", "Altersgruppenbestimmer 420", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Sie gehören zur Altergruppe Gruftie", "Altersgruppenbestimmer 420", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }
}
