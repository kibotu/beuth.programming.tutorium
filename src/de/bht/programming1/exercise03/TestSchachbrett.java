package de.bht.programming1.exercise03;

import de.bht.programming1.exercise02.Schachbrett;
import pr1.qad.DirtyFileWriter;

import java.io.File;
import java.io.PrintWriter;

public class TestSchachbrett {

    public static final String FILEPATH = "assets/files/";
    public static final String FILENAME = "schachbrett.txt";

    public static void main(String[] args) {
        // naively creating folder if not exist
        File f = new File(FILEPATH);
        f.mkdirs();
        printSchachbrett(FILEPATH + FILENAME, false);
    }

    public static void printSchachbrett(String filename, boolean isReverse) {
        // wrap PrintWriter around DirtyFileWriter
        PrintWriter out = new PrintWriter(new DirtyFileWriter(filename), true);
        if (isReverse) {
            Schachbrett.printSchachbrett(out);
        } else {
            Schachbrett.printSchachbrettReverse(out);
        }
        out.close();
    }
}
