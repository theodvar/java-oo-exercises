package gr.aueb.cf.java_oo_projects.ch16.exercise2;

public class Rectangle extends AbstractShape implements IRectangle{

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

    /**
     * Calculate the perimeter of a Rectangle
     * @return the perimeter of a Rectangle
     */
    @Override
    public long getCircumference() {
        return 2*((long)width + (long)length);
    }
}
