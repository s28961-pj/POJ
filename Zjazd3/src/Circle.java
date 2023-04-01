public class Circle {
    private double radius;
    private String color;

    Circle() {
        radius = 1.0;
        color = "red";
    }
    Circle(double rad) {
        color = "red";
        this.radius = rad;
    }
    Circle(double rad, String col) {
        this.radius = rad;
        this.color = col;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }
    public String getColor() {
        return this.color;
    }
    public void setRadius(double rad) {
        this.radius = rad;
    }
    public void setColor(String col) {
        this.color = col;
    }
    @Override
    public String toString() {
        return "The circle c2 has radius of %s and area of %s and color of %s".formatted(radius, getArea(), color);
    }
}
