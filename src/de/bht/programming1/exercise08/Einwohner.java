package de.bht.programming1.exercise08;

public class Einwohner extends Person {

    protected Adresse adresse;

    public Einwohner(Person p, Adresse adresse) {
        super(p.VORNAME, p.nachname, p.GEBURTSJAHR);
        this.adresse = adresse;
    }

    public Einwohner(Einwohner other) {
        this(other, new Adresse(other.adresse));
    }

    public void umziehen(Adresse neueAdresse) {
        setAdresse(neueAdresse);
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Einwohner einwohner = (Einwohner) o;

        return adresse.equals(einwohner.adresse);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + adresse.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Einwohner{" +
                "adresse=" + adresse +
                '}';
    }
}
