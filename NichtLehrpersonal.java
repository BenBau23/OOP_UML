import java.util.Date;

public class NichtLehrpersonal extends Mitarbeiter {
    public NichtLehrpersonal(long szvnr,String Vorname,String Nachname,Date Geburtsdatum,String email, String ort, String strasse, int hnr, int plz){
        this.setSzvnr(szvnr);
        this.setVorname(Vorname);
        this.setNachname(Nachname);
        this.setGeburtsdatum(Geburtsdatum);
        this.setEmail(email);
        this.setWohnort(new Adresse(ort, strasse, hnr, plz));
    }
}
