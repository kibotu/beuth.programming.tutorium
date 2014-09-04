package de.bht.programming1.exercise03;

import java.io.PrintWriter;

public class Hypothenuse {

    public static void main(String [] args) {
        Hypothenuse.testHypothenuse(7, 2, new PrintWriter(System.out, true));
    }

    public static double hypothenuse(double k1, double k2) {
        return Math.sqrt(k1 * k1 + k2 * k2);  // also Math.hypot(k1,k2);
    }

    public static void printHypothenuse(double k1, double k2, int width, int precision, PrintWriter out) {
        out.printf("%" + width + "." + precision + "f", hypothenuse(k1, 2));
    }

    public static void testHypothenuse(int width, int precision, PrintWriter out) {
        // cols title
        for (int i = 0; i <= 10; ++i) {
            out.printf("%" + width + "d", i);
        }
        // line break
        out.println();
        // first cols
        for (int y = 1; y <= 10; ++y) {
            // row title
            out.printf("%" + width + "d", y);
            // then rows
            for (int x = 1; x <= 10; ++x) {
                printHypothenuse(x, y, width, precision, out);
            }
            // line break each 10 values
            out.println();
        }
    }
}
