package gr.aueb.cf.java_oo_projects.ch15;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point3D extends Point2D {
    private double z;

    public Point3D() {
//        super();
//        z = 0.0;
    }

    public Point3D(double x, double y, double z) {
        //constructor chaining
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() +")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        z += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        z += 1;
    }

    @Override
    public double getDistanceFromOrigin() {
        double distPoint3d = sqrt(pow(getX(), 2) + pow(getY(),2) + pow(getZ(),2));
        return distPoint3d;
    }
}
