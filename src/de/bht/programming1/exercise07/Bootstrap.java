package de.bht.programming1.exercise07;

import javax.swing.*;
import java.awt.*;

public class Bootstrap extends JApplet {

    @Override
    public void init() {
        final Controller controller = new Controller();
        final Container container = getContentPane();
        container.add(controller.getView());
        setSize(Config.WINDOW_WIDTH, Config.WINDOW_HEIGHT);
        setVisible(true);
        controller.start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Painter");
        final Controller controller = new Controller();
        Container container = frame.getContentPane();
        container.add(controller.getView());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Config.WINDOW_WIDTH, Config.WINDOW_HEIGHT);
        frame.setVisible(true);
        frame.setBackground(Color.WHITE);
        controller.start();
    }
}
