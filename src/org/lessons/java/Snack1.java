package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        /*
            Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int userNumber = Integer.parseInt(scan.nextLine());
        scan.close();

        if (userNumber % 2 == 0){
            System.out.println("Il numero è pari");
        } else {
            System.out.println("Il numero è dispari, il suo numero successivo è " + ++userNumber);
        }
    }
}
