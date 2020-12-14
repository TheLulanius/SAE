import javax.swing.JOptionPane;

public class loginnames {
    public static void main(String[] args) {
        
        String vorname = JOptionPane.showInputDialog(null, "Bitte Vornamen eingeben");
        String nachname = JOptionPane.showInputDialog(null, "Bitte Nachnamen eingeben", "Login Creator 9000", JOptionPane.INFORMATION_MESSAGE);

        String lognachname = "";

        if(nachname.length()<5){
            int fehlt = 6-nachname.length();
            for (int i = 0; i<= fehlt; i++) {
                lognachname = nachname+"x";
            }//for
        }//if
        System.out.println(lognachname);

        String loginname = lognachname.substring(0, 5)+vorname.substring(0, 2);

        JOptionPane.showMessageDialog(null, "Der Loginname für "+vorname+" "+nachname+" lautet: "+loginname, "LoginNamenMacherGedönsZeug3000", JOptionPane.INFORMATION_MESSAGE);

    }
}
