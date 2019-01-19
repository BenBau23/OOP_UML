import java.util.Date;

public class NichtLehrpersonal extends Mitarbeiter {
    public NichtLehrpersonal(long szvnr,String Vorname,String Nachname,Date Geburtsdatum,String email){
        this.szvnr=szvnr;
        this.Vorname=Vorname;
        this.Nachname=Nachname;
        this.Geburtsdatum=Geburtsdatum;
        this.email=email;
    }
}
