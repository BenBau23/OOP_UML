import java.util.Date;

public class Mitarbeiter extends Person{
    private static int anzahl;

    public int getAnzahl() {
        return anzahl;
    }

    public Mitarbeiter (long szvnr,String Vorname,String Nachname,Date Geburtsdatum,String email){
        this.szvnr=szvnr;
        this.Vorname=Vorname;
        this.Nachname=Nachname;
        this.Geburtsdatum=Geburtsdatum;
        this.email=email;
        anzahl++;
    }
    public Mitarbeiter(){
        anzahl++;
    }
}
