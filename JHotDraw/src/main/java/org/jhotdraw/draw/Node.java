/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import org.jhotdraw.geom.BezierPath;

/**
 *
 * @author jonas
 */
public class Node {

    public BezierPath.Node removeNode(BezierPath path, int index) {
        return path.remove(index);
    }

    /**
     * Removes the Point2D.Double at the specified index.
     */
    protected void removeAllNodes(BezierPath path) {
        path.clear();
    }

    /**
     * Gets the node count.
     */
    public int getNodeCount(BezierPath path) {
        return path.size();
    }

    public void addNode(BezierPath path, BezierPath.Node p) {
        addNode(path, getNodeCount(path), p);
    }

    /**
     * Adds a node to the list of points.
     */
    public void addNode(BezierPath path, final int index, BezierPath.Node p) {
        BezierFigure f = new BezierFigure();
        final BezierPath.Node newPoint = new BezierPath.Node(p);
        path.add(index, p);
    }

    /**
     * Sets a control point.
     */
    public void setNode(BezierPath path, int index, BezierPath.Node p) {
        path.set(index, p);

    }

    /**
     * Gets a control point.
     */
    public BezierPath.Node getNode(BezierPath path, int index) {
        return (BezierPath.Node) path.get(index).clone();
    }
}
