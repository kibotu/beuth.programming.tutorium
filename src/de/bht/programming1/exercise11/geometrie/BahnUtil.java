package de.bht.programming1.exercise11.geometrie;

public class BahnUtil {

    /**
     * Gibt die Position bei Drehung um den momentanen Mittelpunkt center an, der sich selbst
     * bewegen kann und deshalb an die Methode übergeben werden muss
     * (verwenden Sie die Formeln aus Aufgabe 9) Zum Zeitpunkt t = 0 Sekunden
     * befindet er sich an der Position (center.x -r, center.y)
     */
    public static PointF getPosition(PointF center, int umlaufdauer, float bahnradius, int time) {
        float dx = (float) (center.x + (-bahnradius * Math.cos(phi(time, umlaufdauer))));
        float dy = (float) (center.y + (bahnradius * Math.sin(phi(time, umlaufdauer))));
        return new PointF(dx, dy);
    }

    protected static float phi(int t, int tu) {
        return tu == 0 ? (float) (2f * Math.PI * t) : (float) (2f * Math.PI * t / tu);
    }
}