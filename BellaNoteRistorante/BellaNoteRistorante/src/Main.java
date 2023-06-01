import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);


        // Ekran powitalny
        /*System.out.println("Witamy w Bella Note Ristorante!");
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
                System.out.print("Czy chcesz zamówić pizzę? T/N ");
                input = myScanner.nextLine();
            }
        } while (!(input.toUpperCase().equals("T")));


        // Rejestracja Klienta oraz wybór dostawy z adresem
        System.out.print("Podaj swoje imię: ");
        String customerName = myScanner.nextLine();
        Customer customer1 = new Customer(customerName);
        System.out.println("Cześć " + customerName + "! Wybierz sposób dostawy: ");
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
                    customer1.setAddress(address);
                    break;
                default:
                    System.out.println("Spróbuj wybrać ponownie sposób dostawy.");
                    break;
            }
        } while (!delivery.equals("1") && !delivery.equals("2"));

*/
        // Utworzenie dań
        Pizza vegepizza = new Pizza("Wegetariańska", HotLevel.MILD, "szpinak, pomidor, sos, ser");
        Pizza capriciosa = new Pizza("Capriciosa", HotLevel.MEDIUM, "pieczarki, szynka, sos, ser");
        Pizza pepperoni = new Pizza("Pepperoni", HotLevel.HOT, "salami, papryka, sos, ser");


        // Utworzenie oraz wyświetlenie MENU
        System.out.println("MENU");
        ArrayList<Pizza> menu = new ArrayList<>();
        menu.add(vegepizza);
        menu.add(capriciosa);
        menu.add(pepperoni);
        for (Pizza pizza: menu
             ) {
            System.out.println((menu.indexOf(pizza)+1) + ". " + pizza.get_pizzaType() + " " + pizza.getHotLevel() + " " + pizza.get_ingredients());
        }

        System.out.print("Wybierz pizzę: ");
        int type = myScanner.nextInt();

        for (PizzaSize size : PizzaSize.values()) {
            System.out.println(size);
        }
        System.out.println();

        System.out.print("Wybierz rozmiar pizzy: ");
        int size = myScanner.nextInt();


        // Wyświetlanie ceny za pizze
        int price = Pricing.getPriceForPizzaSize(menu.get(type-1).get_pizzaType(), PizzaSize.LARGE);
        System.out.println(price);

    }
}