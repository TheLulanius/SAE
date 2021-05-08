import java.util.ArrayList;

/**
 * Personalnummer
 */
public class Personalnummer {

    public static void personalNummerFirst(String[] aPersonaldatenSatz, int iPosTrenner){
        String[] aPersTeilDaten = new String[aPersonaldatenSatz.length];

        for(int i=0; i<aPersonaldatenSatz.length; i++){
            aPersTeilDaten = aPersonaldatenSatz[i].split("\\|");
            String neworder = aPersTeilDaten[iPosTrenner]+"|";
            
        for(int y=0; y<aPersTeilDaten.length; y++){
            if(aPersTeilDaten[y].contains("_")){
                continue;
            }else{
                neworder = neworder+aPersTeilDaten[y]+"|"; 
            }
        }
        System.out.println("Neue Anordnung: "+neworder);
    }


    }
    public static void main(String[] args) {
        
    String[] aPersonalWirth = {"Mueller|Josef|FR_1112|Freiburg","Maier|Fritz|ST_1114|Vaihingen","Heinzel|Maria|ST5525| Bad Cannstatt","Herrman|Georg|FR_2536|Merzhausen"};
    String[] aPersonalSchneider = {"Schneider|Wolfgang|Heidelberg|HE20011","Bartels|Martina|Sandhausen|HE_15436","Beck|Hans|Neckarsteinach|HE_5436"};
    
    personalNummerFirst(aPersonalSchneider, 3);
    personalNummerFirst(aPersonalWirth, 2);

}

}