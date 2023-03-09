package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        /*
        * Generatore di “nomi cognomi” casuali:
        * il Grande Gatsby ha una lista di nomi e una lista di cognomi,
        * e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
        * */
        Random random = new Random();


        String[] guestsName = {"Pippo", "Albano", "Maurizio"};
        String[] guestsSurname = {"Franco", "Carrisi", "Costanzo"};

        String[] fakeNames = new String[3];
        int maxRandomValue = fakeNames.length - 1;

        for (int i = 0; i < fakeNames.length ; i++) {
            fakeNames[i] = guestsName[random.nextInt(maxRandomValue)] + " " + guestsSurname[random.nextInt(maxRandomValue)];
        }

        System.out.println(Arrays.toString(fakeNames));
    }
}
