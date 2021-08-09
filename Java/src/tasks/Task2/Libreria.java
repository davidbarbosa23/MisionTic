package tasks.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Libreria {
    List items;

    private int choice = 0;
    private Scanner scan = new Scanner(System.in);

    public void listLibrary() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).toString());
        }
    }

    private void menu() {
        do {
            String option = scan.nextLine();
            choice = Integer.parseInt(option.substring(0, 1));

            if (choice == 1) {
                String[] params = option.split("_");

                if (new String(params[3]).equals("Libro")) {
                    Libro libro = new Libro(params[1], Integer.parseInt(params[2]), params[3], params[4]);
                    items.add(libro);
                }
                if (new String(params[3]).equals("Revista")) {
                    Revista revista = new Revista(params[1], Integer.parseInt(params[2]), params[3], Integer.parseInt(params[4]));
                    items.add(revista);
                }
            }
            if (choice == 2) {
                System.out.println("***Publicaciones disponibles***");
                listLibrary();
            }
        } while (choice != 3);
    }

    public Libreria() {
        items = new ArrayList<>();
        menu();
    }


}

/**
 // Submited

 import java.util.ArrayList;
 import java.util.List;
 import java.util.Scanner;

 public class Libreria {

     List items;

     private int choice = 0;
     private Scanner scan = new Scanner(System.in);

     public void listLibrary() {
         for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).toString());
         }
     }

     private void menu() {
         do {
             String option = scan.nextLine();
             choice = Integer.parseInt(option.substring(0, 1));

             if (choice == 1) {
                 String[] params = option.split("_");

                 if (new String(params[3]).equals("Libro")) {
                     Libro libro = new Libro(params[1], Integer.parseInt(params[2]), params[3], params[4]);
                     items.add(libro);
                 }
                 if (new String(params[3]).equals("Revista")) {
                     Revista revista = new Revista(params[1], Integer.parseInt(params[2]), params[3], Integer.parseInt(params[4]));
                     items.add(revista);
                 }
             }
             if (choice == 2) {
                 System.out.println("***Publicaciones disponibles***");
                 listLibrary();
             }
         } while (choice != 3);
     }

     public Libreria() {
        items = new ArrayList<>();
     }

     public static void main(String[] args) {
         Libreria libreria = new Libreria();
         libreria.menu();
     }
 }
*/