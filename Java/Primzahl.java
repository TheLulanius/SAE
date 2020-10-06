import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Primzahl {
    public static void main (String[] args){
        ArrayList <Integer> nteilbar = new ArrayList <> ();
        ArrayList <Integer> teilbar = new ArrayList <> ();
        String e = JOptionPane.showInputDialog(null, "Bitte geben Sie eine Zahl ein");
        long x = Long.parseLong(e);

        while (x<=0){
            String e2 = JOptionPane.showInputDialog(null, "Bitte geben Sie eine Zahl ein die größer Null ist!");
            x = Long.parseLong(e2);
        }

        for(int i=2; i<x; i++){
            if( x % i !=0){
                nteilbar.add(i);
                 
            }
            else{
                teilbar.add(i);
            }
        }
        if (teilbar.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ihre Zahl "+x+" ist eine Primzahl.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Ihre Zahl "+x+" ist keine Primzahl und durch folgende Zahlen teilbar:"+teilbar);
        }

    }
}
