public class Cylinder extends Circle{
    public double height;
    Cylinder() {
        this.height = 4.0;
    }
    Cylinder(double radius) {
    }
    Cylinder(double radius, double height) {

    }
    double getHeight()
    {
        return height;
    }
    double getVolume() {
        double volume = Math.PI * 2 * getRadius();
        return volume;
    }
}
