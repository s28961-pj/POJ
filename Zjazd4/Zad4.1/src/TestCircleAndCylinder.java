class TestCircleAndCylinder {
    public void testClass() {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4);

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());

        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(5);
        Cylinder cylinder3 = new Cylinder(3,6);

        System.out.println(cylinder1.toString());
        System.out.println(cylinder2.toString());
        System.out.println(cylinder3.toString());
    }
}