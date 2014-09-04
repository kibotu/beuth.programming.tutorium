package de.bht.programming1.exercise07.drawable;

import java.awt.*;

public class Line extends GeoFigur {

    protected Point pA;
    protected Point pB;
    protected Color color;

    public Line(Point pA, Point pB, Color color) {
        this.pA = pA;
        this.pB = pB;
        this.color = color;
    }

    public Line(Line other) {
        this(other.pA, other.pB, other.color);
    }

    @Override
    public void draw(Graphics g) {
        Color oldColor = g.getColor();
        g.setColor(color);
        g.drawLine((int) pA.getX(), (int) pA.getY(), (int) pB.getX(), (int) pB.getY());
        g.setColor(oldColor);
    }

    @Override
    public void setColor(Color color) {
        this.color = color;

    }

    @Override
    public void moveAbs(double x, double y) {

    }

    @Override
    public void moveRel(double x, double y) {

    }

    @Override
    public void scale(double factor) {

    }

    public String toString() {
        return "pA=" + pA + ",pB=" + pB;
    }

    public void move(Point mittelpunkt, Point rotierenderPunkt) {
        this.pA = mittelpunkt;
        this.pB = rotierenderPunkt;
    }
}
