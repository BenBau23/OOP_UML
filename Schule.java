public class Schule {
    private String Name;
    private long Schulkennzahl;
    private String Schultyp;
    private Adresse Standort;
    private Schueler Schulsprecher;
    private Abteilung Abteilungen[20];



    public Abteilung addAbteilung(String n, String kuerzel) {
        Abteilung abt;
        abt.setName(n);
        abt.setKuerzel(kuerzel);
        return abt;
    }
}
