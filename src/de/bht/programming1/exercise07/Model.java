package de.bht.programming1.exercise07;

import de.bht.programming1.exercise07.drawable.Drawable;

import java.util.LinkedList;
import java.util.List;

public class Model {

    List<Drawable> list;

    public Model() {
        this.list = new LinkedList<>();
    }

    public List<Drawable> getAll() {
        return list;
    }

    public Drawable get(int index) {
        return list.get(index);
    }

    public void add(Drawable figure) {
        list.add(figure);
    }
}
