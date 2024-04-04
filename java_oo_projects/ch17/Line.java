package gr.aueb.cf.java_oo_projects.ch17;

import gr.aueb.cf.java_oo_projects.ch16.exercise2.AbstractShape;
import gr.aueb.cf.java_oo_projects.ch16.exercise2.ILine;

import java.io.Serializable;

public class Line extends AbstractShape implements ILine,Cloneable, Serializable {

    private static final  long serialVersionUID = 123468;
    private double length;

    public Line(double length) {
        this.length = length;
    }

    //copy Constructor
    public Line (Line line) {
        this.length = line.getLength();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line)) return false;

        Line line = (Line) o;

        return Double.compare(length, line.length) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(length);
        return (int) (temp ^ (temp >>> 32));
    }
}
