package gr.aueb.cf.java_oo_projects.ch13.model;
/**
 * This class is a Javabean. Defines personal details of a {@link User}.
 * It includes {@link #id}, {@link #firstname} and {@link #lastname}.
 *
 * @since 0.1
 * @author theodosia
 */
public class User {
    private Long id;
    private String firstname;
    private String lastname;

    /**
     * This is the <b>default constructor</b>
     * Its creates a default {@link User} instance.
     */
    public User() {
    }

    /**
     * Initializes a newly created user to
     * specific values of fields
     * @param id    unique number of user
     * @param firstname     the firstname of the user
     * @param lastname      the lastname of the user
     */
    public User(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Gets user's id
     * @return user's id
     */
    public Long getId() {
        return id;
    }

    /**
     * Set user's id.
     * @param id    user's id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets user's firstname.
     * @return  user's firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Set user's firstname.
     * @param firstname user's firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets user's lastname
     * @return  user's lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Set user's lastname
     * @param lastname  user's lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Returns the state of {@link User} instance
     * as a {@link String}
     *
     * @return  a string representation of {@link User}
     * instance.
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
