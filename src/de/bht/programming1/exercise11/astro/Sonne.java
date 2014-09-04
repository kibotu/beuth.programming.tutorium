package de.bht.programming1.exercise11.astro;

import de.bht.programming1.exercise11.geometrie.PointF;

public class Sonne extends Himmelskoerper {

    protected Sonne(String name, PointF position, float durchmesser) {
        super(name, position, durchmesser);
    }

    @Override
    public PointF getPosition(int time) {
        return null;
    }
}
