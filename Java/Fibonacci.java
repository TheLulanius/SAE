import java.util.ArrayList;

public class Fibonacci {
    public static void main (String[] args){
        ArrayList <Integer> al = new ArrayList<>();
        int i=0;
        int ergebnis=0;
        int y=14930352;

        while (ergebnis<y){
            if (i==0){
                al.add(0);
                i++;
            }
            else if (i==1){
                al.add(1);
                i++;
            }
            else{
                int zahl1 = i-2;
                int zahl2 = i-1;
                ergebnis = al.get(zahl1)+al.get(zahl2);
                al.add(ergebnis);
                i++;
            }
            }
       

            System.out.println(al);

    }
}
