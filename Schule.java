import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class Schule {
    private String Name;
    private long Schulkennzahl;
    private String Schultyp;
    private Adresse Standort;
    private Schueler Schulsprecher;
    private List<Abteilung> Abteilungen = new ArrayList();
    private List<NichtLehrpersonal> Personal = new ArrayList();
    private Lehrer direktor;



    public void addAbteilung(String n, String kuerzel) {
        this.Abteilungen.add(new Abteilung(n,kuerzel));
    }

    public void addPersonal(long szvnr, String vn, String nn, Calendar geb, String email, String ort, String strasse, int hnr, int plz){
        this.Personal.add(new NichtLehrpersonal(szvnr,vn,nn,geb,email,ort,strasse,hnr,plz));
    }

    public void setDirektor(Lehrer direktor) {
        this.direktor = direktor;
    }

    public List<Schueler> getSchueler(){
        List<Schueler> s = new ArrayList();
        for(Abteilung k:Abteilungen){
            //s.add(k.getSchueler());
        }
        return s;
    }
}
