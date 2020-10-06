import java.util.ArrayList;

public class Fibonacci {
    public static void main (String[] args){
        ArrayList <Integer> al = new ArrayList<>();
        int i;

        for (i=0; i<=14930352; i++);
            if (i==0){
                al.add(0);
            }
            else if (i==1){
                al.add(1);
            }
            else{
                int zahl1 = i-2;
                int zahl2 = i-1;
                int ergebnis = al.get(zahl1)+al.get(zahl2);
                al.add(ergebnis);
            }
            System.out.println(al);

    }
}
