/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.gui.plaf.palette;

import java.awt.Point;

/**
 *
 * @author pradeepthayaparan
 */
public class DrawBorder { 
    
  private final Point position;  
  private final int width, height; 
    
    
    public DrawBorder(Point p, int width, int height ){
    
     this.position = p; 
     this.height = height;
     this.width = width;

    }
    
    public Point getPosition() {
        return position;
    }

    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
 
}