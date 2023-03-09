package org.lessons.java;

import java.util.Arrays;

public class Snack3 {
    public static void main(String[] args) {
        /*
        * Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
         * */
        int[] allNumbers = new int[11];
        int sum = 0;

        for (int i = 0; i < allNumbers.length ; i++) {
            allNumbers[i] = i;
            if(i % 2 != 0){
                sum += i;
            }
        }

        System.out.println("Tutti i numeri: " + Arrays.toString(allNumbers));
        System.out.println("La somma dei numeri dispari: " + sum);
    }
}
