package main;

import tasks.Task1.Baler;
import tasks.Task2.Libreria;
import tasks.Task3.Bodega;

import java.util.Scanner;

public class Main {
    private static void menu() {
        int choice;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Select task");
            System.out.println("1. Baler task");
            System.out.println("2. Library task");
            System.out.println("3. Cell task");
            System.out.println("0. Out");

            String option = scan.nextLine();
            choice = Integer.parseInt(option.substring(0, 1));

            if (choice == 1) new Baler();
            if (choice == 2) new Libreria();
            if (choice == 3) new Bodega();

        } while (choice != 0);
    }

    public static void main(String[] args) {
        menu();
    }
}
