package de.bht.programming1.exercise08;

public class Student extends Person {

    protected String matrikelnummer;

    public Student(String vorname, String nachname, int geburtsjahr, String matrikelnummer) {
        super(vorname, nachname, geburtsjahr);
        this.matrikelnummer = matrikelnummer;
    }

    public Student(Student other) {
        this(other.VORNAME, other.nachname, other.GEBURTSJAHR, other.matrikelnummer);
    }

    public String getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(String matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return matrikelnummer.equals(student.matrikelnummer);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + matrikelnummer.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrikelnummer='" + matrikelnummer + '\'' +
                '}';
    }
}
