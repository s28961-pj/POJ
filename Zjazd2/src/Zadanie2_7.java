import java.util.Scanner;

public class Zadanie2_7 {
    public void cylinderVolume() {

        // Stworzenie obiektu Scanner do pobierania danych od użytkownika
        Scanner input = new Scanner(System.in);

        // Pobranie danych od użytkownika
        System.out.print("Podaj promień podstawy walca: ");
        double radius = input.nextDouble();

        System.out.print("Podaj wysokość walca: ");
        double height = input.nextDouble();

        // Obliczenie objętości walca
        double volume = Math.PI * Math.pow(radius, 2) * height;

        // Wyświetlenie wyniku
        System.out.println("Objętość walca wynosi: " + volume);
    }
}
