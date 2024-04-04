package gr.aueb.cf.java_oo_projects.ch17;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        Circle c2 = new Circle(2);

        Rectangle r1 = new Rectangle(2,4);
        Rectangle r2 = new Rectangle(2,4);

        System.out.println(c1.equals(c2));
        System.out.println(r1.equals(r2));

    }
}
