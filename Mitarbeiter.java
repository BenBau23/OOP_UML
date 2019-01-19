import java.util.Date;

public class Mitarbeiter extends Person{
    private static int anzahl;

    public int getAnzahl() {
        return anzahl;
    }

    public Mitarbeiter(){
        anzahl++;
    }
}
