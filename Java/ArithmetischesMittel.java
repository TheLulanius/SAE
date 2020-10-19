import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArithmetischesMittel{
    public static void main (String[] args){
        int kleinste = 0;
        int größte = 0;
        int max = 0;
        int fo = 0;
        int tests =(int) (Math.random()+100);

        ArrayList <Integer> ergebnisse = new ArrayList<> ();

        for (int i=0; i<=tests; i++) {
            int gewicht = (int) (Math.random()*55)+46;
            ergebnisse.add(gewicht);            
        }
        for (int x=0; x<=ergebnisse.size(); x++){
            max = max+ergebnisse.get(x);
        }

        int m = max/ergebnisse.size();
        for (int y = 0; y<=tests; y++) {
            fo = (int) (fo+Math.pow((ergebnisse.get(y)-m), 2));
        }
        int s = fo/tests;
        
        for (int a = 0; a<=ergebnisse.size(); a++){
            if (a==0){
                kleinste = ergebnisse.get(a);
                größte = ergebnisse.get(a);
            }
            if (ergebnisse.get(a)<kleinste){
                kleinste = ergebnisse.get(a);
            }
            else if (ergebnisse.get(a)>größte){
                größte = ergebnisse.get(a);
            }                   
        }

        JOptionPane.showMessageDialog(null, "Es wurden "+tests+" Tests durchgeführt. Insgesamt wurden "+max+"kg gewogen. Der Durchschnitt lag dabei bei "+m+"kg und die Standardabweichung bei"+s+"kg. Das kleinste Messergebnis war"+kleinste+"kg und das größte"+größte+"kg.", "Drecksscheißrechnerdiungsbumsmaschine 9000", JOptionPane.INFORMATION_MESSAGE);

        }
    }