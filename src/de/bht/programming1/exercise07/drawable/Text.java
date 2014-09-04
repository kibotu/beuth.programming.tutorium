package de.bht.programming1.exercise07.drawable;

import java.awt.*;

public class Text extends GeoFigur {

    protected String text;
    protected Point position;
    protected Color color;

    public Text(String text, Point position) {
        this.text = text;
        this.position = new Point(position);
    }

    public Text(Text other) {
        this(other.text, other.position);
    }

    public void setText(String text) {
        position.moveRel(0, 16);
        this.text = text;
    }

    @Override
    public void draw(Graphics g) {
        Color oldColor = g.getColor();
        if (color != null) {
            g.setColor(color);
        }
        g.drawString(text, (int) position.getX(), (int) position.getY());
        g.setColor(oldColor);
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void moveAbs(double x, double y) {
        position.moveAbs(x, y);
    }

    @Override
    public void moveRel(double x, double y) {
        position.moveRel(x, y);
    }

    @Override
    public void scale(double factor) {
        position.scale(factor);
    }

}
