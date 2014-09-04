package de.bht.programming1.exercise07.drawable;

import java.awt.*;

final public class Gitter implements Drawable {

    final protected double dx;
    final protected double dy;
    protected Color color;

    protected Gitter() {
        this.dx = 0;
        this.dy = 0;
        color = Color.BLACK;
    }

    public Gitter(double dx, double dy, Color color) {
        this.dx = dx;
        this.dy = dy;
        this.color = new Color(color.getRGB());
    }

    public Gitter(Gitter other) {
        this(other.dx, other.dy, other.color);
    }

    @Override
    public void draw(Graphics g) {
        Color oldColor = g.getColor();
        g.setColor(Color.BLACK);
        for (int x = 0; x < 1100; x += dx) {
            g.drawLine(x, 0, x, 1100);
            g.drawLine(0, x, 1100, x);
        }
        g.setColor(oldColor);
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = new Color(color.getRGB());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        long temp;
        temp = Double.doubleToLongBits(dx);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(dy);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Gitter)) {
            return false;
        }
        Gitter other = (Gitter) obj;
        if (color == null) {
            if (other.color != null) {
                return false;
            }
        } else if (!color.equals(other.color)) {
            return false;
        }
        if (Double.doubleToLongBits(dx) != Double.doubleToLongBits(other.dx)) {
            return false;
        }
        if (Double.doubleToLongBits(dy) != Double.doubleToLongBits(other.dy)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "dx=" + dx + ",dy=" + dy;
    }

}
