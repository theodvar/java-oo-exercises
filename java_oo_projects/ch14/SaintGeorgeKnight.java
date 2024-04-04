package gr.aueb.cf.java_oo_projects.ch14;

/**
 * Singleton
 */
public class SaintGeorgeKnight {
    private static final SaintGeorgeKnight INSTANCE = new SaintGeorgeKnight();

    private SaintGeorgeKnight(){

    }

    public static SaintGeorgeKnight getInstance(){
        return INSTANCE;
    }

    public void embarkOnMission(){
        System.out.println("Successful Mission");
    }
}
