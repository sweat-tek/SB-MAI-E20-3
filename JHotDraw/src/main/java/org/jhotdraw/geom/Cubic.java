/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.geom;

import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 *
 * @author jonas
 */
public class Cubic {
    private ArrayList<Point2D.Double> d;
    private int first, last;
    private Point2D.Double tHat1, tHat2;

    public Cubic(ArrayList<Point2D.Double> d, int first, int last, Point2D.Double tHat1, Point2D.Double tHat2) {
        this.d = d;
        this.first = first;
        this.last = last;
        this.tHat1 = tHat1;
        this.tHat2 = tHat2;
    }

    public ArrayList<Point2D.Double> getD() {
        return d;
    }

    public void setD(ArrayList<Point2D.Double> d) {
        this.d = d;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public Point2D.Double gettHat1() {
        return tHat1;
    }

    public void settHat1(Point2D.Double tHat1) {
        this.tHat1 = tHat1;
    }

    public Point2D.Double gettHat2() {
        return tHat2;
    }

    public void settHat2(Point2D.Double tHat2) {
        this.tHat2 = tHat2;
    }
    
    
}
