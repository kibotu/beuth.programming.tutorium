package de.bht.programming1.exercise06;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleClassInspection {

    public static void main(String[] args) {
        // java.lang.Math // private constructor, public methods
        String s = new String("beliebige Zeichenkette");
        // java.util.Collections // abstract class
        ArrayList<Integer> list = new ArrayList<Integer>();
        // java.util.Arrays // private constructor, public methods
        Color c = new Color(0xff0000); // color red
        Dimension rectangle = new Dimension(10, 10);
        // java.awt.Graphics // abstract class
        Scanner sin = new Scanner("Text");
    }
}
