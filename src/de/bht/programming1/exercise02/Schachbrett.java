package de.bht.programming1.exercise02;

import java.io.PrintWriter;

public class Schachbrett {

    public static void main(String[] args) {
        printSchachbrett();
        System.out.println();
        printSchachbrettReverse();
    }

    public static void printSchachbrett() {
        printSchachbrett(new PrintWriter(System.out, true));
    }

    public static void printSchachbrettReverse() {
        printSchachbrettReverse(new PrintWriter(System.out, true));
    }

    public static void printSchachbrettReverse(PrintWriter out) {
        for (char c = 'A'; c <= 'H'; ++c) {
            for (int i = 8; i >= 1; --i) {
                out.print(c + "" + i + " ");
            }
            out.println();
        }
    }

    public static void printSchachbrett(PrintWriter out) {
        for (char c = 'H'; c >= 'A'; --c) {
            for (int i = 1; i <= 8; ++i) {
                out.print(c + "" + i + " ");
            }
            out.println();
        }
    }
}
