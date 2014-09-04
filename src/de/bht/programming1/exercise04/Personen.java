package de.bht.programming1.exercise04;

import lernhilfe.v2010ws01.Adresse;
import lernhilfe.v2010ws01.Einwohner;
import lernhilfe.v2010ws01.Person;
import lernhilfe.v2010ws01.Personenliste;
import pr1.qad.DirtyFileWriter;

import java.io.PrintWriter;
import java.util.Scanner;

public class Personen {

    public static void main(String[] args) {
        aufgabeB();
        aufgabeC();
//        aufgabeE();
    }

    public static void aufgabeB() {
        PrintWriter out = new PrintWriter(System.out, true);

        // Aufgabe 4.b.1)
        Person max = new Person("Max", "Mustermann", 1962);
        out.println(max);
        Person erika = new Person("Erika", "Musterfrau", 1969);
        out.println(erika);
        Adresse anschriftM = new Adresse(12345, "Musterstadt", "Rosenweg", 11);
        out.println(anschriftM);
        Adresse anschriftE = new Adresse(54321, "Neustadt", "Hauptstra�e", 20);
        out.println(anschriftE);
        Einwohner buergerM = new Einwohner(max, anschriftM);
        out.println(buergerM);
        Einwohner buergerE = new Einwohner(erika, anschriftE);
        out.println(buergerE);
        out.println("*******************************************************");

        // Aufgabe 4.b.2)
        Person x = new Einwohner(max, null);
        out.println(x);
        // Einwohner ist Teilmenge von Person -> Aussage ist wahr
        // Person y = new Adresse(12345, "Musterstadt", "Rosenweg", 11);
        // Adresse ist keine Person -> Aussage falsch
        out.println("*******************************************************");

        // Aufgabe 4.b.3)
        PrintWriter fout = new PrintWriter(new DirtyFileWriter("./listen/einfache-objekte.txt"));
        out.println("Erika heiratet Max");
        max.heiraten(erika);
        out.println(max);
        out.println(erika);
        fout.println(max);
        fout.println(erika);

        out.println("Max zieht um zu Erika");
        buergerM.umziehenNach(anschriftE);
        out.println(buergerM);
        fout.println(buergerM);
        fout.flush();
        fout.close();
    }

    public static void aufgabeC() {
//			Aufgabe 4.c)
//			Sportsfreunde
        Person peter = new Person("Peter", "Müller", 1978);
        Person thomas = new Person("Thomas", "Schmidt", 1981);
        Person sabine = new Person("Sabine", "Maier", 1977);
        Person moritz = new Person("Moritz", "Schuhmann", 1984);
        Person kerstin = new Person("Kerstin", "Becker", 1979);
        Person paul = new Person("Paul", "Walter", 1987);
        Person martin = new Person("Martin", "Sommer", 1986);
        Person david = new Person("David", "Schulz", 1982);
        Person sandra = new Person("Sandra", "Fritsche", 1985);
        Person nina = new Person("Nina", "Baumann", 1983);

//			Kommilitonen
        Person lucas = new Person("Lucas", "Winter", 1984);
        Person daniel = new Person("Daniel", "Stain", 1981);
        Person dirk = new Person("Dirk", "Burkhard", 1977);
        Person laura = new Person("Laura", "Raimann", 1989);
        Person susanne = new Person("Susanne", "Hofmeister", 1980);
        Person fabian = new Person("Fabian", "Krämer", 1983);
        Person tim = new Person("Tim", "Kaufmann", 1985);
        Person kathi = new Person("Kathi", "Gerber", 1987);
        Person anika = new Person("Anika", "Rose", 1988);
        Person florian = new Person("Florian", "Mann", 1979);

//			Verwandte
        Person timo = new Person("Timo", "Schuster", 1982);
        Person sven = new Person("Sven", "Svenson", 1977);
        Person anna = new Person("Anna", "Schulz", 1983);
        Person birgit = new Person("Birgit", "Krämer", 1960);
        Person marcus = new Person("Marcus", "Neumann", 1975);
        Person andrea = new Person("Andrea", "Becker", 1984);
        Person michael = new Person("Michael", "Rose", 1973);
        Person kristina = new Person("Kristina", "Hausmann", 1981);
        Person christian = new Person("Christian", "Kunz", 1991);
        Person klaus = new Person("Klaus", "Krause", 1969);

        Personenliste sportfreunde = new Personenliste();
        sportfreunde.add(peter);
        sportfreunde.add(thomas);
        sportfreunde.add(sabine);
        sportfreunde.add(moritz);
        sportfreunde.add(kerstin);
        sportfreunde.add(paul);
        sportfreunde.add(martin);
        sportfreunde.add(david);
        sportfreunde.add(sandra);
        sportfreunde.add(nina);
        sportfreunde.add(andrea);
        sportfreunde.add(sven);
//			for(String s= 'peter'; s <= 'sven'; s++){
//				PrintWriter fout1 = new PrintWriter(new DirtyFileWriter ("./listen/all-basic-lists.txt"));
//				fout1.println(s);
//			}

        Personenliste kommilitonen = new Personenliste();
        kommilitonen.add(lucas);
        kommilitonen.add(daniel);
        kommilitonen.add(dirk);
        kommilitonen.add(laura);
        kommilitonen.add(susanne);
        kommilitonen.add(fabian);
        kommilitonen.add(tim);
        kommilitonen.add(kathi);
        kommilitonen.add(anika);
        kommilitonen.add(florian);
        kommilitonen.add(moritz);
        kommilitonen.add(sabine);
        kommilitonen.add(paul);

        Personenliste verwandte = new Personenliste();
        verwandte.add(timo);
        verwandte.add(sven);
        verwandte.add(anna);
        verwandte.add(birgit);
        verwandte.add(marcus);
        verwandte.add(andrea);
        verwandte.add(michael);
        verwandte.add(kristina);
        verwandte.add(christian);
        verwandte.add(klaus);
        verwandte.add(kerstin);
        verwandte.add(daniel);
        verwandte.add(paul);
    }

    public static void aufgabeE(Scanner in) {
//			alle Sportfreunde, die auch Kommilitonen sind
//			Personenliste sportfreunde= new Personenliste();
//			while(in.hasNext()){
//				sportfreunde.retainAll(kommilitonen(in));
//				for(){
//					PrintWriter fout = new PrintWriter(new DirtyFileWriter ("./listen/all-coplex-lists.txt"));
//					fout.println(s);
//				}
//			}
    }


}
