public class Lehrer extends Person{
    private String kuerzel;
    private Schule direktor;
    private Abteilung av;

    public String getKuerzel() {
        return kuerzel;
    }

    public void setKuerzel(String k) {
        kuerzel = k;
    }

    //public void exportStundenplan()  not working
}
