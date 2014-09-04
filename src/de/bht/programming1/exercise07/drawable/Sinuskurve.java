package de.bht.programming1.exercise07.drawable;

import java.awt.*;

public class Sinuskurve implements Drawable {

    protected double amplitude;
    protected double length;
    protected Color color;

    public Sinuskurve(double amplitude, double length, Color color) {
        this.amplitude = amplitude;
        this.length = length;
        this.color = new Color(color.getRGB());
    }

    public Sinuskurve(Sinuskurve other) {
        this(other.amplitude, other.length, other.color);
    }

    @Override
    public void draw(Graphics g) {
        Color oldColor = g.getColor();
        g.setColor(color);

        for (int x = 0; x < 1100; ++x) {
            g.drawOval(x, (int) getY(x) + 555 / 2, 2, 2);
        }
        g.setColor(oldColor);
    }

    private double getY(double x) {
        return amplitude * Math.sin(phase(x));
    }

    private double phase(double x) {
        return 2 * Math.PI * x / length;
    }

    public void setA(double A) {
        amplitude = A;
    }

    public void setLenght(double length) {
        this.length = length;
    }

    public String toString() {
        return "Amplitude=" + String.format("%5.3f", amplitude) + ",Lenght=" + length;
    }
}
