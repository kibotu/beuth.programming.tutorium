package de.bht.programming1.exercise07.drawable;

import java.awt.*;

public class Point extends GeoFigur {

    protected double x;
    protected double y;
    protected Color color;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this(p.x, p.y);
    }

    @Override
    public void moveAbs(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveRel(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void scale(double factor) {
        x *= factor;
        y *= factor;
    }

    public String toString() {
        return String.format("(%.2f|%.2f)", x, y);
    }

    @Override
    public void draw(Graphics g) {
        Color oldColor = g.getColor();
        if (color != null) {
            g.setColor(color);
        }
        g.fillOval((int) x, (int) y, 5, 5);
        g.setColor(oldColor);
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
