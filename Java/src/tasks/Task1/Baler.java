package tasks.Task1;

import java.util.Scanner;

public class Baler {
    public static int second(int muscleMass) {
        return muscleMass * 2 + 4;
    }

    public static int third(int muscleMass, int second) {
        return Math.floorDiv((muscleMass + second), 5);
    }

    public static String category(int third) {
        if (third < 20)
            return "uno";
        else if (third < 30)
            return "dos";
        else if (third < 50)
            return "tres";
        else
            return "cuatro";
    }

    public Baler() {
        Scanner scan = new Scanner(System.in);

        int muscleMass = scan.nextInt();
        int secondTest = second(muscleMass);
        int thirdTest = third(muscleMass, secondTest);

        String out = muscleMass + " " + secondTest + " " + thirdTest;
        String category = category(thirdTest);

        System.out.println(out);
        System.out.println(category);
    }
}

/**
 // Submited

 import java.util.Scanner;

 public class Main {
     public static int second(int muscleMass) {
        return muscleMass * 2 + 4;
     }

     public static int third(int muscleMass, int second) {
        return Math.floorDiv((muscleMass + second), 5);
     }

     public static String category(int third) {
         if (third < 20)
            return "uno";
         else if (third < 30)
            return "dos";
         else if (third < 50)
            return "tres";
         else
            return "cuatro";
     }

     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

         int muscleMass = scan.nextInt();
         int secondTest = second(muscleMass);
         int thirdTest = third(muscleMass, secondTest);

         String out = muscleMass + " " + secondTest + " " + thirdTest;
         String category = category(thirdTest);

         System.out.println(out);
         System.out.println(category);
     }
 }
 */
