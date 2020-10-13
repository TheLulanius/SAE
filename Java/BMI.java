import javax.swing.JOptionPane;

public class BMI {
    public static void main (String[] args){
        String e1 = JOptionPane.showInputDialog(null, "Bitte geben Sie ihr Geschlecht ein. 1 für Mann, 2 für Frau");
        int sex = Integer.parseInt(e1);
        if(sex<1 || sex>2){
            JOptionPane.showMessageDialog(null, "Kein gültiges Geschlecht eingegeben", "BMI Rechner", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }else{
        
        String e2 = JOptionPane.showInputDialog(null, "Bitte geben Sie ihre Körpergröße in cm ein");
        int height = Integer.parseInt(e2);

        if(height<100 || height>250){
            JOptionPane.showMessageDialog(null, "Keine gültige Körpergröße eingegeben", "BMI Rechner", JOptionPane.ERROR_MESSAGE);
        }

        int ng = height-100;
        double ig = 0;
        
        if(sex == 1){
            ig = ng*0.9;
        }
        else{
            ig = ng*0.85;
        }
        JOptionPane.showMessageDialog(null, "Ihr Normalgewicht beträgt "+ng+"kg und ihr Idealgewicht "+ig+"kg.", "BMI Rechner", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
