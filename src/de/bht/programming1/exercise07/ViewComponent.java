package de.bht.programming1.exercise07;

import javax.swing.*;
import java.awt.*;

public class ViewComponent extends JPanel {

    private static final long serialVersionUID = 8153685744707207431L;

    public ViewComponent(final Model model) {
        super();
        setLayout(new BorderLayout());
        add(new Canvas(model), BorderLayout.CENTER);
    }
}
