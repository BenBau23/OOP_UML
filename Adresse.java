public class Adresse {
    private String ort;
    private String strasse;
    private int hausnummer;
    private int plz;

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int h) {
        hausnummer = h;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int p) {
        plz = p;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String o) {
        ort = o;
}

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String s) {
        strasse = s;
    }

    public void printAdresse(){
        System.out.println("Ort: "+ort);
        System.out.println("Strasse: "+strasse);
        System.out.println("Hausnummer: "+hausnummer);
        System.out.println("PLZ: "+plz);
    }

    public Adresse(String Ort, String Strasse, int hnr, int plz){
        this.hausnummer=hnr;
        this.ort=Ort;
        this.plz=plz;
        this.strasse=Strasse;
    }
}
