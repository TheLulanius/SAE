public class Kontomanager {
    private Konto konten[];

    public Kontomanager(int anzahlkonten) {
        this.konten = new Konto[anzahlkonten];
    }

    public void kontohinzu(Konto k, int i) {
        if (i != 0) {
            setkNr(k, k.getkNr());
        }
        konten[i] = k;
    }

    public String toString() {
        String ausgabe = "";
        for (Konto konto : konten) {
            ausgabe += konto.toString() + "\n";
        }
        return ausgabe;
    }

    public void einzahlen(int betrag, String kNr) {
        for (Konto konto : konten) {
            if (konto != null) {
                if (konto.getkNr().equals(kNr)) {
                    konto.einzahlen(betrag);
                }
            }
        }
    }

    public void auszahlen(int betrag, String kNr) {
        for (Konto konto : konten) {
            if (konto != null) {
                if (konto.getkNr().equals(kNr)) {
                    konto.auszahlen(betrag);
                }
            }
        }
    }

    public void switchkNr(String alt, String neu) { //Manuell kNr ändern
        for (Konto konto : konten) {
            if (konto != null) {
                if (konto.getkNr().equals(alt)) {
                    setkNr(konto, neu);
                }
            }
        }
    }

    private void setkNr(Konto k, String nummer) { //Wenn kNr existiert, ändere kNr zu Standardnummer
        for (Konto konto : konten) {
            if (konto != null && !konto.equals(k)) {
                if (k.getkNr().equals(konto.getkNr())) {
                    k.setkNr(k.standardnummer);
                    return;
                }
            }
        }
        k.setkNr(nummer);
    }


}
