package gr.aueb.cf.java_oo_projects.ch16.exercise1;

public abstract class AbstractShape implements IShape{
    private long id;

    /**
     * implements, gets Shape id
     * @return shape id
     */
    @Override
    public long getId() {
        return id;
    }

    /**
     * sets shape id
     * @param id    shape id
     */
    void setId(long id){
        this.id = id;
    }
}
