package de.bht.programming1.exercise05;

import lernhilfe.v2010ws01.Person;
import lernhilfe.v2010ws01.Personenliste;
import pr1.qad.DirtyFileReader;
import pr1.qad.DirtyFileWriter;

import java.io.PrintWriter;
import java.util.Scanner;

public class MehrPersonen {

    public static final String FILEPATH = "assets/files/";
    public static final String FILENAME_PERSON_LIST = "listen/personenliste.txt";

    public static void main(String[] args) {
        testAusgabe();
        System.out.println();
        testEinlesen();
    }

    /**
     * test-Methode zur Ausgabe einer Freundesliste in eine Datei und auf der Konsole
     */
    public static void testAusgabe() {

        // Konsolen ausgabe
        PrintWriter cout = new PrintWriter(System.out, true);

        // Datei ausgabe
        PrintWriter fout = new PrintWriter(new DirtyFileWriter(FILEPATH + FILENAME_PERSON_LIST));

        // Erstellen der Freundesliste
        Personenliste freunde = createList();

        // Ausgabe auf der Konsole
        printPersonenliste("Konsole: Freunde", freunde, cout);

        // Ausgabe in der Datei
        printPersonenliste("Datei: Freunde", freunde, fout);

        // freigeben der Datei
        fout.close();
    }

    /**
     * test-Methode zum einlesen einer Datei und Ausgabe auf der Konsole
     */
    public static void testEinlesen() {

        // öffnen der datei
        Scanner fin = new Scanner(new DirtyFileReader(FILEPATH + FILENAME_PERSON_LIST));

        // freundeliste wird erstellt durch 'readPersonenListe(fin)'
        Personenliste freunde = createPersonenliste(fin);

        // Ausgabe der Freundesliste auf der Konsole
        printPersonenliste("Datei auf Konsole: ", freunde, new PrintWriter(System.out, true));

        // freigeben der Datei
        fin.close();
    }

    public static void printPersonenliste(String headerline, Personenliste liste, PrintWriter out) {
        out.println(headerline);
        for (Person p : liste) {
            out.println(p);
        }
    }

    /**
     * Erstellt eine Liste mit Person Objekten
     *
     * @return liste
     */
    public static Personenliste createList() {

        Personenliste liste = new Personenliste();

        Person person = new Person("Kurt", "Bangert", 1988);
        liste.add(person);

        /** kurzschreibweise für das hinzufügen einer person zur liste **/
        liste.add(new Person("Gerhard", "Ackermann", 1956));
        liste.add(new Person("Peter", "Arnke", 1977));
        liste.add(new Person("Peter", "Bartsch", 1954));
        liste.add(new Person("Reinhard", "Barrabas", 1989));
        liste.add(new Person("Christopher", "Bode", 1956));

        // gibt die liste zurück
        return liste;
    }

    public static Personenliste createPersonenliste(String filename) {
        Scanner fin = new Scanner(new DirtyFileReader(filename));
        fin.close();
        return createPersonenliste(fin);
    }

    public static Personenliste createPersonenliste(Scanner sin) {
        Personenliste list = new Personenliste();
        // führe die Schleife aus, solange bis keine weiteren Zeilen in der Datei sind
        while (sin.hasNextLine()) {
            // hinzufügen einer Person pro Zeile parsePerson-Methode kümmert
            // sich darum, das die Person korrekt erzeugt wird; sollte in einer
            // Zeile ein fehler auftreten, so wird mit der nächsten Zeile
            // fortgeführt
            list.add(createPerson(new Scanner(sin.nextLine())));
        }
        return list;
    }

    /**
     * Zergliedern (parsing) der Zeile zu einer Person
     *
     * @param in Scanner
     * @return Person
     */
    private static Person createPerson(Scanner in) {

        String vorname = "";
        String nachname = "";
        int geburtsjahr = 0;

        // vorname
        if (in.hasNext()) {
            vorname = in.next();
        }
        // nachname
        if (in.hasNext()) {
            nachname = in.next();
            // Komma am Ende entfernen
            nachname = nachname.substring(0, nachname.length() - 1);
        }
        // geb. (brauchen wir nicht, daher springen wir ein Element weiter durch '.next()'
        if (in.hasNext()) {
            in.next(); // geb.
        }
        // geburtsjahr (ist ein integer)
        if (in.hasNextInt()) {
            geburtsjahr = in.nextInt();
        }
        // Rückgabe der neu erstellten Person
        return new Person(vorname, nachname, geburtsjahr);
    }
}
