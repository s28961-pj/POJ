public class Circle {
    private double radius;
    private String color;
    Circle() {
        radius = 1.0;
        color = "blue";
    }
    Circle(double radius) {
        color = "blue";
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }
    public String toString() {
        return "Radius: %s, color: %s, area: %s".formatted(radius, getArea(), color);
    }
}
