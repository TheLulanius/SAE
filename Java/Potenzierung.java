import javax.swing.JOptionPane;

public class Potenzierung {
    public static void main (String[] args){
        int ergebnis = 0;
        String e1 = JOptionPane.showInputDialog(null, "Bitte geben Sie eine Basis ein");
        int basis = Integer.parseInt(e1);

        while (basis<=0){
            String e2 = JOptionPane.showInputDialog(null, "Bitte geben Sie eine Basis ein die größer Null ist!");
            basis = Integer.parseInt(e2);
        }

        String e3 = JOptionPane.showInputDialog(null, "Bitte geben Sie einen Exponenten ein");
        int exponent = Integer.parseInt(e3);

        while (exponent<0){
            String e4 = JOptionPane.showInputDialog(null, "Bitte geben Sie einen Exponenten ein der größer gleich Null ist!");
            exponent = Integer.parseInt(e4);
        }

        if (exponent==0){
            JOptionPane.showMessageDialog(null, "Die Antwort lautet: 1");
        }
        else{
            for (int i=1; i<=exponent; i++){
                ergebnis+=basis*basis;
            }
            JOptionPane.showMessageDialog(null, "Die Antwort für "+basis+"^"+exponent+" lautet: "+ergebnis);
        }
    }
}
