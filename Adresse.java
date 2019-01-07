public class Adresse {
    private String ort;
    private String strasse;
    private int hausnummer;
    private int plz;

    public int getHausnummer() {
        return hausnummer;
    }

    public int getPlz() {
        return plz;
    }

    public String getOrt() {
        return ort;
    }

    public String getStrasse() {
        return strasse;
    }
    public void printAdresse(){
    System.out.println("Ort: "+ort);
    System.out.println("Strasse: "+strasse);
    System.out.println("Hausnummer: "+hausnummer);
    System.out.println("PLZ: "+plz);
    }
}
