package model;

/**
 * @author Till Wischniewski
 *
 */

public class MEllipse extends MShape
{
    private double radiusX;
    private double radiusY;

    /**
     * constructs a ellipse object
     *
     * @param x
     *            the x-coordinate of the shape's origin
     * @param y
     *            the y-coordinate of the shape's origin
     * @param radiusX
     *            Defines the width of the ellipse
     * @param radiusY
     *            Defines the height of the ellipse
     *
     */

    public MEllipse(double x, double y, double radiusX, double radiusY) {
        super(x, y);
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    public double getRadiusX() {
        return radiusX;
    }

    public double getRadiusY() {
        return radiusY;
    }

    /**
     * calculate the area of a ellipse.
     *
     * @return the area of the ellipse
     */
    @Override
    public double area() {
        return (Math.PI * this.radiusX * this.radiusY);
    }

    /**
     * calculate the circumference of a ellipse.
     *
     * @return the circumference of the ellipse
     */
    @Override
    public double circumference() {
        return (2 * Math.PI * Math.sqrt((Math.pow(this.radiusX,2)+ Math.pow(this.radiusY,2))/2));
    }

    /**
     * constructs a textual representation of this ellipse.
     *
     * @return the current object in a textual representation
     */
    @Override
    public String toString() {
        return "Ellipse with origin: " + origin() +
                "radiusX: " + this.radiusX + "radiusY: " + this.radiusY;
    }

}
