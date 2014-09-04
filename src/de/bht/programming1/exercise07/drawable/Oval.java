package de.bht.programming1.exercise07.drawable;

import javax.management.InvalidAttributeValueException;
import java.awt.*;

public class Oval extends GeoFigur {

    protected Color color;
    protected Point center;
    protected int width;
    protected int height;
    protected boolean filled;

    public Oval(Point center, int width, int height) {
        this.center = new Point(center);
        this.width = width;
        this.height = height;
    }

    public Oval(Oval other) {
        this(other.center, other.width, other.height);
    }

    @Override
    public void draw(Graphics g) {
        Color oldColor = g.getColor();
        if (color != null) {
            g.setColor(color);
        }
        if (filled) {
            g.fillOval((int) center.getX(), (int) center.getY(), width, height);
        } else {
            g.drawOval((int) center.getX(), (int) center.getY(), width, height);
        }
        g.setColor(oldColor);
    }

    public void setFilled(boolean value) {
        this.filled = value;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void moveAbs(double x, double y) {
        center.moveAbs(x, y);
    }

    @Override
    public void moveRel(double x, double y) {
        center.moveRel(x, y);
    }

    @Override
    public void scale(double factor) {
        if (factor == 0) {
            try {
                throw new InvalidAttributeValueException();
            } catch (InvalidAttributeValueException e) {
                System.err.append("0-Factor bei scalable()");
            }
        }
        width *= factor;
        height *= factor;
    }

    public String toString() {
        return String.format("(%.2f|%.2f) width: %d height: %d color: %s", center.getX(), center.getY(), width, height, color.toString());
    }
}
