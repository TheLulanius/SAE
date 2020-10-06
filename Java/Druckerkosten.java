import java.text.NumberFormat;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Druckerkosten {
    public static void main (String[] args){
        NumberFormat n = NumberFormat.getInstance();
        n.setMaximumFractionDigits(2);
        double fixkosten = 238.00;
        int mindestabgabe = 1500;
        double kosten = 0.0225;

         // create object of table and table model
        JTable table = new JTable();
        DefaultTableModel dtm = new DefaultTableModel(0, 0);
        // add header of the table
        String header[] = new String[] { "Kopieanzahl", "Gesamtkosten in Euro", "Kosten pro Kopie in Euro"};
        // add header in table model     
        dtm.setColumnIdentifiers(header);
         //set model into the table object
        table.setModel(dtm);

         // add row dynamically into the table      
        for (int i = 500; i<=8000; i=i+500) {
            
            if (i<=mindestabgabe){
                double mindestkosten = fixkosten+(fixkosten*0.16);
                double ppk = mindestkosten/i; //Preis Pro Kopie
                dtm.addRow(new Object[] { i, n.format(mindestkosten), n.format(ppk) }); 
            }
            else{
                double gesamtkosten = (fixkosten+((i-1500)*kosten))*1.16;
                double ppk = gesamtkosten/i; //Preis Pro Kopie
                dtm.addRow(new Object[] { i, n.format(gesamtkosten), n.format(ppk) });
            }
            
        }
        //Um bei der Ausgabe den Header zu inkludieren wird ein JFrame erzeugt das den JTable enthält
        JFrame frame = new JFrame("Druckerkostenrechner");
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.add(new JScrollPane(table));
        frame.pack();
        frame.setVisible( true );
    }
}
