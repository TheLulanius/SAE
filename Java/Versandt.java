import javax.swing.JOptionPane;

public class Versandt {
    public static void main (String[] args){
        String e1 = JOptionPane.showInputDialog(null, "Bitte geben Sie das Gewicht in kg ein");
        double kg = Double.parseDouble(e1);

        String e2 = JOptionPane.showInputDialog(null, "Bitte geben Sie die Länge in cm ein");
        double l = Double.parseDouble(e2);

        String e3 = JOptionPane.showInputDialog(null, "Bitte geben Sie die Breite in cm ein");
        double b = Double.parseDouble(e3);

        String e4 = JOptionPane.showInputDialog(null, "Bitte geben Sie die Höhe in cm ein");
        double h = Double.parseDouble(e4);

        double v = l*h*b;
        double ges = l+h+b;

        if(kg<20 && ges<150){
            JOptionPane.showMessageDialog(null, "Bevorzugte Versandtart: Post", "Versandtartbestimmer 9000", JOptionPane.INFORMATION_MESSAGE);
        } 
        else if(kg>=300 && v>=2000000){
            JOptionPane.showMessageDialog(null, "Bevorzugte Versandtart: Spedition", "Versandtartbestimmer 9000", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Bevorzugte Versandtart: Bahn", "Versandtartbestimmer 9000", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
