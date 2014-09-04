package de.bht.programming1.exercise11.astro;

import de.bht.programming1.exercise11.geometrie.PointF;

public abstract class Himmelskoerper {

    protected PointF position;
    protected float durchmesser;
    protected String name;

    protected Himmelskoerper(String name, PointF position, float durchmesser) {
        this.name = name;
        this.position = position;
        this.durchmesser = durchmesser;
    }

    abstract public PointF getPosition(int time); // gibt die Position zur Zeit time an.

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Himmelskoerper{" +
                "position=" + position +
                ", durchmesser=" + durchmesser +
                ", name='" + name + '\'' +
                '}';
    }
}