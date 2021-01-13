package OOP.Ueb2.Java;

import javax.swing.JOptionPane;

public class Rechnerverwaltung {
    private String rechnername;
    private String mac;
    private String domain;
    private String ip;
    private String standort;

    //Konstruktoren
    public Rechnerverwaltung(String rechnername, String mac, String domain, String ip, String standort) {
        this.rechnername = rechnername;
        this.mac = mac;
        this.domain = domain;
        this.ip = ip;
        this.standort = standort;
    }

    //Setter
    public void setRechnername(String rechnername){
        if (rechnername.length() < 15){
            System.out.println("ERROR");
            ;
        }else{
        this.rechnername = rechnername;
        }
    }

    public void setMAC(String mac){
        this.mac = mac;
    }

    public void setDomain(String domain){
        this.domain = domain;
    }

    public void setIP(String ip){
        this.ip = ip;
    }

    public void setStandort(String standort){
        this.standort = standort;
    }

    //Getter

    public String getRechnername(){
        return rechnername;
    }

    public String getMAC(){
        return mac;
    }

    public String getDomain(){
        return domain;
    }

    public String getIP(){
        return ip;
    }

    public String getStandort(){
        return standort;
    }

    //Ausgabe
    public String toString(){
        String ausgabe = "Für diesen PC sind folgende Daten gespeichert:\nComputername: "+rechnername+"\nMAC-Adresse: "+mac+"\nDomäne: "+domain+"\nIP-Adresse: "+ip+"\nStandort: "+standort;
        return ausgabe;
    }

    //main
    public static void main(String[] args) {
        Rechnerverwaltung pc1 = new Rechnerverwaltung("Asterix", "00-E0-97-00-33-90", "bmw.de", "10.3.102.12", "BMW Werk 1");
        Rechnerverwaltung pc2 = new Rechnerverwaltung("Obelix", "00-FF-57-CD-A5-0B", "vpn.com", "10.3.105.71", "Büro 3.12");
        Rechnerverwaltung pc3 = new Rechnerverwaltung("Idefix", "40-B0-76-5D-15-5E", "daheim.de", "192.168.188.31", "Admin Büro");

        JOptionPane.showMessageDialog(null, pc1, "Rechnerverwaltungsprogramm 9000", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, pc2, "Rechnerverwaltungsprogramm 9000", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, pc3, "Rechnerverwaltungsprogramm 9000", JOptionPane.INFORMATION_MESSAGE);
    }

}