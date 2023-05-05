public class Sedan extends Car {
    super();
    public int length;
    public double getSalePrice() {
        if (length > 20) {
            return super(getSalePrice()) * 0.95;
        } else return super(getSalePrice()) * 0.90;
    }
}
