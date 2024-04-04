package gr.aueb.cf.java_oo_projects.ch15;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point2D extends Point {
    private double y;

    public Point2D() {
//       super();
//       y = 0.0;
    }

    public Point2D(double x, double y) {
        super(x);
        //super();
        //setX(x);
        this.y = y;
    }

    public  double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString()+ "(" + y + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    @Override
    public double getDistanceFromOrigin() {
        double distXY = sqrt(pow(super.getDistanceFromOrigin(),2) + pow(y-0,2));
        return distXY;
    }
}
