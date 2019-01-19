public class Belegung {
    private int unterrichtsEinheit;
    private Unterrichtstag unterrichtstag;

    public Unterrichtstag getWochentag () {
        return unterrichtstag;
    }

    public void setUnterrichtstag(Unterrichtstag unterrichtstag) {
        this.unterrichtstag = unterrichtstag;
    }

    public static void main (String[] args) {
        Belegung montag = new Belegung(Unterrichtstag.MONTAG);
        Belegung dienstag = new Belegung(Unterrichtstag.DIENSTAG);
        Belegung mittwoch = new Belegung(Unterrichtstag.MITTWOCH);
        Belegung donnerstag = new Belegung(Unterrichtstag.DONNERSTAG);
        Belegung freitag = new Belegung(Unterrichtstag.FREITAG);
    }

    public Klasse getKlasse () {

    }

    public Lehrer getLehrer () {

    }
}
