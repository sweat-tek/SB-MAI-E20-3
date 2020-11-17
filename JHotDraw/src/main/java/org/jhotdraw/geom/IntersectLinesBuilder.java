/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.geom;


public class IntersectLinesBuilder {

    private double xa;
    private double ya;
    private double xb;
    private double yb;
    private double xc;
    private double yc;
    private double xd;
    private double yd;

    public IntersectLinesBuilder() {
    }

    public IntersectLinesBuilder setXa(double xa) {
        this.xa = xa;
        return this;
    }

    public IntersectLinesBuilder setYa(double ya) {
        this.ya = ya;
        return this;
    }

    public IntersectLinesBuilder setXb(double xb) {
        this.xb = xb;
        return this;
    }

    public IntersectLinesBuilder setYb(double yb) {
        this.yb = yb;
        return this;
    }

    public IntersectLinesBuilder setXc(double xc) {
        this.xc = xc;
        return this;
    }

    public IntersectLinesBuilder setYc(double yc) {
        this.yc = yc;
        return this;
    }

    public IntersectLinesBuilder setXd(double xd) {
        this.xd = xd;
        return this;
    }

    public IntersectLinesBuilder setYd(double yd) {
        this.yd = yd;
        return this;
    }

    public IntersectLines createIntersectLines() {
        return new IntersectLines(xa, ya, xb, yb, xc, yc, xd, yd);
    }
    
}
