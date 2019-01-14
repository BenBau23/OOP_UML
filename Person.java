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

    public void setGeburtsdatum(Date g) {
        Geburtsdatum = g;
    }

    public long getSzvnr() {
        return szvnr;
    }

    public void setSzvnr(long s) {
        szvnr = s;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        email = e;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String n) {
        Nachname = n;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String v) {
        Vorname = v;
    }
}
