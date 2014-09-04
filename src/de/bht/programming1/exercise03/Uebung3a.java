package de.bht.programming1.exercise03;

import java.io.PrintWriter;

public class Uebung3a {

    public static final PrintWriter cout = new PrintWriter(System.out, true);

    public static void main(String[] args) {
        test3a();
        test3b();
    }

    public static void test3a() {
        float x = 1;
        float y = 1;
        float a = 1;
        float b = 1;
        float c = 1;
        cout.println("3.a.1.1: 7^5 = " + Math.pow(7, 5));
        cout.println("3.a.1.2: 7^(5+3) = " + Math.pow(7, (5 + 3)));
        cout.println("3.a.1.3: 7^(5+9^4) = " + Math.pow(7, 5 + Math.pow(9, 4)));
        cout.println("3.a.1.4: (2+cos(PI/2))^2 + 3 / sin(0.32) = " + Math.pow((2 + Math.cos(Math.PI / 2)), 2) + 3 / Math.sin(0.32));
        cout.println("3.a.1.6: e^x + sin(x) + sqrt(x) = " + Math.pow(Math.E, x) + Math.sin(x) + Math.sqrt(x));
        cout.println("3.a.1.7: sin(x) = " + Math.sin(x));
        cout.println("3.a.1.8: e^(sin(sqrt(x)) = " + Math.pow(Math.E, Math.sin(Math.sqrt(x))));
        cout.println("3.a.1.9: max(x,y) + max(a,b) = " + Math.max(x, y) + Math.max(a, b));
        cout.println("3.a.1.10: max(a,b,c) = " + Math.max(a, Math.max(b, c)));
    }

    public static void test3b() {
        cout.println("maxVon(3,5) = " + maxVon(3,5));
        cout.println("hoch3Von(2) = " + hoch3Von(2));
        cout.println("istGroesser5(10) = " + istGroesser5(10));
        cout.println("istGroesser5(5) = " + istGroesser5(5));
        cout.println("istGleich5(5.0) = " + istGleich5(5.0));
    }

    public static int maxVon(int i1, int i2) {
        return i1 >= i2 ? i1 : i2; // oder Math.max(i1,i2);
    }

    public static double hoch3Von(double basis) {
        return basis * basis * basis; // oder Math.pow(basis, 3);
    }

    public static boolean istGroesser5(int zahl) {
        return zahl > 5;
    }

    public static boolean istGroesser5(double zahl) {
        return Double.compare(zahl,5) > 0;
    }

    public static boolean istGleich5(double zahl) {

        // return zahl == 5; Fehlerquelle: Prezisionsfehler, besser :

        final double EPSILON = 1E-5;
        return Math.abs(zahl - 5) < EPSILON;
    }
}