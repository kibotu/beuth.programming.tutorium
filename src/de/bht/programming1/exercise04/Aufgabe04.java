package de.bht.programming1.exercise04;

import lernhilfe.v2010ws01.Adresse;
import lernhilfe.v2010ws01.Einwohner;
import lernhilfe.v2010ws01.Person;
import lernhilfe.v2010ws01.Personenliste;
import pr1.qad.DirtyFileWriter;

import java.io.File;
import java.io.PrintWriter;

public class Aufgabe04 {

    public static final String FILEPATH = "assets/files/listen/";
    public static final String FILENAME_EINFACHE_OBJEKTE = "einfache-objekte.txt";
    public static final String FILENAME_ALL_BASIC_LISTS = "all-basic-lists.txt";
    public static final String FILENAME_COMPLEX_LISTS = "complex-lists.txt";

    public static final PrintWriter cout = new PrintWriter(System.out, true);

    public static void main(String[] args) {
        // naively creating folder if not exist
        File f = new File(FILEPATH);
        f.mkdirs();

        aufgabeb1();
        aufgabeb2();
        aufgabeb3();
        aufgabe4c();
        aufgabe4e();
    }

    public static void aufgabeb1() {
        Person person1 = new Person("Kurt", "Bangert", 1988);
        Person person2 = new Person("Gerhard", "Ackermann", 1956);

        Adresse adresse1 = new Adresse(99553, "Musterort", "Musterstraße", 1);
        Adresse adresse2 = new Adresse(58821, "Musterdort", "Musterstraße", 2);

        Einwohner einwohner1 = new Einwohner(person1, adresse1);
        Einwohner einwohner2 = new Einwohner(person2, adresse2);

        cout.println(person1);
        cout.println(person2);
        cout.println(adresse1);
        cout.println(adresse2);
        cout.println(einwohner1);
        cout.println(einwohner2);
    }

    public static void aufgabeb2() {
        Person person1 = new Person("Kurt", "Bangert", 1988);
        Adresse adresse1 = new Adresse(99553, "Musterort", "Musterstraße", 1);
        Einwohner einwohner1 = new Einwohner(person1, adresse1);

        // Ein Einwohnerobjekt kann auch als Personobjekt verwendet werden.
        // stimmt, weil Einwohner extends Person
        Einwohner einwohner = new Einwohner(einwohner1, adresse1);

        // Ein Adresseobjekt kann auch als Personobjekt verwendet werden.
        // geht nicht, weil Adresse-Klasse, nicht von Personenklasse erbt
        // einwohner = new Einwohner(addresse1, adresse1);
    }

    public static void aufgabeb3() {

        PrintWriter fout = new PrintWriter(new DirtyFileWriter(FILEPATH + FILENAME_EINFACHE_OBJEKTE), true);

        fout.println("vor Hochzeit");

        // person 1
        Person person1 = new Person("Kurt", "Bangert", 1988);
        Adresse adresse1 = new Adresse(99553, "Berlin", "Berliner Straße", 20);
        Einwohner einwohner1 = new Einwohner(person1, adresse1);
        fout.println(einwohner1);

        // person 2
        Person person2 = new Person("Anna", "Schmidt", 87);
        Adresse adresse2 = new Adresse(58821, "Nürnberg", "Nürnberger Straße", 2);
        Einwohner einwohner2 = new Einwohner(person2, adresse2);
        fout.println(einwohner2);

        // hochzeit
        einwohner1.heiraten(einwohner2);

        fout.println("\nnach Hochzeit");
        fout.println(einwohner1);
        fout.println(einwohner2);

        // umzug
        einwohner2.umziehenNach(einwohner1.getAdresse());

        fout.println("\nnach Hochzeit");
        fout.println(einwohner1);
        fout.println(einwohner2);

        // release file
        fout.close();
    }

    public static void aufgabe4c() {

        PrintWriter fout = new PrintWriter(new DirtyFileWriter(FILEPATH + FILENAME_ALL_BASIC_LISTS), true);

        // die Liste aller 10 Sportfreunde
        Personenliste sportFreunde = new Personenliste();
        sportFreunde.add(new Person("Kurt", "Bangert", 1988));
        sportFreunde.add(new Person("Peter", "Bartsch", 1954)); // auch verwandt
        sportFreunde.add(new Person("Reinhard", "Barrabas", 1989)); // auch kommilitone
        sportFreunde.add(new Person("Dirk-Rainer", "Blomeyer", 1966)); // auch komilitone
        // etc.

        // die Liste aller 10 Kommilitionen
        Personenliste komilitonen = new Personenliste();
        komilitonen.add(new Person("Gerhard", "Ackermann", 1956)); // auch verwandt
        komilitonen.add(new Person("Martin", "Behne", 1967));
        komilitonen.add(new Person("Dirk-Rainer", "Blomeyer", 1966)); // auch sportsfreund
        komilitonen.add(new Person("Reinhard", "Barrabas", 1989)); // auch sportsfreund
        // etc.

        // die Liste aller 10 Verwandten.
        Personenliste verwandte = new Personenliste();
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

        // release file
        fout.close();
    }

    public static void aufgabe4e() {
        PrintWriter fout = new PrintWriter(new DirtyFileWriter(FILEPATH + FILENAME_COMPLEX_LISTS), true);

        // die Liste aller 10 Sportfreunde
        Personenliste sportFreunde = new Personenliste();
        sportFreunde.add(new Person("Kurt", "Bangert", 1988));
        sportFreunde.add(new Person("Peter", "Bartsch", 1954)); // auch verwandt
        sportFreunde.add(new Person("Reinhard", "Barrabas", 1989)); // auch kommilitone
        sportFreunde.add(new Person("Dirk-Rainer", "Blomeyer", 1966)); // auch komilitone
        // etc.

        // die Liste aller 10 Kommilitionen
        Personenliste komilitonen = new Personenliste();
        komilitonen.add(new Person("Gerhard", "Ackermann", 1956)); // auch verwandt
        komilitonen.add(new Person("Martin", "Behne", 1967));
        komilitonen.add(new Person("Dirk-Rainer", "Blomeyer", 1966)); // auch sportsfreund
        komilitonen.add(new Person("Reinhard", "Barrabas", 1989)); // auch sportsfreund
        // etc.

        // die Liste aller 10 Verwandten.
        Personenliste verwandte = new Personenliste();
        verwandte.add(new Person("Peter", "Arnke", 1977));
        verwandte.add(new Person("Jürgen", "Berger", 1988));
        verwandte.add(new Person("Stephan", "Braunfels", 1958));
        verwandte.add(new Person("Peter", "Bartsch", 1954)); // auch sportsfreund
        verwandte.add(new Person("Gerhard", "Ackermann", 1956));  // auch kommilitone
        // etc.

        // aller Sportfreunde, die auch Kommilitonen sind
        Personenliste sportsFreundeUndKommilitonen = new Personenliste();
        sportsFreundeUndKommilitonen.addAll(sportFreunde);
        // Menge = Sportsfreunde und Kommilitonen
        sportsFreundeUndKommilitonen.retainAll(komilitonen);

        // aller Verwandten, die nicht Sportfreunde sind
        Personenliste verwandteUndKeineSportsfreunde = new Personenliste();
        verwandteUndKeineSportsfreunde.addAll(verwandte);
        // Menge = Verwandte und nicht Sportfreunde
        verwandteUndKeineSportsfreunde.removeAll(sportFreunde);

        // aller Verwandten und Kommilitonen
        Personenliste verwandteUndKommilitonen = new Personenliste();
        verwandteUndKommilitonen.addAll(verwandte);
        // doppelte, da Person, hash and equals nicht ordentlich überschreibt!
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
    }
}
