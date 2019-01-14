import java.util.ArrayList;
import java.util.List;

public class Schule {
    private String Name;
    private long Schulkennzahl;
    private String Schultyp;
    private Adresse Standort;
    private Schueler Schulsprecher;
    private List Abteilungen = new ArrayList();



    public Abteilung addAbteilung(String n, String kuerzel) {
        Abteilung abteilung = new Abteilung(n,kuerzel);
        return abteilung;
    }
}
