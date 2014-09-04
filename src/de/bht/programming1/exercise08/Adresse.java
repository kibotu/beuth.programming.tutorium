package de.bht.programming1.exercise08;

public class Adresse {

    protected String ort;
    protected int plz;
    protected String strasse;
    protected int hausnummer;

    public Adresse(String ort, int plz, String strasse, int hausnummer) {
        this.ort = ort;
        this.plz = plz;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
    }

    public Adresse(Adresse other) {
        this(other.ort, other.plz, other.strasse, other.hausnummer);
    }

    public String getOrt() {
        return ort;
    }

    public int getPlz() {
        return plz;
    }

    public String getStrasse() {
        return strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Adresse adresse = (Adresse) o;

        if (hausnummer != adresse.hausnummer) return false;
        if (plz != adresse.plz) return false;
        if (!ort.equals(adresse.ort)) return false;
        if (!strasse.equals(adresse.strasse)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ort.hashCode();
        result = 31 * result + plz;
        result = 31 * result + strasse.hashCode();
        result = 31 * result + hausnummer;
        return result;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "ort='" + ort + '\'' +
                ", plz=" + plz +
                ", strasse='" + strasse + '\'' +
                ", hausnummer=" + hausnummer +
                '}';
    }
}
