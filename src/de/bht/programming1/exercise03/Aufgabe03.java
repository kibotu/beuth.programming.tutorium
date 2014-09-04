package de.bht.programming1.exercise03;

import pr1.qad.DirtyFileWriter;

import java.io.File;
import java.io.PrintWriter;

public class Aufgabe03 {

    public static final String FILEPATH = "assets/files/";
    public static final String FILENAME_INT_NUMBERS = "IntNumberFile.txt";
    public static final String FILENAME_MIXED_NUMBERS = "MixedNumberFile.txt";

    public static void main(String[] args) {

        // naively creating folder if not exist
        File f = new File(FILEPATH);
        f.mkdirs();

        writeIntNumberFile(FILEPATH + FILENAME_INT_NUMBERS, 10000);
        writeMixedNumberFile(FILEPATH + FILENAME_MIXED_NUMBERS, 10000, 9);
    }

    public static void writeIntNumberFile(String filename, int numberCount) {
        PrintWriter fout = new PrintWriter(new DirtyFileWriter(filename));
        for (int i = 1; i <= numberCount; i++) {
            fout.printf("%7d ", (int) (Math.random() * numberCount));
            // line break every 10 numbers
            if (i % 10 == 0) {
                fout.println();
            }
        }
        fout.close();
    }

    public static void writeMixedNumberFile(String filename, int numberCount, int width) {
        PrintWriter fout = new PrintWriter(new DirtyFileWriter(filename));
        for (int i = 1; i <= numberCount; i++) {
            // 50 int : 50 double numbers
            if (Math.random() < 0.5) {
                fout.printf("%" + width + ".2f ", (Math.random() * numberCount));
            } else {
                fout.printf("%" + width + "d ", (int) (Math.random() * numberCount));
            }
            // line break each 10 numbers
            if (i % 10 == 0) {
                fout.println();
            }
        }
        fout.close();
    }
}
