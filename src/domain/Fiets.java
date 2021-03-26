package domain;

public class Fiets implements Driveable, Crashable {
    private String soort;
    private int aantalWielen;
    private int aantalPersonen;
    private boolean heeftBel;

    public Fiets(String soort, int aantalWielen, int aantalPersonen, boolean heeftBel) {
        setSoort(soort);
        setAantalWielen(aantalWielen);
        setAantalPersonen(aantalPersonen);
        heeftBel(heeftBel);
    }

    public void setSoort(String naam) {
        this.soort = naam;
    }

    public void setAantalWielen(int aantalWielen) {
        this.aantalWielen = aantalWielen;
    }

    public void setAantalPersonen(int aantalPersonen) {
        this.aantalPersonen = aantalPersonen;
    }

    public void heeftBel(boolean heeftBel) {
        this.heeftBel = heeftBel;
    }

    @Override
    public String start() {
        return "De fietser begint te fietsen.";
    }

    @Override
    public String stop() {
        return "De fietser stopt met fietsen.";
    }

    @Override
    public String alert() {
        return "De fietser belt!";
    }

    @Override
    public String crash() {
        return "De fietser valt...";
    }
}
