import javax.swing.JOptionPane;

public class Lotto {
    public static void main (String[] args){
        int[] zahlen = {0,1,2,3,4,5,6};

        for (int i=0; i<=6; i++){
            zahlen[i] =(int) (Math.random()*50)+1;
        }
        for (int x=0; x<=5; x++){
            if (zahlen[6]==zahlen[x]){
                zahlen[6] = (int)(Math.random()*50)+1;
                x = 0;
            }
        }
        JOptionPane.showMessageDialog(null, "Die Lottozahlen lauten: "+zahlen[1]+","+zahlen[2]+","+zahlen[3]+","+zahlen[4]+","+zahlen[5]+" und Superzahl "+zahlen[6], "Lottozahlenzieher 6000", JOptionPane.PLAIN_MESSAGE);
    }
}
