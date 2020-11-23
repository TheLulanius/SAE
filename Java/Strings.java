import javax.swing.JOptionPane;

public class Strings {
    public static void main (String[] args){
        String answer = "";
        String s = "Anton";
        String t = new String("Huber");

        String sbig = s.toUpperCase();
        String tsmall = t.toLowerCase();

        String name = s+" "+t;

        int length = name.length();

        int lex = s.compareTo(t);
            if (lex <0){
                answer = "s ist lexikanisch kleiner";
            }
            else if (lex >0){
                answer = "s ist lexikanisch größer";
            }
            else{
                answer = "s ist lexikanisch gleichwertig";
            }
        JOptionPane.showMessageDialog(null, "String S in Großbuchstaben: "+sbig+" String T in Kleinbuchstaben: "+tsmall+" Zusammengesetzt: "+name+" Länge des Namens: "+length+" Lexikalischer Vergleich: "+answer, "HureHagelNomolWennDesDrecksDingItGohtDannIschAberZapperduschter", JOptionPane.INFORMATION_MESSAGE);

    }
    
}
