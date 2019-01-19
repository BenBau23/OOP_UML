import java.util.Date;

public class NichtLehrpersonal extends Mitarbeiter {
    public NichtLehrpersonal(long szvnr,String Vorname,String Nachname,Date Geburtsdatum,String email){
        new Mitarbeiter(szvnr, Vorname, Nachname, Geburtsdatum, email);

    }
}
