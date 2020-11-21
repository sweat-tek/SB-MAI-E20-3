/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.geom;

/**
 *
 * @author Alex
 */
public class GeomLineDouble {
    private GeomPointDouble p1;
    private GeomPointDouble p2;
    
    public GeomLineDouble(GeomPointDouble p1, GeomPointDouble p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * @return the p1
     */
    public GeomPointDouble getP1() {
        return p1;
    }

    /**
     * @return the p2
     */
    public GeomPointDouble getP2() {
        return p2;
    }
    
    
}
