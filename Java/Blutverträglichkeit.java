import javax.swing.JOptionPane;

public class Blutverträglichkeit {
    public static void main (String[] args){

        String E = JOptionPane.showInputDialog(null, "Bitte geben Sie die Blutgruppe des Empfängers ein");
        String S = JOptionPane.showInputDialog(null, "Bitte geben Sie die Blutgruppe des Spenders ein");

        if(E.equals("A")){
            if(S.equals("A") || S.contains("0")){
                JOptionPane.showMessageDialog(null, "verträglich", "Blutgruppenverträglichkeitsbestimmungsprogramm", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "unverträglich", "Blutgruppenverträglichkeitsbestimmungsprogramm", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(E.equals("B")){
            if(S.equals("B") || S.equals("0")){
                JOptionPane.showMessageDialog(null, "verträglich", "Blutgruppenverträglichkeitsbestimmungsprogramm", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "unverträglich", "Blutgruppenverträglichkeitsbestimmungsprogramm", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(E.equals("AB")){
            if(S.equals("AB") || S.equals("0")){
                JOptionPane.showMessageDialog(null, "verträglich", "Blutgruppenverträglichkeitsbestimmungsprogramm", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "unverträglich", "Blutgruppenverträglichkeitsbestimmungsprogramm", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(E.equals("0")){
            JOptionPane.showMessageDialog(null, "verträglich", "Blutgruppenverträglichkeitsbestimmungsprogramm", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Bitte gültige Blutgruppe eingeben", "Blutgruppenverträglichkeitsbestimmungsprogramm", JOptionPane.ERROR_MESSAGE);
        }
    }
}
