package de.bht.programming1.exercise07;

import de.bht.programming1.exercise07.drawable.Gitter;
import de.bht.programming1.exercise07.drawable.Sinuskurve;

import javax.swing.*;
import java.awt.*;

public class Controller {

    protected Model model;
    protected Canvas view;

    public Controller() {
        this.model = new Model();
        this.view = new Canvas(model);
        view.setFocusable(true);
        sinus();
    }

    private void sinus() {
        Gitter gitter = new Gitter(100, 100, Color.YELLOW);
        double amplitude = 200;
        double length = 2 * Math.PI * 100;
        Sinuskurve sinus = new Sinuskurve(amplitude, length, Color.RED);
        model.add(gitter);
        model.add(sinus);
    }

    public JPanel getView() {
        return view;
    }
}
