package OOP.JavaFiles;

public class Kontomanager {
    private Konto konten[];

    public Kontomanager(int anzahlkonten) {
        this.konten = new Konto[anzahlkonten];
    }

    public void kontohinzu(Konto k, int i) {
        if (i != 0) { 
            setkNr(k, k.getkNr()); //Wenn Anzahl erstellter Kontos nicht 0 ist, wird Methode setkNr aufgerufen
        }
        konten[i] = k; //Konto wird dem Array an der Stelle i hinzugefügt
    }

    public String toString() {  //Jedes Konto im Array konten wird in einen String umgewandelt und dann als ausgabe zurückgegeben
        String ausgabe = "";
        for (Konto konto : konten) {
            ausgabe += konto.toString() + "\n";
        }
        return ausgabe;
    }

    public void einzahlen(int betrag, String kNr) {  //Für jedes Konto im Array Konten das nicht null ist wird die kNr überprüft. Wenn diese mit dem eingegebenen Wert übereinstimmt, wird der Betrag dem kStand hinzugefügt
        for (Konto konto : konten) {
            if (konto != null) {
                if (konto.getkNr().equals(kNr)) {
                    konto.einzahlen(betrag);
                }
            }
        }
    }

    public void auszahlen(int betrag, String kNr) { //Für jedes Konto im Array Konten das nicht null ist wird die kNr überprüft. Wenn diese mit dem eingegebenen Wert übereinstimmt, wird der Betrag dem kStand abgezogen
        for (Konto konto : konten) {
            if (konto != null) {
                if (konto.getkNr().equals(kNr)) {
                    konto.auszahlen(betrag);
                }
            }
        }
    }

    public void switchkNr(String alt, String neu) { //Für jedes Konto im Array Konten das nicht null ist wird die kNr überprüft. Wenn diese mit dem Wert alt übereinstimmt wird die Methode setkNr mit dem Konto und der neuen kNr aufgerufen
        for (Konto konto : konten) {
            if (konto != null) {
                if (konto.getkNr().equals(alt)) {
                    setkNr(konto, neu);
                    konto.setIBAN(neu); //Neue IBAN mit neuer kNr generieren
                }
            }
        }
    }

    private void setkNr(Konto k, String nummer) { //Für jedes Konto im Array Konten das nicht null und nicht es selbst ist wird die kNr überprüft. Wenn die kNr bereits existiert, die Standardnummer gesetzt. Wenn kein Konto mit der kNr existiert wird die Methode setkNr der Klasse Konto aufgerufen
        for (Konto konto : konten) {
            if (konto != null && !konto.equals(k)) {
                if (k.getkNr().equals(konto.getkNr())) {
                    k.setkNr(k.standardnummer);
                    return; //Wurde die standardnummer gesetzt, wird die Methode an dieser Stelle beendet
                }
            }
        }
        k.setkNr(nummer);
    }

    public void switchInhaber(String inhaber, String kInhaber) {  //Für jedes Konto im Array Konten das nicht null ist wird die kNr überprüft. Wenn diese mit dem eingegebenen Wert übereinstimmt, wird der Betrag dem kStand hinzugefügt
        for (Konto konto : konten) {
            if (konto != null) {
                if (konto.getKInhaber().equals(kInhaber)) {
                    konto.setkInhaber(inhaber);
                }
            }
        }
    }

}
