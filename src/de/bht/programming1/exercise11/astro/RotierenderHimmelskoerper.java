package de.bht.programming1.exercise11.astro;

import de.bht.programming1.exercise11.geometrie.BahnUtil;
import de.bht.programming1.exercise11.geometrie.PointF;

public abstract class RotierenderHimmelskoerper extends Himmelskoerper {

    protected Himmelskoerper center;
    protected int umlaufdauer;
    protected int bahnradius;

    protected RotierenderHimmelskoerper(String name, Himmelskoerper center, float durchmesser, int umlaufdauer, int bahnradius) {
        super(name, new PointF(-durchmesser,0), durchmesser);
        this.center = center;
        this.umlaufdauer = umlaufdauer;
        this.bahnradius = bahnradius;
    }

    public Himmelskoerper getCenter() {
        return center;
    }

    public void rotate(int time) {
        position = getPosition(time);
    }

    @Override
    public PointF getPosition(int time) {
        return BahnUtil.getPosition(center.position, umlaufdauer, bahnradius, time);
    }
}