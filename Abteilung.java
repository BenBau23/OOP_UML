import java.util.ArrayList;
import java.util.List;

public class Abteilung {
    private String Kuerzel;
    private String Name;
    private List<Schueler> Schueler = new ArrayList();
    private Lehrer Abteilungsvorstand;
    private List<Klasse> Klassen = new ArrayList();

    public String getKuerzel() {
        return Kuerzel;
    }

    public void setKuerzel(String k) {
        Kuerzel = k;
    }

    public String getName() {
        return Name;
    }

    public void setName(String n) {
        Name = n;
    }

    public List<Schueler> getSchueler() {
        return Schueler;
    }

    public void setSchueler(ArrayList s) {
        Schueler = s;
    }

    public Abteilung (String Name, String Kuerzel){
        this.Name=Name;
        this.Kuerzel=Kuerzel;
    }

    public void setAbteilungsvorstand(Lehrer abteilungsvorstand) {
        this.Abteilungsvorstand = abteilungsvorstand;
    }
}
