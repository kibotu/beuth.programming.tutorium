package de.bht.programming1.exercise09;


import de.bht.programming1.exercise07.drawable.Point;
import j.schimkat.lernhilfe.simpleDrawingFramework.userPort.AnimatedDrawingScript;
import j.schimkat.lernhilfe.simpleDrawingFramework.userPort.AnimationControler;

public class KreisBewegung implements AnimatedDrawingScript {

    protected Point mittelpunkt;
    protected Point rotierenderPunkt;

    public KreisBewegung() {
        mittelpunkt = new Point(222, 333);
        rotierenderPunkt = new Point(0, 0);
    }

    @Override
    public String getDisplayName() {
        return "Kreisbewegung";
    }

    @Override
    public void show(AnimationControler controller) {
        int anzahlUmlaeufe = 10;
        Kreisbahn kreisbahn = new Kreisbahn(mittelpunkt, 60, 100);
        controller.add(mittelpunkt);
        controller.add(rotierenderPunkt);
        for (int time = 60 * anzahlUmlaeufe; time >= 0; --time) {
            Point tmp = kreisbahn.getPosition(time);
            rotierenderPunkt.moveAbs(tmp.getX(), tmp.getY());
            controller.refreshNow();
            controller.stayFor(250);
        }
        controller.refreshNow();
    }
}
