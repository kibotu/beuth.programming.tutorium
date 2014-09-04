package de.bht.programming1.exercise03;

import java.io.PrintWriter;

public class Uebung3c {

    static PrintWriter cout = new PrintWriter(System.out, true);

    public static void main(String[] args) {

        for (int i = 0; i < 16; ++i) {
            cout.println("[Org] Quadratwurzel von " + i + " ist annähernd " + Math.sqrt(i));
            cout.println("Quadratwurzel von " + i + " ist annähernd " + sqrt(i));
        }

        cout.println(maxIntValue());
        cout.println(Integer.MAX_VALUE);
    }

    /**
     * Square root approximation.
     *
     * @param x - a value
     * @return Returns the positive square root of a double value.
     */
    public static double sqrt(int x) {
        if (x == 0) return 0;
        if (x < 0) return Double.NaN;
        double root = x;
        double a = root;
        do {
            a = root;
            root = (a + x / a) / 2;
        } while (a - root > 0.0000001);
        return root;
    }

    public static int maxIntValue() {
        return (int) (Math.pow(2, 31) - 1);
    }

    /**
     * Fast approximation of 1.0 / sqrt(x) after John Carmack (Quake 3)
     * <p>
     * See <a href="http://www.beyond3d.com/content/articles/8/">http://www.beyond3d.com/content/articles/8/</a>
     *
     * @param x Positive value to estimate inverse of square root of
     * @return Approximately 1.0 / sqrt(x)
     */
    public static double invSqrt(double x) {
        double xhalf = 0.5 * x;
        long i = Double.doubleToRawLongBits(x);
        i = 0x5FE6EB50C7B537AAL - (i >> 1);   // original: 0x5f3759df;
        x = Double.longBitsToDouble(i);
        x = x * (1.5 - xhalf * x * x);
        return x;
    }
}
