package de.bht.programming1.exercise05;

import lernhilfe.v2010ws01.Person;
import lernhilfe.v2010ws01.Personenliste;
import pr1.qad.DirtyFileReader;
import pr1.qad.DirtyFileWriter;

import java.io.PrintWriter;
import java.util.Scanner;

public class MehrPersonen_ {

    public static final String FILEPATH = "assets/files/";
    public static final String FILENAME_PERSON_LIST = "listen/personenliste.txt";

    public static void main(String[] args) {
        testAusgabe();
//        testEinlesen();
    }

    public static Personenliste createPersonenliste(String filename) {
        Scanner fin = new Scanner(new DirtyFileReader(filename));
        fin.close();
        return readPersonenliste(fin);
    }

    public static Personenliste createPersonenliste(Scanner in) {
        return readPersonenliste(in);
    }

    public static Person createPerson(Scanner in) {
        return readPersonenliste(in).get(0);
    }

    public static void printPersonliste(String headerline, Personenliste liste, PrintWriter out) {
        printList(liste, out);
    }

    /**
     * test-Methode zum einlesen einer Datei und Ausgabe auf der Konsole
     */
    public static void testEinlesen() {
        Scanner fin = new Scanner(new DirtyFileReader(FILEPATH + FILENAME_PERSON_LIST));
        // freundeliste wird erstellt durch 'readPersonenListe(fin)'
        Personenliste freunde = readPersonenliste(fin);
        // Ausgabe der Freundesliste auf der Konsole
        printList(freunde, new PrintWriter(System.out, true));
        // freigeben der Datei
        fin.close();
    }

    /**
     * test-Methode zur Ausgabe einer Freundesliste in eine Datei und auf der Konsole
     */
    public static void testAusgabe() {
        PrintWriter fout = new PrintWriter(new DirtyFileWriter(FILEPATH + FILENAME_PERSON_LIST));
        // Konsolenausgabe
        PrintWriter cout = new PrintWriter(System.out, true);
        // Erstellen der Freundesliste
        Personenliste freunde = createList();
        // Ausgabe auf der Konsole
        printList(freunde, cout);
        // Ausgabe in der Datei
        printList(freunde, fout);
        // freigeben der Datei
        fout.close();
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

    /**
     * Gibt eine Liste mit Hilfe des PrintWriters aus
     *
     * @param liste
     * @param out
     */
    public static void printList(Personenliste liste, PrintWriter out) {
        // normalerweise prüft man noch, ob die übergebenen Parameter 'null' sind, dazu mehr bei Exceptions
//        if (liste == null) {
//            throw new NullPointerException("'liste' must not be 'null'");
//        }
//        if (out == null) {
//          throw new NullPointerException("'out' must not be 'null'");
//        }

        // fängt bei 0ten Element in der Personenliste an und durchläuft sie bis zu dem letzten Element
        for (int i = 0; i < liste.size(); i++) {
            out.println(liste.get(i));
        }

        /*
         * 1. alternative: While-Schleife:
         *
         * int i = 0; while(i < liste.size()) { out.println(liste.get(i)); i++;
         * }
         */

        /*
         * 2. alternative: Do-While-Schleife:
         *
         * int i = 0; do { out.println(liste.get(i)); i++; }while(i <
         * liste.size());
         */

        /*
         * 3. alternative: 'For-each'-Schleife:
         *
         * for(Person person: liste) { out.println(person); }
         */
    }

    public static Personenliste readPersonenliste(Scanner sin) {
//        if (sin == null) {
//            throw new NullPointerException("'sin' must not be 'null'");
//        }

        Personenliste list = new Personenliste();
        // führe die Schleife aus, solange bis keine weiteren Zeilen in der Datei sind
        while (sin.hasNextLine()) {
            /*
             * hinzufügen einer Person pro Zeile parsePerson-Methode kümmert
             * sich darum, das die Person korrekt erzeugt wird sollte in einer
             * Zeile ein fehler auftreten, so wird mit der nächsten Zeile
             * fortgeführt
             */
            list.add(parsePerson(new Scanner(sin.nextLine())));
        }
        return list;
    }

    /**
     * Zergliedern (parsing) der Zeile zu einer Person
     *
     * @param in Scanner
     * @return Person
     */
    public static Person parsePerson(Scanner in) {

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
