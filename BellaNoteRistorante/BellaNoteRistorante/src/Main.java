import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        // Press Ctrl+D to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Cmd+F8.

        Scanner myScanner = new Scanner(System.in);

        // Ekran powitalny
        System.out.println("Witamy w Bella Note Ristorante!");
        System.out.println("Korzystamy wyłącznie ze świeżych składników od lokalnych dostawców oraz oferujemy dostawy na terenie Gdańska.");
        System.out.print("Czy chcesz zamówić pizzę? T/N ");
        String input = myScanner.nextLine();

        do {
           if (input.toUpperCase().equals("T")) {
               break;
           }
           if (input.toUpperCase().equals("N")) {
                System.out.println("W porządku! Polecamy śledzić promocje na naszych Social Mediach. Do zobaczenia! ");
                System.exit(0);
            } else {
                System.out.println("Wybierz T lub N");
                System.out.println("Czy chcesz zamówić pizzę? T/N");
                input = myScanner.nextLine();
            }
        } while (!(input.toUpperCase().equals("T")));

        System.out.print("Podaj swoje imię: ");
        String customerName = myScanner.nextLine();

        Customer customer = new Customer(customerName); // Tworzy Klienta

        System.out.println("Wybierz sposób dostawy: ");
        System.out.println("1. Odbiór własny");
        System.out.println("2. Dostawa");
        String delivery;

        do {
            delivery = myScanner.nextLine();
            switch (delivery) {
                case "1":
                    System.out.println("Wyśmienicie! Zapraszamy po odbiór do naszej placówki przy ulicy Targowej.");
                    break;
                case "2":
                    System.out.println("Poinformuj nas gdzie dostarczyć Ci zamówienie. ");
                    String address = myScanner.nextLine();
                    customer.setAddress(address);
                    break;
                default:
                    System.out.println("Spróbuj wybrać ponownie sposób dostawy.");
                    break;
            }
        } while (!delivery.equals("1") && !delivery.equals("2"));

        //System.out.printf(customer.getName() + " " + customer.getAddress());
    }
}