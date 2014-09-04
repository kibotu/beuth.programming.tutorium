package de.bht.programming1.exercise10;

import java.io.PrintWriter;

public class ZeitDemo {

    public static PrintWriter cout = new PrintWriter(System.out, true);

    public static void main(String[] args) {

        /** test create time **/
        Zeit zeit = new Zeit(18, 4, 32);
        cout.println("Zeit1: " + zeit);
        Zeit zeit2 = new Zeit(0, 32, 0);
        cout.println("Zeit2: " + zeit2);

        /** test addition **/
        zeit2.add(zeit);
        cout.println("Zeit2 + Zeit1: " + zeit2);
        zeit2.add(90);
        cout.println("Zeit2 + 90s: " + zeit2);

        /** test substract **/
        zeit2.substract(zeit);
        cout.println("Zeit2 - Zeit1: " + zeit2);
        zeit2.substract(90);
        cout.println("Zeit2 - 90s: " + zeit2);
    }
}