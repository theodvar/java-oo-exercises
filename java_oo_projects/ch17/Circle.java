package gr.aueb.cf.java_oo_projects.ch17;

import gr.aueb.cf.ch17.clone.Trainee;
import gr.aueb.cf.java_oo_projects.ch16.exercise2.AbstractShape;
import gr.aueb.cf.java_oo_projects.ch16.exercise2.ICircle;

import java.io.Serializable;
import java.util.Objects;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends AbstractShape implements ICircle,Cloneable, Serializable {

    private static final  long serialVersionUID = 123458;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //copy constructor
    public Circle (Circle circle) {
        this.radius = circle.getRadius();
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Objects.equals (radius, circle.radius);
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }
}
