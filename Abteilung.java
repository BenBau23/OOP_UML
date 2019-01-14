import java.util.ArrayList;

public class Abteilung {
    private String Kuerzel;
    private String Name;
    private ArrayList Schueler;

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

    public ArrayList getSchueler() {
        return Schueler;
    }

    public void setSchueler(ArrayList s) {
        Schueler = s;
    }
}
