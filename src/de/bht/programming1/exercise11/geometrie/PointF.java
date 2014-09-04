package de.bht.programming1.exercise11.geometrie;

public class PointF {

    public float x;
    public float y;

    public PointF(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
