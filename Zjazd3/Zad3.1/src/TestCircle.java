public class TestCircle {
    public void main() {

        Circle c1 = new Circle(2.0);
        System.out.println(c1.toString());


        Circle c2 = new Circle(4.0, "blue");
        System.out.println(c2.toString());


        Circle c3 = new Circle();
        c3.setRadius(7.0);
        c3.setColor("green");
        System.out.println(c3.toString());
    }
}
