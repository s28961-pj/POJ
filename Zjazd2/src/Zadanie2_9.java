import java.util.Scanner;

public class Zadanie2_9 {
    public void playGame() {

        // wylosuj poprawną literę
        char luckyChar = (char)('A' + (int)(Math.random() * 26));

        // utwórz obiekt Scanner do odczytu danych od użytkownika
        Scanner scanner = new Scanner(System.in);

        // wyświetl instrukcję gry
        System.out.println("System wylosował literę, zgadnij jaką: ");

        // inicjalizuj licznik prób
        int shoot = 1;

        // pętla gry
        while (true) {
            // odczytaj wprowadzoną przez gracza literę jako String
            String input = scanner.nextLine();
            // zamień wprowadzoną literę na wielkie litery i odczytaj pierwszy znak
            char myChar = input.toUpperCase().charAt(0);

            // sprawdź, czy podana litera jest poprawna
            if (myChar == luckyChar) {
                // jeśli tak, wyświetl komunikat o wygranej i przerwij pętlę
                System.out.println("Świetnie! Odgadłeś literę " + luckyChar + " w " + shoot + " próbach.");
                break;
            } else {
                // jeśli nie, wyświetl komunikat o błędzie i podpowiedź
                System.out.println("Niestety nie. Spróbuj ponownie!");
                if (myChar < luckyChar) {
                    System.out.println("Litera jest za niska.");
                } else {
                    System.out.println("Litera jest za wysoka.");
                }
                // zwiększ licznik prób i wyświetl instrukcję gry
                System.out.println("Spróbuj jeszcze raz: ");
                shoot++;
            }
        }
    }
}
