package gr.aueb.cf.java_oo_projects.ch15;

import static java.lang.Math.abs;

public class Point {

    private double x;

    public Point() {

    }

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "(" + x + ")";
    }

    /**
     * public API
     */
    public double getDistanceFromOrigin(){
        return abs(x)-0;
    }
    public void movePlus10() {
        x+=10;
//        //self-use
//        for (int i = 1; i <= 10; i++) {
//            movePlusOne();
//        }
    }

    protected void movePlusOne() {
        x += 1;
    }

    protected  void printTypeOf(){
        System.out.println(this.getClass().getSimpleName());
    }

    private void reset() {
        x = 0;
    }
}
