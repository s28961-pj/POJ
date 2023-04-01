public class TestCircle {
    public void main() {

        Circle c2 = new Circle(2.0);
        System.out.println(c2.toString());



        Circle c3 = new Circle(4.0, "blue");
        System.out.println(c3.toString());


        Circle c4 = new Circle();
        c4.setRadius(7.0);
        c4.setColor("green");
        System.out.println(c4.toString());
    }
}
