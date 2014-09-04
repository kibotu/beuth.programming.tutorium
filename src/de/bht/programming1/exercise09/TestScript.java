package de.bht.programming1.exercise09;

import de.bht.programming1.exercise07.drawable.Gitter;
import de.bht.programming1.exercise07.drawable.Sinuskurve;
import j.schimkat.lernhilfe.simpleDrawingFramework.userPort.AnimatedDrawingScript;
import j.schimkat.lernhilfe.simpleDrawingFramework.userPort.AnimationControler;

import java.awt.*;

public class TestScript implements AnimatedDrawingScript {

    protected Gitter gitter;
    protected Sinuskurve sinuskurve;

    public TestScript() {
        gitter = new Gitter(100, 100, Color.BLACK);
        sinuskurve = new Sinuskurve(100, 2 * Math.PI * 180, Color.RED);
    }

    @Override
    public String getDisplayName() {
        return "Script=" + gitter + "\n" + sinuskurve;
    }

    @Override
    public void show(AnimationControler controller) {
        double amplitude = 2 * Math.PI * 10;
        double length = 100;
        controller.add(gitter);
        controller.add(sinuskurve);
        for (int time = 0; time < 11 * 4; time++) {
            amplitude *= -1;
            sinuskurve.setA(amplitude + time);
            sinuskurve.setLenght(length + time);
            controller.refreshNow();
            controller.stayFor(250);
        }
        controller.refreshNow();
    }
}