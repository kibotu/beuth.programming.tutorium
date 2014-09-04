package de.bht.programming1.exercise07;

import de.bht.programming1.exercise07.drawable.Gitter;
import de.bht.programming1.exercise07.drawable.Sinuskurve;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements Runnable, KeyListener {

    protected Model model;
    protected ViewComponent view;

    public Controller() {
        this.model = new Model();
        this.view = new ViewComponent(model);
        view.addKeyListener(this);
        view.setFocusable(true);
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        sinus();

        while (true) {
            /** Frames per milisecond **/
            sleep(Config.ANZAHL_FRAMES);

            loop();

            /** repaint **/
            view.repaint();
        }
    }

    private void sinus() {
        Gitter gitter = new Gitter(100, 100, Color.YELLOW);
        double amplitude = 200;
        double length = 2 * Math.PI * 100;
        Sinuskurve sinus = new Sinuskurve(amplitude, length, Color.RED);
        model.add(gitter);
        model.add(sinus);
    }

    private void loop() {

    }

    public JPanel getView() {
        return view;
    }

    public void start() {
        final Thread thread = new Thread(this);
        thread.start();
    }

    public void sleep(final int time) {
        try {
            Thread.sleep(time);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
    }

    @Override
    public void keyTyped(final KeyEvent e) {
    }

    @Override
    public void keyPressed(final KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        } else {
        }
    }

    @Override
    public void keyReleased(final KeyEvent e) {
    }
}
