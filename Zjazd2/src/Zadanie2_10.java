public class Zadanie2_10 {
    public void printPower() {

        int base = 2; // podstawa potęgi
        int exponent = 0; // wykładnik potęgi

        while (exponent <= 14) {

            // metoda Math.round() zaokrągla liczbę do najbliższej liczby całkowitej
            System.out.println(base + "^" + exponent + " = " + Math.round(Math.pow(base, exponent)));

            exponent++;
        }
    }
}
