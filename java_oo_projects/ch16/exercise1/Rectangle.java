package gr.aueb.cf.java_oo_projects.ch16.exercise1;

public class Rectangle extends AbstractShape implements ITwoDimensional{
    private  double width;
    private  double length;

    /**
     * Calculate the area of a Rectangle
     * @return  the area of a Rectangle
     */
    @Override
    public double getArea() {
        return width * length;
    }
}
