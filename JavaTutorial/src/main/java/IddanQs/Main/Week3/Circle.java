package IddanQs.Main.Week3;

/**
 * Created by AlonH on 11/05/2017.
 */
public class Circle {

    protected double radius;
    protected String color;

//    -------- CONSTRUCTORS --------

    public Circle() {

        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double redius) {

        this.radius = redius;
        this.color = "red";
    }

    public Circle(double radius, String color) {

        this.radius = radius;
        this.color = color;
    }

//    -------- Methods --------

    public double getArea() {

        return Math.PI * Math.pow(radius, 2.0);
    }

    public String toString() {

        return "Circle[radius=" + radius + ", color=" + color + "]";
    }

//    -------- Getters --------

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

//    -------- Setters --------

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
