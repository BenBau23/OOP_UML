import java.util.Date;

public class Person {
    protected long szvnr;
    protected String Vorname;
    protected String Nachname;
    protected Date Geburtsdatum;
    protected String email;

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

    public void Person(long szvnr, String Vorname, String Nachname, Date Geburtsdatum, String email){
        this.szvnr=szvnr;
        this.Vorname=Vorname;
        this.Nachname=Nachname;
        this.Geburtsdatum=Geburtsdatum;
        this.email=email;
    }
}
