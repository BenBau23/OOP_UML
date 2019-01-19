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
        Unterrichtstag montag = new Unterrichtstag(Unterrichtstag.MONTAG);
        Unterrichtstag dienstag = new Unterrichtstag(Unterrichtstag.DIENSTAG);
        Unterrichtstag mittwoch = new Unterrichtstag(Unterrichtstag.MITTWOCH);
        Unterrichtstag donnerstag = new Unterrichtstag(Unterrichtstag.DONNERSTAG);
        Unterrichtstag freitag = new Unterrichtstag(Unterrichtstag.FREITAG);
    }

    public Klasse getKlasse () {

    }

    public Lehrer getLehrer () {

    }
}
