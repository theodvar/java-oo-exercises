package gr.aueb.cf.java_oo_projects.ch15;

public class MainPointApp {

    public static void main(String[] args) {
        Point p1 = new Point(2);
        Point2D p2 = new Point2D(2,2);
        Point3D p3 =new Point3D(2,2,2);

        System.out.printf("Distance p1 from the origin: %.2f\n" , p1.getDistanceFromOrigin());
        System.out.printf("Distance p2 from the origin: %.2f\n" , p2.getDistanceFromOrigin());
        System.out.printf("Distance p3 from the origin: %.2f\n" , p3.getDistanceFromOrigin());


        PointUtil.distanceFromOrigin(p1);
        PointUtil.distanceFromOrigin(p2);
        PointUtil.distanceFromOrigin(p3);

        System.out.printf("Distance p1 from the origin: %.2f\n" , PointUtil.distanceFromOrigin(p1));
        System.out.printf("Distance p2 from the origin: %.2f\n" , PointUtil.distanceFromOrigin(p2));
        System.out.printf("Distance p3 from the origin: %.2f\n" , PointUtil.distanceFromOrigin(p3));



    }
}
