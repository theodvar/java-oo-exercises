package gr.aueb.cf.java_oo_projects.ch16.exercise1;

import static java.lang.Math.PI;

public class Circle extends AbstractShape implements ITwoDimensional{
    private double radius;

    /**
     * Calculates the area of a circle
     * @return  the area of a circle
     */
    @Override
    public double getArea() {
        return 2* PI*radius;
    }
}
