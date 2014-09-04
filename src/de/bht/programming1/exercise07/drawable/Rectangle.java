package de.bht.programming1.exercise07.drawable;

import javax.management.InvalidAttributeValueException;
import java.awt.*;

public class Rectangle extends GeoFigur {

    protected Color color;
    protected Point startPoint;
    protected int width;
    protected int height;
    protected boolean raised;
    protected boolean filled;

    public Rectangle(Point startPoint, int width, int height) {
        this.startPoint = new Point(startPoint);
        this.width = width;
        this.height = height;
        this.raised = true;
        this.color = Color.black;
    }

    public Rectangle(Rectangle other) {
        this(other.startPoint, other.width, other.height);
    }

    public void setFilled(boolean value) {
        this.filled = value;
    }

    @Override
    public void draw(Graphics g) {
        Color oldColor = g.getColor();
        if (color != null) {
            g.setColor(color);
        }
        if (filled) {
            g.fill3DRect((int) startPoint.getX(), (int) startPoint.getY(), width, height, raised);
        } else {
            g.draw3DRect((int) startPoint.getX(), (int) startPoint.getY(), width, height, raised);
        }
        g.setColor(oldColor);
    }

    public void raiseUp() {
        this.raised = true;
    }

    public void raiseDown() {
        this.raised = false;
    }

    @Override
    public void moveAbs(double x, double y) {
        startPoint.moveAbs(x, y);
    }

    @Override
    public void moveRel(double x, double y) {
        startPoint.moveRel(x, y);
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

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    public String toString() {
        return String.format("(%.2f|%.2f) height: %d width: %d Color: %s", startPoint.getX(), startPoint.getY(), width, height, color.toString());
    }
}
