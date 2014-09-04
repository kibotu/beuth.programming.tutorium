package de.bht.programming1.exercise11.astro;

public class Planet extends RotierenderHimmelskoerper {

    public Planet(String name, Himmelskoerper center, float durchmesser, int umlaufdauer, int bahnradius) {
        super(name, center, durchmesser, umlaufdauer, bahnradius);
    }

    @Override
    public String toString() {
        return "Name=" + name + ", Position=" + position + ", Planet=" + center.name + ", Sun Position= " + center.position;
    }
}
