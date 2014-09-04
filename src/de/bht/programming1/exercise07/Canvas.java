package de.bht.programming1.exercise07;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    private static final long serialVersionUID = -3692338615710052482L;
    protected Model model;

    public Canvas(final Model model) {
        this.model = model;
        setBackground(Config.BACKGROUND_COLOR);
    }

    @Override
    public void paintComponent(final Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < model.getAll().size(); ++i) {
            model.getAll().get(i).draw(g);
        }
    }
}
