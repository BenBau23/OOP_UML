public class Raum {
    private String raumNummer;
    private int maxSitzplaetze;
    private Raumtyp raumtyp;


    public String getRaumNummer() {
        return raumNummer;
    }

    public void setRaumNummer(String rN) {
        raumNummer = rN;
    }

    public int getMaxSitzplaetze() {
        return maxSitzplaetze;
    }

    public void setMaxSitzplaetze(int m) {
        maxSitzplaetze = m;
    }

    public raumtyp getRaumtyp() {
        return raumtyp;
    }

    public void setRaumtyp(raumtyp r) {
        raumtyp = r;
    }
}
