import java.util.ArrayList;
import java.util.List;
import java.util.Date;

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

    public void addPersonal(long szvnr, String vn, String nn, Date geb, String email){
        this.Personal.add(new NichtLehrpersonal(szvnr,vn,nn,geb,email));
    }

    public void setDirektor(Lehrer direktor) {
        this.direktor = direktor;
    }
}
