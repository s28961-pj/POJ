package Zad5_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> cars = new ArrayList<Integer>();
        long actualTime = System.currentTimeMillis();
        for (int i = 1; cars.size() < 50; i++) {
            if (i%2==0) {
                cars.add(i);
            }
        }
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("[%d]: %d".formatted(i,cars.get(i)));
        }
        long executionTime = actualTime - System.currentTimeMillis();
        System.out.println("Execution time: %d ms".formatted(executionTime));
    }
}