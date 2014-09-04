package de.bht.programming1.exercise09;

import de.bht.programming1.exercise07.drawable.Point;

public class Kreisbahn {

    protected Point mittelpunkt;
    protected int umlaufdauer;
    protected int radius;

    public Kreisbahn(Point mittelpunkt, int umlaufdauer, int radius) {
        this.mittelpunkt = mittelpunkt;
        this.umlaufdauer = umlaufdauer;
        this.radius = radius;
    }

    public Kreisbahn() {
        this(new Point(222, 333), 60, 55);
    }

    public Kreisbahn(Kreisbahn other) {
        this(other.mittelpunkt, other.umlaufdauer, other.radius);
    }

    public Point getPosition(int time) {
        double dx = mittelpunkt.getX()
                + (-radius * Math.cos(phi(time, umlaufdauer)));
        double dy = mittelpunkt.getY()
                + (radius * Math.sin(phi(time, umlaufdauer)));
        return new Point(dx, dy);
    }

    protected double phi(int t, int tu) {
        return (tu == 0) ? 2 * Math.PI * t : 2 * Math.PI * t / tu;
    }

    public String toString() {
        return "Kreisbahn: " + mittelpunkt + ", Umlaufdauer=" + umlaufdauer;
    }
}
