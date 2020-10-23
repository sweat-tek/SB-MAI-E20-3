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
public class GeomLineInt {
    private GeomPointInt p1;
    private GeomPointInt p2;
    
    public GeomLineInt(GeomPointInt p1, GeomPointInt p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    /**
     * @return the p1
     */
    public GeomPointInt getP1() {
        return p1;
    }

    /**
     * @return the p2
     */
    public GeomPointInt getP2() {
        return p2;
    }

}
