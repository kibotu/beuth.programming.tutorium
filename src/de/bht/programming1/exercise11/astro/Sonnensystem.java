package de.bht.programming1.exercise11.astro;

import de.bht.programming1.exercise11.geometrie.PointF;

import java.io.PrintWriter;

public class Sonnensystem {

    private static final PrintWriter cout = new PrintWriter(System.out, true);

    public static void main(String[] args) {
        Sonne sun = new Sonne("Sonne", new PointF(0, 0), 1);
        Planet hugo = new Planet("Hugo", sun, 1020, 128, (int) 1e6);
        Planet otmar = new Planet("Otmar", sun, 3400, 333, (int) 1e7);
        Trabant luno = new Trabant("Luno", otmar, 98, 9, 6800);
        Trabant orba = new Trabant("Orba", otmar, 66, 11, 8900);

        int[] times = new int[]{0, 100, 1000, (int) 1e6, (int) 1e7, -100, -1000, (int) -1e6, (int) -1e7};

        for (int i = 0; i < times.length; ++i) {
            cout.println(times[i]);
            hugo.rotate(times[i]);
            cout.println(hugo);
            otmar.rotate(times[i]);
            cout.println(otmar);
            luno.rotate(times[i]);
            cout.println(luno);
            orba.rotate(times[i]);
            cout.println(orba);
            cout.println();
        }
    }
}
