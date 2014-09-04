package de.bht.programming1.exercise08;

public class Person {

    protected final String VORNAME;
    protected String nachname;
    protected final int GEBURTSJAHR;

    public Person(String vorname, String nachname, int geburtsjahr) {
        this.VORNAME = vorname;
        this.nachname = nachname;
        this.GEBURTSJAHR = geburtsjahr;
    }

    public Person(Person other) {
        this(other.VORNAME, other.nachname, other.GEBURTSJAHR);
    }

    public void heirate(Person other) {
        setNachname(other.nachname);
    }

    public String getVORNAME() {
        return VORNAME;
    }

    public int getGEBURTSJAHR() {
        return GEBURTSJAHR;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (GEBURTSJAHR != person.GEBURTSJAHR) return false;
        if (!VORNAME.equals(person.VORNAME)) return false;
        if (!nachname.equals(person.nachname)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = VORNAME.hashCode();
        result = 31 * result + nachname.hashCode();
        result = 31 * result + GEBURTSJAHR;
        return result;
    }

    @Override
    public String toString() {
        return VORNAME + " " + nachname + ", geb. " + GEBURTSJAHR;
    }
}
