package org.jhotdraw.samples.svg.io;

import java.awt.geom.AffineTransform;
import java.io.IOException;
import net.n3.nanoxml.IXMLElement;
import org.jhotdraw.io.StreamPosTokenizer;

public class SVGInputFormatHelper {

    IXMLElement elem;
    String str;
    StreamPosTokenizer tt;
    AffineTransform t;
    String type;

    public SVGInputFormatHelper(IXMLElement elem, String str, StreamPosTokenizer tt, AffineTransform t, String type) {
        this.elem = elem;
        this.str = str;
        this.tt = tt;
        this.t = t;
        this.type = type;
    }

    public AffineTransform matrix() throws IOException {
        double[] m = new double[6];
        for (int i = 0; i < 6; i++) {
            if (tt.nextToken() != StreamPosTokenizer.TT_NUMBER) {
                throw new IOException("Matrix value " + i + " not found in transform " + str + " token:" + tt.ttype + " " + tt.sval);
            }
            m[i] = tt.nval;
        }
        t.concatenate(new AffineTransform(m));

        return t;
    }

    public AffineTransform translate() throws IOException {

        double tx, ty;
        if (tt.nextToken() != StreamPosTokenizer.TT_NUMBER) {
            throw new IOException("X-translation value not found in transform " + str);
        }
        tx = tt.nval;
        if (tt.nextToken() == StreamPosTokenizer.TT_NUMBER) {
            ty = tt.nval;
        } else {
            tt.pushBack();
            ty = 0;
        }
        t.translate(tx, ty);

        return t;
    }

    public AffineTransform scale() throws IOException {

        double sx, sy;
        if (tt.nextToken() != StreamPosTokenizer.TT_NUMBER) {
            throw new IOException("X-scale value not found in transform " + str);
        }
        sx = tt.nval;
        if (tt.nextToken() == StreamPosTokenizer.TT_NUMBER) {
            sy = tt.nval;
        } else {
            tt.pushBack();
            sy = sx;
        }
        t.scale(sx, sy);

        return t;
    }

    public AffineTransform rotate() throws IOException {

        double angle, cx, cy;
        if (tt.nextToken() != StreamPosTokenizer.TT_NUMBER) {
            throw new IOException("Angle value not found in transform " + str);
        }
        angle = tt.nval;
        if (tt.nextToken() == StreamPosTokenizer.TT_NUMBER) {
            cx = tt.nval;
            if (tt.nextToken() != StreamPosTokenizer.TT_NUMBER) {
                throw new IOException("Y-center value not found in transform " + str);
            }
            cy = tt.nval;
        } else {
            tt.pushBack();
            cx = cy = 0;
        }
        t.rotate(angle * Math.PI / 180d, cx, cy);

        return t;
    }

    public AffineTransform skewX() throws IOException {

        double angle;
        if (tt.nextToken() != StreamPosTokenizer.TT_NUMBER) {
            throw new IOException("Skew angle not found in transform " + str);
        }
        angle = tt.nval;
        t.concatenate(new AffineTransform(
                1, 0, Math.tan(angle * Math.PI / 180), 1, 0, 0));

        return t;
    }

    public AffineTransform skewY() throws IOException {

        double angle;
        if (tt.nextToken() != StreamPosTokenizer.TT_NUMBER) {
            throw new IOException("Skew angle not found in transform " + str);
        }
        angle = tt.nval;
        t.concatenate(new AffineTransform(
                1, Math.tan(angle * Math.PI / 180), 0, 1, 0, 0));

        return t;
    }

    public void ref() throws IOException {
        System.err.println("SVGInputFormat warning: ignored ref(...) transform attribute in element " + elem);
        while (tt.nextToken() != ')' && tt.ttype != StreamPosTokenizer.TT_EOF) {
            // ignore tokens between brackets
        }
        tt.pushBack();
    }

}
