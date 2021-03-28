package domain;

public class Auto implements Driveable, Crashable, Loadable {
    private String soort;
    private int aantalWielen;
    private int aantalPersonen;
    private String brandstof;

    public Auto(String soort, int aantalWielen, int aantalPersonen, String brandstof) {
        setSoort(soort);
        setAantalWielen(aantalWielen);
        setAantalPersonen(aantalPersonen);
        setBrandstof(brandstof);
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

    public void setBrandstof(String brandstof) {
        this.brandstof = brandstof;
    }

    @Override
    public String start() {
        return "De auto vertrekt.";
    }

    @Override
    public String stop() {
        return "De auto stopt.";
    }

    @Override
    public String alert() {
        return "De auto toetert.";
    }

    @Override
    public String crash() {
        return "De auto crasht...";
    }

    @Override
    public String load(String item) {
        return "We laden " + item + " in.";
    }

    @Override
    public String loadBox() {
        return "Doos inladen";
    }
}
