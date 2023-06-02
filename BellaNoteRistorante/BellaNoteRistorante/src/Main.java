import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        boolean isDelivery = false;


        // Ekran powitalny
        System.out.println("Witamy w Bella Note Ristorante!");
        System.out.println("Korzystamy wyłącznie ze świeżych składników od lokalnych dostawców oraz oferujemy dostawy na terenie Gdańska.");
        System.out.println();
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
        Customer customer = new Customer(customerName);
        System.out.println();
        System.out.println("1. Odbiór własny 0 zł");
        System.out.println("2. Dostawa + 10 zł");
        System.out.print("Cześć " + customerName + "! Wybierz sposób dostawy: ");

        String delivery;
        do {
            delivery = myScanner.nextLine();
            switch (delivery) {
                case "1":
                    System.out.println("Wyśmienicie! Zapraszamy po odbiór do naszej placówki przy ulicy Targowej.");
                    isDelivery = false;
                    break;
                case "2":
                    System.out.println("Poinformuj nas gdzie dostarczyć Ci zamówienie. ");
                    isDelivery = true;
                    String address = myScanner.nextLine();
                    customer.setAddress(address);
                    break;
                default:
                    System.out.println("Spróbuj wybrać ponownie sposób dostawy.");
                    break;
            }
        } while (!delivery.equals("1") && !delivery.equals("2"));


        // Utworzenie dań
        Pizza vegepizza = new Pizza("Wegetariańska", HotLevel.MILD, "szpinak, pomidor, sos, ser");
        Pizza capriciosa = new Pizza("Capriciosa", HotLevel.MEDIUM, "pieczarki, szynka, sos, ser");
        Pizza pepperoni = new Pizza("Pepperoni", HotLevel.HOT, "salami, papryka, sos, ser");


        // Utworzenie MENU
        System.out.println();
        System.out.println("MENU");
        ArrayList<Pizza> menu = new ArrayList<>();
        menu.add(vegepizza);
        menu.add(capriciosa);
        menu.add(pepperoni);


        // Wyświetlenie MENU
        for (Pizza pizza: menu
             ) {
            System.out.println((menu.indexOf(pizza)+1) + ". " + pizza.get_pizzaType() + " " + pizza.getHotLevel() + " " + pizza.get_ingredients());
        }

        // Zamówienie
        int type;
        do {
            System.out.println();
            System.out.print("Wybierz rodzaj pizzy: ");
            type = myScanner.nextInt();
            if (type <= 0 || type > menu.size()) {
                System.out.print("Spróboj ponownie.");
            }
        } while (type <= 0 || type > menu.size());


        int pizzaCount;
        do {
            System.out.println();
            System.out.print("Podaj ilość ( max 10 ): ");
            pizzaCount = myScanner.nextInt();
        } while (pizzaCount <= 0 || pizzaCount >= 10);



        // Wyświetlanie rozmiarów pizzy
        System.out.println();
        System.out.println("Rozmiary pizzy: ");
        for (PizzaSize size : PizzaSize.values()) {
            System.out.println(size);
        }

        String pizzaSize;
        do {
            System.out.println();
            System.out.print("Wprowadź rozmiar pizzy słownie: ");
            pizzaSize = myScanner.next().toUpperCase();
        } while (!pizzaSize.equals("SMALL") && !pizzaSize.equals("MEDIUM") && !pizzaSize.equals("LARGE"));



        int result = 0;
        if (isDelivery == true) {
            result += 10;
        }
        // Wyświetlanie ceny za pizze - metoda statyczna
        int pizzaPrice = Pricing.getPriceForPizzaSize(menu.get(type-1).get_pizzaType(), PizzaSize.valueOf(pizzaSize));
        result += (pizzaPrice * pizzaCount);
        System.out.println();
        System.out.println("Kwota do zapłaty wynosi: " + result + "zł");
        System.out.println("Dziękujemy za zakupy i zapraszamy ponownie.");

    }
}