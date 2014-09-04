package de.bht.programming1.exercise09;

import j.schimkat.lernhilfe.simpleDrawingFramework.userPort.AnimatedDrawingScript;
import j.schimkat.lernhilfe.simpleDrawingFramework.userPort.DrawingFramework;

public class Main {

    public static void main(String[] args) {
        AnimatedDrawingScript nonAliasingScript = new TestScript();
//        DrawingFramework.run(nonAliasingScript);
        nonAliasingScript = new KreisBewegung();
        DrawingFramework.run(nonAliasingScript);
    }
}