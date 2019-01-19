import java.util.Date;

public class Schueler extends Person{
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

    public Schueler(long szvnr,String Vorname,String Nachname,Date Geburtsdatum,String email, String ort, String strasse, int hnr, int plz, boolean eigenberechtigt, int katalognummer, Date eintrittsdatum){
        this.setSzvnr(szvnr);
        this.setVorname(Vorname);
        this.setNachname(Nachname);
        this.setGeburtsdatum(Geburtsdatum);
        this.setEmail(email);
        this.setWohnort(new Adresse(ort, strasse, hnr, plz));
        this.eigenberechtigt=eigenberechtigt;
        this.eintrittsdatum=eintrittsdatum;
        this.katalognummer=katalognummer;
    }
}
