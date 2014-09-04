package de.bht.programming1.exercise10;

public class Zeit {

    protected int stunden;
    protected int minuten;
    protected int sekunden;

    public Zeit(int stunden, int minuten, int sekunden) {
        this.stunden = stunden;
        this.minuten = minuten;
        this.sekunden = sekunden;
        normalize();
    }

    public Zeit(Zeit zeit) {
        this(zeit.stunden, zeit.minuten, zeit.sekunden);
    }

    public int getStunden() {
        return stunden;
    }

    public int getMinuten() {
        return minuten;
    }

    public int getSekunden() {
        return sekunden;
    }

    public int getGesamtZeit() {
        return getStunden() * 3600 + getMinuten() * 60 + getSekunden();
    }

    public void add(int sekunden) {
        this.sekunden += sekunden;
        normalize();
    }

    public void add(Zeit t) {
        this.stunden += t.getStunden();
        this.minuten += t.getMinuten();
        this.sekunden += t.getSekunden();
        normalize();
    }

    public void substract(int sekunden) {
        this.sekunden -= sekunden;
        normalize();
    }

    public void substract(Zeit t) {
        this.stunden -= t.getStunden();
        this.minuten -= t.getMinuten();
        this.sekunden -= t.getSekunden();
        normalize();
    }

    /**
     * Normalisierung der Zeit automatisch bei allen eingaben
     */
    protected void normalize() {
        int rest = getGesamtZeit();
        sekunden = rest % 60;
        rest /= 60;
        minuten = rest % 60;
        rest /= 60;
        stunden = rest;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", stunden, minuten, sekunden);
    }
}
