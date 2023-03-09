package org.lessons.java;

import java.util.Arrays;

public class Snack4 {
    public static void main(String[] args) {
        /*
        * Crea due array che hanno un numero di elementi diversi.
        * Mostra a video dei nuovi elementi random finchè il numero di elementi presenti nell’array che ne ha di meno
        * + quelli mostrati a video non è uguale al numero di elementi presenti nell’array che ne ha di più
        * */

        String[] array1 = {"Walter White 0", "Jessie Pinkman 1", "Saul Goodman 2", "Gustavo Fring 3", "Tuco Salamanca 4", "Skyler White 5"};
        String[] array2 = {"Ted Mosby", "Barney Stinson", "Robin Scherbatsky"};

        System.out.println(Arrays.toString(array1));

        for (int i = 0; i < array1.length; i++) {
            if (i < array2.length){
                System.out.print(array2[i] + " " + i + ", ");
            } else {
                System.out.print("Altri personaggi di How I Met Your Mother " + i + ", ");
            }
        }


    }
}
