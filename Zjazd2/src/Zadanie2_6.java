import java.util.Random;

public class Zadanie2_6 {

    int[][] myArray = new int[3][3];
    public void printArray() {

        Random random = new Random();

        // Wypełniamy tablicę wartościami losowymi z przedziału od 1 do 10.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                myArray[i][j] = random.nextInt(10) + 1;
            }
        }

        // Wyświetlamy tablicę na ekranie.
        System.out.println("Tablica przed zamianą:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }

        // Zamieniamy pierwszy wiersz z trzecim.
        int[] temp = myArray[0];
        myArray[0] = myArray[2];
        myArray[2] = temp;

        // Wyświetlamy zmienioną tablicę na ekranie.
        System.out.println("Tablica po zamianie:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
