package de.bht.programming1.exercise05;

import java.io.PrintWriter;
import java.util.Scanner;

final public class ScheifenTest {

    public static PrintWriter cout = new PrintWriter(System.out, true);

    public static void main(String[] args) {
        a();
        b();
        c();
        d();
        e();
        f();
        g();
    }

    public static void a() {
        int zaehler = 0;
        int n = 13;
        cout.println("Step Zaehler n");
        cout.println("_______________");
        cout.printf("%s %5d  %5d\n", "A", zaehler, n);
        while (n != 1) {
            cout.printf("%s %5d  %5d\n", "B", zaehler, n);
            if (n % 2 == 0) {
                n = n / 2;
                cout.printf("%s %5d  %5d\n", "C", zaehler, n);
            } else {
                cout.printf("%s %5d  %5d\n", "D", zaehler, n);
                n = 3 * n + 1;
            }
            cout.printf("%s %5d  %5d\n", "E", zaehler, n);
            cout.println("_______________");
            cout.println();
            zaehler = zaehler + 1;
            cout.printf("%s %5d  %5d\n", "A", zaehler, n);
        }
        cout.println("Ergebnis: " + zaehler);
    }

    public static void b() {
        int anna = 7;
        while (anna > 0) { // A
            cout.print(anna + " "); // B
            anna /= 2; // anna = anna / 2;
        }
        cout.println();
    }

    public static void c() {
        Scanner in = new Scanner(" hans28 susi 89 alfred 13gert magda_23 14 ENDE");
        while (in.hasNext()) {
            if (in.hasNextInt()) {
                cout.print(" -> " + in.nextInt());
                continue;
            }
            cout.print("\"" + in.next() + "\" ");
            cout.println();
        }
    }

    public static void d() {
        for (int celia = -3; celia < 5; celia += 2) {
            cout.print(2 * celia + 4 + " ");
        }
        cout.println();
    }

    public static void e() {
        for (int dora = 3; 3 * dora > -3; dora--) {
            cout.print(dora + " ");
        }
        cout.println();
    }

    public static void f() {
        final int MAX1 = 3;
        for (int i1 = 1; i1 <= MAX1; i1++) { // A
            for (int i2 = 1; i2 <= 2 * MAX1; i2++) { // B
                cout.print("*"); // C
                cout.println("C " + i1 + " " + i2);
            }
            cout.println();
        }

    }

    public static void g() {
        final int MAX2 = 5;
        for (int i1 = 1; i1 <= MAX2; i1++) {
            for (int i2 = 1; i2 <= i1; i2++) {
                cout.print("++");
                cout.println("C " + i1 + " " + i2);
            }
        }
        cout.println();
    }
}
