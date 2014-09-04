package de.bht.programming1.exercise07.drawable;

public class Circle extends Oval {

    public Circle(Point center, int length) {
//		super(center, (int)(radius/Math.sqrt(2)), (int)(radius/Math.sqrt(2)));
        super(center, length, length);
    }

    public Circle(Circle other) {
//		this(other.center, (int)(Math.sqrt((other.width*other.width+other.height*other.height))/2));
        this(other.center, other.width);
    }
}

