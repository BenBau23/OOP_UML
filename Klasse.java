import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Klasse {
    private String bezeichnung;
    private int schulstufe;
    private Schueler klassensprecher;
    private List<Schueler> Schueler = new ArrayList();

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String b) {
        bezeichnung = b;
    }

    public int getSchulstufe() {
        return schulstufe;
    }

    public void setSchulstufe(int s) {
        schulstufe = s;
    }

    public float getDurchschnittsalter(){
        for(Schueler k: Schueler)
        {
            int y;
            Date d;
            d = k.getGeburtsdatum();
            y = d.getYear() + 1900;
        }

    }

    public boolean setKlassensprecher(Schueler schueler) {
        klassensprecher = schueler;
    }

    public void addSchueler(long szvnr, String Vorname, String Nachname, Date Geburtsdatum, String email, String ort, String strasse, int hnr, int plz, boolean eigenberechtigt, int katalognummer, Date eintrittsdatum){
        this.Schueler.add(new Schueler(szvnr,Vorname,Nachname,Geburtsdatum,email,ort,strasse,hnr,plz,eigenberechtigt,katalognummer,eintrittsdatum));
    }

    /*public void exportStundenplan(){

    }*/
}
