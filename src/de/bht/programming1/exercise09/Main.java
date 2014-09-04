package de.bht.programming1.exercise09;

import j.schimkat.lernhilfe.simpleDrawingFramework.userPort.DrawingFramework;

public class Main {

    public static void main(String[] args) {

        // drawing framework can run only one AnimatedDrawingScript at a time
//        DrawingFramework.run(new TestScript());
        DrawingFramework.run(new KreisBewegung());
    }
}