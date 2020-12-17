import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Mitternachtsformel{
    public static void main (String[] args){
        NumberFormat n = NumberFormat.getInstance();
        n.setMaximumFractionDigits(2);
        String e1 = JOptionPane.showInputDialog(null, "Bitte geben Sie einen Wert für a ein");
        double a = Double.parseDouble(e1);

        String e2 = JOptionPane.showInputDialog(null, "Bitte geben Sie einen Wert für b ein");
        double b = Double.parseDouble(e2);

        String e3 = JOptionPane.showInputDialog(null, "Bitte geben Sie einen Wert für c ein");
        double c = Double.parseDouble(e3);
        
        double x1 = (-b + (Math.sqrt((b*b)-(4*a*c))))/(2 * a); //(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        double x2 = (-b - (Math.sqrt((b*b)-(4*a*c))))/(2 * a); //(-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;

        //JOptionPane.showMessageDialog(null, "Das Ergebnis der Gleichung "+a+"x^2+"+b+"x+"+c+" ist x1="+n.format(x1)+" und x2="+n.format(x2), "Mitternachtsformel brauchsch immer", JOptionPane.INFORMATION_MESSAGE);
        if (((b * b) - (4 * a * c)) < 0){
            JOptionPane.showMessageDialog(null, "Die Gleichung "+a+"x^2+"+b+"x+"+c+" ist hat keine Lösung", "Mitternachtsformel brauchsch immer", JOptionPane.INFORMATION_MESSAGE);
        } else if (((b * b) - (4 * a * c)) == 0){
            JOptionPane.showMessageDialog(null, "Die Gleichung "+a+"x^2+"+b+"x+"+c+" hat eine Lösung, x1="+n.format(x1), "Mitternachtsformel brausch immer" , JOptionPane.INFORMATION_MESSAGE);
        } else if (((b * b) - (4 * a * c)) > 0){
            JOptionPane.showMessageDialog(null, "Die Gleichung "+a+"x^2+"+b+"x+"+c+" hat 2 Lösungen, x1="+n.format(x1)+" und x2="+n.format(x2), "Mitternachtsformel brauchsch immer", JOptionPane.INFORMATION_MESSAGE);
        }
    
    }
}