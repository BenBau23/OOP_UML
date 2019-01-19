public class Belegung {
    private int unterrichtsEinheit;
    private Unterrichtstag unterrichtstag;
    private Klasse klasse;
    private Lehrer lehrer;

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
        return klasse;
    }

    public Lehrer getLehrer () {
        return lehrer;
    }
}
