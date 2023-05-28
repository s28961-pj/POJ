import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner; // importuje bibliotekę Scanner do wprowadzania danych
public class Zjazd1 {
        public static void main(String[] args){

            // tworzymy nowy obiekt sc
            Scanner sc = new Scanner(System.in);

            // Zadanie 1
            /*
            System.out.println("**Zadanie 1**\n" +
                    "Napisz program, który obliczy pole prostokąta o bokach a i b, wprowadzonych wcześniej przez użytkownika (każda wartość będzie znajdować się w osobnej linii).");

            System.out.println("Wprowadź długość boków prostokąta: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            String result = "Pole prostokąta wynosi: " + (float) (a * b);
            System.out.println(result); */

            // Zadanie 2
            /*
            System.out.println("**Zadanie 2**\n" +
                    "Napisz program, który wyświetla na ekranie komputera pierwiastek kwadratowy z wartości liczby pi z dokładnością do dwóch miejsc po przecinku.");
            double pi = Math.PI;
            double pierwiastek = Math.sqrt(pi);
            String wynik = String.format("%.2f", pierwiastek);
            System.out.println(wynik); */

            // Zadanie 3
            /*
            System.out.println("**Zadanie 3**\n" +
                    "Napisz program, który pobierze od użytkownika dwa ciągi tekstowe (rozdzielone znakiem spacji) " +
                    "napis1 oraz napis2\n, a następnie wyświetli ciąg tekstowy w następującym formacie: " +
                    "`\"%napis2 napis1%\"`.\n" +
                    ">WEJŚCIE:\n" +
                    "ala ma\n" +
                    "WYJŚCIE:\n" +
                    "\"%ma ala%\"");
            String napis1 = sc.next();
            String napis2 = sc.next();
            System.out.println("\"%" + napis2 + " " + napis1 + "%\""); */

            // Zadanie 4
            /*
            System.out.println("**Zadanie 4**\n" +
                    "\n" +
                    "Napisz program, który dla trzech boków a,b,c podanych wcześniej przez użytkownika stwierdzi czy da się z tych boków zbudować trójkąt. \n" +
                    "Trójkąt da się zbudować z boków a,b,c wtedy i tylko wtedy gdy zachodzą następujące warunki:\n" +
                    "a+b>c\n" +
                    "a+c>b\n" +
                    "b+c>a\n" +
                    "W przypadku wprowadzenia niepoprawnych danych program ma wyrzucić komunikat: BŁĄD.\n" +
                    "\n" +
                    ">WEJŚCIE:\n" +
                    "1 2 3\n" +
                    "WYJŚCIE:\n" +
                    "NIE\n" +
                    "WEJŚCIE:\n" +
                    "2 2 2\n" +
                    "WYJŚCIE:\n" +
                    "TAK\n" +
                    "WEJŚCIE:\n" +
                    "1 -2 3\n" +
                    "WYJŚCIE:\n" +
                    "BŁĄD");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a > 0 && b > 0 && c > 0) {
                if ((a + b > c) && (a + c > b) && (b + c > a)) {
                    System.out.println("TAK");
                } else {
                    System.out.println("NIE");
                }
            } else {
                System.out.println("BŁĄD");
            } */

            // Zadanie 5
            /*
            System.out.println("**Zadanie 5**\n" +
                    "Napisz program, który dla podanej liczby z odpowiedniego zakresu wyświetli jaki to miesiąc i ile ma on dni.\n" +
                    "Zakładamy, że rok tutaj nie jest przestępny.\n" +
                    "W przypadku niepoprawnych danych program ma wypisać komunikat: BŁĄD.\n" +
                    "Użyj słowa kluczowego switch.\n" +
                    ">WEJŚCIE:\n" +
                    "1\n" +
                    "WYJŚCIE:\n" +
                    "Styczeń: 31 dni\n");
            int miesiac = sc.nextInt();
            switch (miesiac) {
                case 1: {
                    System.out.println("Styczeń: 31 dni\n");
                    break;
                }
                case 2: {
                    System.out.println("Luty: 28 dni\n");
                    break;
                }
                case 3: {
                    System.out.println("Marzec: 31 dni\n");
                    break;
                }
                case 4: {
                    System.out.println("Kwiecień: 30 dni\n");
                    break;
                }
                case 5: {
                    System.out.println("Maj: 31 dni\n");
                    break;
                }
                case 6: {
                    System.out.println("Czerwiec: 30 dni\n");
                    break;
                }
                case 7: {
                    System.out.println("Lipiec: 31 dni\n");
                    break;
                }
                case 8: {
                    System.out.println("Sierpień: 31 dni\n");
                    break;
                }
                case 9: {
                    System.out.println("Wrzesień: 30 dni\n");
                    break;
                }
                case 10: {
                    System.out.println("Październik: 31 dni\n");
                    break;
                }
                case 11: {
                    System.out.println("Listopad: 30 dni\n");
                    break;
                }
                case 12: {
                    System.out.println("Grudzień: 31 dni\n");
                    break;
                }
                default: {
                    System.out.println("BŁĄD");
                }
            } */

            // Zadanie 6
            /*
            System.out.println("**Zadanie 6**\n" +
                    "Napisz program, który pobierze trzy liczby rzeczywiste, a następnie wyświetli je w kolejności od najmniejszej do największej, " +
                    "a potem od największej do najmniejszej. Nie używaj tutaj żadnych dostępnych metod sortujących.\n" +
                    ">WEJŚCIE:\n" +
                    "1 2 3\n" +
                    "WYJŚCIE:\n" +
                    "1.000000 2.000000 3.000000\n" +
                    "3.000000 2.000000 1.000000");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            ArrayList<Double> myList = new ArrayList<>();
            myList.add(a);
            myList.add(b);
            myList.add(c);
            Collections.sort(myList);
            System.out.println("Ascending list: ");
            for (double x: myList) {
                System.out.print(String.format("%.6f", x) + " ");
            }

            System.out.println("\nDescending list: ");
            Collections.reverse(myList);
            for (double x: myList) {
                System.out.print(String.format("%.6f", x) + " ");
            } */

            // Zadanie 7
            /*
            System.out.println("**Zadanie 7**\n" +
                    "Napisz program, który zadeklaruje dwie tablice typu int, następnie wczyta liczby naturalne n i m, wczyta do pierwszej tablicy n liczb, następnie wczyta m liczb do drugiej tablicy (wcześniej trzeba te tablice utworzyć), a następnie wykona iloczyn skalarny tych tablic zgodnie z wzorem:\n" +
                    "$$\\sum_{i=1}^{n} A[i] \\cdot B[i]$$\n" +
                    "Zastanów się, co w przypadku gdy n<m lub m<n.\n" +
                    "W przypadku podania jakikolwiek błędnych danych program wypisuje komunikat BŁĄD, a następnie kończy działanie.\n" +
                    ">WEJŚCIE:\n" +
                    "2 2\n" +
                    "1 1\n" +
                    "2 2\n" +
                    "WYJŚCIE:\n" +
                    "4");

            System.out.println("Podaj 2 liczby naturalne n i m: ");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("BŁĄD");
                System.exit(0);
            }
            int[] arr1 = new int[n];

            int m = sc.nextInt();
            if (m != n) {
                System.out.println("BŁĄD");
                System.exit(0);
            }
            int[] arr2 = new int[m];

            System.out.println("Wprowadź liczby do tablicy1: ");
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }

            System.out.println("Wprowadź liczby do tablicy2: ");
            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }

            int result = 0;
            for (int i = 0; i < n; i++) {
                result += arr1[i] * arr2[i];
            }

            System.out.println("Iloczyn skalarny wynosi: ");
            System.out.print(result); */


            // Zadanie 8
            /*
            System.out.println("**Zadanie 8**\n" +
                    "Napisz program, który dla liczby naturalnej n wypisze poniższe wzory (jeden pod drugim).\n" +
                    "W przypadku niepoprawnych danych program ma ponownie je wczytać.\n" +
                    "Zakładamy, że na końcu linii jest wyłącznie znak nowej linii.\n" +
                    ">WEJŚCIE:\n" +
                    "3\n" +
                    "WYJŚCIE:\n" +
                    "*\n" +
                    "**\n" +
                    "***\n" +
                    "***\n" +
                    "**\n" +
                    "*\n" +
                    "***\n" +
                    " **\n" +
                    "  *\n" +
                    "  *\n" +
                    " **\n" +
                    "***  ");

            System.out.print("Podaj liczbe naturalną: ");
            int a = sc.nextInt();
            while (a <= 0 ) {
                System.out.print("Błąd. Spróbuj ponownie: ");
                a = sc.nextInt();
            }
            String result = "*";

            for (int i = 0; i < a; i++) {
                System.out.println();
                for (int j = 0; j <= i; j++) {
                    System.out.print(result);
                }
            }
            for (int i = a; i > 0; i--) {
                System.out.println();
                for (int j = i; j > 0; j--) {
                    System.out.print(result);
                }
            }
            System.out.println();

            for (int i = a; i >= 1; i--) {
                for (int j = 1; j <= a - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = a; i >= 1; i--) {
                for (int j = 2; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= a - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } */


            // Zadanie 9
            /*
            System.out.println("**Zadanie 9**\n" +
                    "Napisz funkcje, a następnie program, który sprawdzi czy dane słowo jest palindromem.\n" +
                    "Palindrom to słowo, które zapisane wspak jest takim samym słowem.\n" +
                    "Przykładem palindromu jest słowo: kajak.\n" +
                    "Znaki wczytujemy do tablicy statycznej typu char (zakładamy dla prostoty, że tablica ta jest 100-elementowa, następnie wczytujemy znaki, aż do napotkania końca znaku pliku (można to wywołać przy pomocy kombinacji klawiszy ctrl+d).\n" +
                    "Zakładamy, że wszystkie znaki są z małej litery (nie rozpatrujemy przypadku, że występują duże litery).\n" +
                    "Jako rezultat program ma wypisać komunikat TAK, jeśli jest to palindrom lub NIE w przeciwnym przypadku.\n" +
                    ">WEJŚCIE:\n" +
                    "kajak\n" +
                    "WYJŚCIE:\n" +
                    "TAK");

            System.out.print("Podaj słowo: ");
            char[] input = sc.nextLine().toCharArray();

            for (int i = 0; i < input.length; i++) {
                if (input[i] == input[input.length-1-i]) {
                    System.out.println("TAK");
                    break;
                } else {
                    System.out.println("NIE");
                    break;
                }
            } */


            // Zadanie 10
            /*
            System.out.println("**Zadanie 10**\n" +
                    "Napisz program, który będzie miał utworzoną statycznie tablicę dwuwymiarową o wymiarach $$a \\times b$$.\n" +
                    "Następnie program ma pobrać od użytkownika liczby a i b, które mają oznaczać ilość wierszy oraz kolumn tablicy.\n" +
                    "Następnie ma pobrać a×b liczb i wypisać transpozycję tej macierzy (patrz poniższy test).\n" +
                    "Transpozycja oznacza, że wypisujemy najpierw kolumny, a potem wiersze danej macierzy.\n" +
                    "W przypadku sytuacji błędnych program ma wypisać komunikat: BŁĄD i zakończyć działanie.\n" +
                    ">WEJŚCIE:\n" +
                    "6 2\n" +
                    "95 89\n" +
                    "100 10\n" +
                    "77 19\n" +
                    "94 59\n" +
                    "2 91\n" +
                    "11 90\n" +
                    "WYJŚCIE:\n" +
                    "95 100 77 94 2 11\n" +
                    "89 10 19 59 91 90");

            System.out.print("Podaj wymiary tablicy a x b: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[][] input = new int[a][b];

            System.out.println("Uzupełnij tablicę (macierz) liczbami: ");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    input[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.print(input[j][i] + " ");
                }
                System.out.println();
            } */

            // Zadanie 11 - nie działa
            /*
            System.out.println("**Zadanie 11**\n" +
                    "Pangramem nazywamy tekst, w którym każda litera alfabetu łacińskiego występuje przy najmniej raz.\n" +
                    "Najpopularniejszym pangramem w języku angielskim jest zdanie:\n" +
                    "The quick brown fox jumps over the lazy dog.\n" +
                    "Napisz funkcje a następnie program, który sprawdzi czy dany tekst jest pangramem.\n" +
                    "W przypadku pozytywnej odpowiedzi program powinien wyświetlić wartość true, w przeciwnym przypadku program powinien wyrzucić wartość false.\n" +
                    "Rozważ różne przypadki i wielkość liter (która nie powinna mieć znaczenia)!!!\n" +
                    ">WEJŚCIE:\n" +
                    "The quick brown fox jumps over the lazy dog\n" +
                    "WYJŚCIE:\n" +
                    "true\n");

            String alphabetLetters = "Abcdefghijklmnopqrstuvwxyz";
            alphabetLetters.toLowerCase();
            System.out.println("Podaj słowo: ");
            String input = sc.nextLine().toLowerCase();

            boolean isPangram = false;

            for (int i = 0; i <= 3; i++) {
                System.out.println(i);
                // indexOf(int i) - returns '-1' when substring not found
                if( input.indexOf( alphabetLetters.charAt(i) ) != -1 ) {
                    isPangram = true;
                } else {
                    isPangram = false;
                    break;
                }
            }

            System.out.println(isPangram); */

            // Zadanie 12
            /* System.out.println("**Zadanie 12**\n" +
                    "Jeżeli podamy wiek w sekundach, to jest możliwość obliczenia ile osoba ta ma lat na ziemi.\n" +
                    "Kula ziemska przechodzi przez własną orbitę przez 365,25 dnia, które wynosi równo 31557600 sekund.\n" +
                    "A więc jeżeli osoba ma 1000000000 sekund to łatwo można policzyć, że 1000000000/31557600 = 31,69 lat (w przybliżeniu do drugiego miejsca po przecinku).\n" +
                    "Teraz rozpatrzmy metodę, która będzie przyjmowała wiek w sekundach oraz planetę którą chcemy obliczyć.\n" +
                    "Napisz funkcje, a następnie program, który będzie zawierał tę metodę uwzględniając poniższe dane dotyczące innych planet:\n" +
                    "Obrót Merkurego podczas własnej orbity wynosi 0.2408467 lat ziemskich\n" +
                    "Obrót Wenus podczas własnej orbity wynosi 0.61519726 lat ziemskich\n" +
                    "Obrót Marsa podczas własnej orbity wynosi 1.8808158 lat ziemskich\n" +
                    "Obrót Jowisza podczas własnej orbity wynosi 11.862615 lat ziemskich\n" +
                    "Obrót Saturna podczas własnej orbity wynosi 29.447498 lat ziemskich\n" +
                    "Obrót Uranu podczas własnej orbity wynosi 84.016846 lat ziemskich\n" +
                    "Obrót Neptuna podczas własnej orbity wynosi 164.79132 lat ziemskich\n" +
                    ">WEJŚCIE:\n" +
                    "1000000000\n" +
                    "Ziemia\n" +
                    "WYJŚCIE:\n" +
                    "31.69"); */

            // Zadanie 13
            /* System.out.println("**Zadanie 13**\n" +
                    "Napisz rekurencyjną funkcję, która dla danej tablicy jednowymiarowej wyznaczy element największy tej tablicy.\n" +
                    "\n" +
                    ">WEJŚCIE:\n" +
                    "5\n" +
                    "1 2 4 7 3\n" +
                    "WYJŚCIE:\n" +
                    "7"); */

            // Zadanie 14
            /* System.out.println("**Zadanie 14**\n" +
                    "Dowolne zadanie skompiluj i uruchom przy pomocy narzędzi javac oraz java.");

            System.out.println("javac Zjazd1.java");
            System.out.println("java Zjazd1"); */


            // Zadanie 15
            /* System.out.println("**Zadanie 15** \n" +
                    "Wrzuć zadania do wskazanego repozytorium w serwisie github.com pod adresem: link_do_repozytorium.");

            String link = "https://github.com/s28961-pj/POJ/tree/main/Zjazd1";
            System.out.println(link); */
        }
}
