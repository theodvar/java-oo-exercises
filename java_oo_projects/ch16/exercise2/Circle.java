package gr.aueb.cf.java_oo_projects.ch16.exercise2;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends AbstractShape implements ICircle{

    private double radius;

    @Override
    public double getDiameter() {
        return 2*radius;

    }

    @Override
    public double getArea() {
        return PI*pow(radius,2);
    }

    @Override
    public long getCircumference() {
        return (long)(2* PI*radius);
    }
}
