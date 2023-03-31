import java.util.Scanner;  // Import the Scanner class
public class Zadanie2_2 {
    String firstname;
    String lastname;
    String group;
    String fieldOfStudy;

    public void myMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        this.firstname = sc.nextLine();
        System.out.println("Podaj nazwisko: ");
        this.lastname = sc.nextLine();
        System.out.println("Podaj grupę: ");
        this.group = sc.nextLine();
        System.out.println("Podaj kierunek: ");
        this.fieldOfStudy = sc.nextLine();

        System.out.println("imie: " + firstname);
        System.out.println("nazwisko: " + lastname);
        System.out.println("grupa: " + group);
        System.out.println("kierunek studiów: " + fieldOfStudy);
    }
}
