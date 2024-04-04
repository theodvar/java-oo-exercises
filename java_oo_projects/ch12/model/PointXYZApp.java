package gr.aueb.cf.java_oo_projects.ch12.model;

import gr.aueb.cf.ch12.model.PointXYZ;

/**
 *  Driver class
 *  create an instance / object  of PointXYZ class
 */
public class PointXYZApp {

    public static void main(String[] args) {
        gr.aueb.cf.ch12.model.PointXYZ p1 = new gr.aueb.cf.ch12.model.PointXYZ(22,7, 3);
        gr.aueb.cf.ch12.model.PointXYZ p2 = new gr.aueb.cf.ch12.model.PointXYZ();
        gr.aueb.cf.ch12.model.PointXYZ p3 = new PointXYZ(6, 10, 1);

        p2.setX(10);
        p2.setY(100);
        p2.setZ(2);

        System.out.println(p1.convertToString());
        System.out.println("("+ p2.getX()+", " + p2.getY()+", " + p2.getZ()+")");
        System.out.println(p3.convertToString());
    }
}
