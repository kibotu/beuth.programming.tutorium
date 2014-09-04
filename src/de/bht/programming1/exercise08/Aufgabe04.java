package de.bht.programming1.exercise08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

public class Aufgabe04 {

    public static final String FILEPATH = "assets/files/";
    public static final String FILENAME_ALL_BASIC_LISTS = "listen/all-basic-lists.txt";
    public static final String FILENAME_COMPLEX_LISTS = "listen/complex-lists.txt";

    public static final PrintWriter cout = new PrintWriter(System.out, true);

    public static void main(String[] args) {
        aufgabe4c();
        aufgabe4e();
    }

    public static void aufgabe4c() {

        PrintWriter fout = null;

        try {
            fout = new PrintWriter(new File(FILEPATH + FILENAME_ALL_BASIC_LISTS));

            // die Liste aller 10 Sportfreunde
            List<Person> sportFreunde = new LinkedList<Person>();
            sportFreunde.add(new Person("Kurt", "Bangert", 1988));
            sportFreunde.add(new Person("Peter", "Bartsch", 1954)); // auch verwandt
            sportFreunde.add(new Person("Reinhard", "Barrabas", 1989)); // auch kommilitone
            sportFreunde.add(new Person("Dirk-Rainer", "Blomeyer", 1966)); // auch komilitone
            // etc.

            // die Liste aller 10 Kommilitionen
            List<Person> komilitonen = new LinkedList<Person>();
            komilitonen.add(new Person("Gerhard", "Ackermann", 1956)); // auch verwandt
            komilitonen.add(new Person("Martin", "Behne", 1967));
            komilitonen.add(new Person("Dirk-Rainer", "Blomeyer", 1966)); // auch sportsfreund
            komilitonen.add(new Person("Reinhard", "Barrabas", 1989)); // auch sportsfreund
            // etc.

            // die Liste aller 10 Verwandten.
            List<Person> verwandte = new LinkedList<Person>();
            verwandte.add(new Person("Peter", "Arnke", 1977));
            verwandte.add(new Person("Jürgen", "Berger", 1988));
            verwandte.add(new Person("Stephan", "Braunfels", 1958));
            verwandte.add(new Person("Peter", "Bartsch", 1954)); // auch sportsfreund
            verwandte.add(new Person("Gerhard", "Ackermann", 1956));  // auch kommilitone
            // etc.

            // write sportsfreunde to file
            for (int i = 0; i < sportFreunde.size(); ++i) {
                fout.println(sportFreunde.get(i));
            }

            fout.println();

            // write kommilitonen to file
            for (Person p : komilitonen) {
                fout.println(p);
            }

            fout.println();

            // write verwandte to file
            for (Person p : verwandte) {
                fout.println(p);
            }
        } catch (Exception e) {

        } finally {
            fout.close();
        }
    }

    public static void aufgabe4e() {
        PrintWriter fout = null;

        try {
            fout = new PrintWriter(new File(FILEPATH + FILENAME_COMPLEX_LISTS));

            // die Liste aller 10 Sportfreunde
            List<Person> sportFreunde = new LinkedList<Person>();
            sportFreunde.add(new Person("Kurt", "Bangert", 1988));
            sportFreunde.add(new Person("Peter", "Bartsch", 1954)); // auch verwandt
            sportFreunde.add(new Person("Reinhard", "Barrabas", 1989)); // auch kommilitone
            sportFreunde.add(new Person("Dirk-Rainer", "Blomeyer", 1966)); // auch komilitone
            // etc.

            // die Liste aller 10 Kommilitionen
            List<Person> komilitonen = new LinkedList<Person>();
            komilitonen.add(new Person("Gerhard", "Ackermann", 1956)); // auch verwandt
            komilitonen.add(new Person("Martin", "Behne", 1967));
            komilitonen.add(new Person("Dirk-Rainer", "Blomeyer", 1966)); // auch sportsfreund
            komilitonen.add(new Person("Reinhard", "Barrabas", 1989)); // auch sportsfreund
            // etc.

            // die Liste aller 10 Verwandten.
            List<Person> verwandte = new LinkedList<Person>();
            verwandte.add(new Person("Peter", "Arnke", 1977));
            verwandte.add(new Person("Jürgen", "Berger", 1988));
            verwandte.add(new Person("Stephan", "Braunfels", 1958));
            verwandte.add(new Person("Peter", "Bartsch", 1954)); // auch sportsfreund
            verwandte.add(new Person("Gerhard", "Ackermann", 1956));  // auch kommilitone
            // etc.

            // aller Sportfreunde, die auch Kommilitonen sind
            List<Person> sportsFreundeUndKommilitonen = new LinkedList<Person>();
            sportsFreundeUndKommilitonen.addAll(sportFreunde);
            // Menge = Sportsfreunde und Kommilitonen
            sportsFreundeUndKommilitonen.retainAll(komilitonen);

            // aller Verwandten, die nicht Sportfreunde sind
            List<Person> verwandteUndKeineSportsfreunde = new LinkedList<Person>();
            verwandteUndKeineSportsfreunde.addAll(verwandte);
            // Menge = Verwandte und nicht Sportfreunde
            verwandteUndKeineSportsfreunde.removeAll(sportFreunde);

            // aller Verwandten und Kommilitonen
            List<Person> verwandteUndKommilitonen = new LinkedList<Person>();
            verwandteUndKommilitonen.addAll(verwandte);
            // keine doppelte, da Person, hash and equals ordentlich überschrieben!
            verwandteUndKommilitonen.addAll(komilitonen);

            // write sportsFreundeUndKommilitonen to file
            for (Person p : sportsFreundeUndKommilitonen) {
                fout.println(p);
            }

            fout.println();

            // write verwandteUndKeineSportsfreunde to file
            for (Person p : verwandteUndKeineSportsfreunde) {
                fout.println(p);
            }

            fout.println();

            // write verwandteUndKommilitonen to file
            for (Person p : verwandteUndKommilitonen) {
                fout.println(p);
            }

            // release file
            fout.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fout.close();
        }
    }
}
