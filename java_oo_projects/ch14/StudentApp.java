package gr.aueb.cf.java_oo_projects.ch14;

import java.lang.reflect.Constructor;

public class StudentApp {

    public static void main(String[] args) {
        try {
            Class <?> clazz = Class.forName("gr.aueb.cf.java_oo_projects.ch14.Student");
            Constructor<?> defaultCtr = clazz.getConstructor();
            defaultCtr.setAccessible(true);
            Student studentRef = (Student) defaultCtr.newInstance();

        }catch (Throwable e) {
            e.printStackTrace();
        }

    }
}
