package de.bht.programming1.exercise02;

import java.io.PrintWriter;

public class SomeFunctions {

    public static PrintWriter out = new PrintWriter(System.out, true);

    public static void main(String[] args) {
        out.printf("Kreisumfang Kreis(r=1): %5.2f", kreisUmfang(1));
        out.printf("\nRechteckumfang Rechteck(a=2,b=3): %5.2f", rechteckUmfang(2, 3));
        out.printf("\nRechteckfläche Rechteck(a=2,b=3): %5.2f", rechteckFlaeche(2, 3));
    }

    public static double kreisUmfang(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double rechteckUmfang(double a, double b) {
        return 2 * (a + b);
    }

    public static double rechteckFlaeche(double a, double b) {
        return 2 * a * b;
    }
}
