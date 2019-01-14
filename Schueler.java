import java.util.Date;

public class Schueler {
    private int katalognummer;
    private boolean eigenberechtigt;
    private Date eintrittsdatum;

    public Date getEintrittsdatum() {
        return eintrittsdatum;
    }

    public int getKatalognummer() {
        return katalognummer;
    }

    public boolean isEigenberechtigt() {
        return eigenberechtigt;
    }

    public void setEigenberechtigt(boolean eigenberechtigt) {
        this.eigenberechtigt = eigenberechtigt;
    }

    public void setKatalognummer(int katalognummer) {
        this.katalognummer = katalognummer;
    }

    public void setEintrittsdatum(Date eintrittsdatum) {
        this.eintrittsdatum = eintrittsdatum;
    }
}
