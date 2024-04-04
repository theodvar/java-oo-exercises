package gr.aueb.cf.java_oo_projects.ch17;

import gr.aueb.cf.java_oo_projects.ch16.exercise2.AbstractShape;
import gr.aueb.cf.java_oo_projects.ch16.exercise2.IRectangle;

import java.io.Serializable;

public class Rectangle extends AbstractShape implements IRectangle,Cloneable, Serializable {

    private static final  long serialVersionUID = 133458;
    private  double width;
    private  double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //copy Constructor
    public Rectangle( Rectangle rectangle) {
        this.width = rectangle.getWidth();
        this.length = rectangle.getLength();
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(width, rectangle.width) != 0) return false;
        return Double.compare(length, rectangle.length) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(width);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(length);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /**
     * Calculate the area of a Rectangle
     * @return  the area of a Rectangle
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * Calculate the perimeter of a Rectangle
     * @return the perimeter of a Rectangle
     */
    @Override
    public long getCircumference() {
        return 2*((long)width + (long)length);
    }
}
