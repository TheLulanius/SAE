import javax.swing.JOptionPane;

public class Ostern {
    public static void main (String[] args){

        String eingabe = JOptionPane.showInputDialog(null, "Bitte geben Sie das Jahr ein!");
        int jahr = Integer.parseInt(eingabe);

        String month = "März";

       //Berechnung nach Oster-Formel von Carl Friedrich Gauß
        int m = 24;
        int n = 5;
        int a = jahr % 4;
        int b = jahr % 7;
        int c = jahr % 19;
        int d = (19*c+m) % 30;
        int e = (2*a+4*b+6*d+n) % 7;
        int f = (c+11*d+22*e)/451;      //Berechnung Ostertags
            if(f<0){
                f = 0;
            }
        int ostersonntag = 22+d+e-(7*f);
            if(ostersonntag>31){
                ostersonntag = ostersonntag - 31;
                month = "April";
            }
        
        JOptionPane.showMessageDialog(null, "Ostersonntag fällt im Jahr "+jahr+ " auf den "+ostersonntag+". "+month, "Wann ist Ostern?", JOptionPane.INFORMATION_MESSAGE);
    }
}
