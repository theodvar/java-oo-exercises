package gr.aueb.cf.java_oo_projects.ch12.model;

import gr.aueb.cf.ch11.model.Point;

/**
 * The {@link PointXYZ} class represents <i>points</i> in
 * a 3-dimensional space. It contains  {@link PointXYZ#x},
 * {@link PointXYZ#y} and {@link PointXYZ#z} coordinates.
 *
 * @author theodosia
 * @since 0.1
 * @version  2.0
 */
public class PointXYZ {
    private int x;
    private int y;
    private int z;

    /**
     * Default constructor
     * Initializes a new {@link PointXYZ}
     * with default values.
     */
    public PointXYZ() {
    }

    /**
     * Overloaded constructor
     * Initializes a newly created point to
     * specific coordinates
     * @param x     the x-coordinate
     * @param y     the y-coordinate
     * @param z     the z-coordinate
     */
    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     *  Gets the {@link PointXYZ#x} coordinate.
     *
     * @return the value of x-coordinate.
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the {@link PointXYZ#x} coordinate.
     * @param x
     *          the value of x-coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *  Gets the {@link PointXYZ#y} coordinate.
     *
     * @return the value of y-coordinate.
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the {@link PointXYZ#y} coordinate.
     * @param y
     *          the value of y-coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     *  Gets the {@link PointXYZ#z} coordinate.
     *
     * @return the value of z-coordinate.
     */
    public int getZ() {
        return z;
    }

    /**
     * Sets the {@link PointXYZ#z} coordinate.
     * @param z
     *          the value of y-coordinate
     */
    public void setZ(int z) {
        this.z = z;
    }

    /**
     * Returns the state of {@link PointXYZ} instance
     * as a {@link String}
     *
     * @return  a string representation of {@link PointXYZ}
     *          instance.
     */
    public String convertToString() {
        return "("+ x +", "+ y + ", " + z + ")";
    }
}
