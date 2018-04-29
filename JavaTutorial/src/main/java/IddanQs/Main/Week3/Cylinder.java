package IddanQs.Main.Week3;

/**
 * Created by AlonH on 11/05/2017.
 */
public class Cylinder extends Circle {

    private double height;


//    -------- CONSTRUCTORS --------

    public Cylinder() {

        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {

        super();
        this.height = height;
    }

//    -------- Methods --------

    public double getVolume() {

        return getArea() * this.height;
    }

//    -------- Getters --------

    public double getHeight() {
        return height;
    }

    //    -------- Setters --------
    public void setHeight(double height) {
        this.height = height;
    }
}
