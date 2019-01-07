import java.util.Date;

public class Person {
    private long szvnr;
    private String Vorname;
    private String Nachname;
    private Date Geburtsdatum;
    private String email;

    public Date getGeburtsdatum() {
        return Geburtsdatum;
    }

    public long getSzvnr() {
        return szvnr;
    }

    public String getEmail() {
        return email;
    }

    public String getNachname() {
        return Nachname;
    }

    public String getVorname() {
        return Vorname;
    }
}
