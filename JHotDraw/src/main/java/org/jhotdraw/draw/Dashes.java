/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

/**
 *
 * @author jonas
 */
public class Dashes {
    private double dashSize;
    private double dashFactor;
    private double dashPhase;
    private double[] ddashes;
    private float[] dashes;

    public Dashes(double dashFactor, double dashPhase, double[] ddashes) {
        this.dashSize = dashSize;
        this.dashFactor = dashFactor;
        this.dashPhase = dashPhase;
        this.ddashes = ddashes;
        this.dashes = null;
    }
    
    public double getDashSize() {
        return dashSize;
    }

    public void setDashSize(double dashSize) {
        this.dashSize = dashSize;
    }

    public double getDashFactor() {
        return dashFactor;
    }

    public void setDashFactor(double dashFactor) {
        this.dashFactor = dashFactor;
    }

    public double getDashPhase() {
        return dashPhase;
    }

    public void setDashPhase(double dashPhase) {
        this.dashPhase = dashPhase;
    }

    public double[] getDdashes() {
        return ddashes;
    }

    public void setDdashes(double[] ddashes) {
        this.ddashes = ddashes;
    }

    public float[] getDashes() {
        return dashes;
    }

    public void setDashes(float[] dashes) {
        this.dashes = dashes;
    }
    
    public void setIndexDashes(float dashes, int index){
        this.dashes[index]=dashes;
    }
    
    
    
}
